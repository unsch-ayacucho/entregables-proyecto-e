package pe.edu.unsch.controller;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import pe.edu.unsch.entities.Account;
import pe.edu.unsch.entities.Item;
import pe.edu.unsch.entities.Orders;
import pe.edu.unsch.entities.Ordersdetail;
import pe.edu.unsch.service.AccountService;
import pe.edu.unsch.service.EntradaService;
import pe.edu.unsch.service.OrdersDetailService;
import pe.edu.unsch.service.OrdersService;


@Controller
@RequestMapping("/home")
public class Checkout1Controller {
	
	@Autowired
	private EntradaService productService;
	
	@Autowired
	private OrdersService ordersService;
	
	@Autowired
	private AccountService accountService;
	
	@Autowired
	private OrdersDetailService ordersDetailService;
	
	@Autowired
	private EntradaService entradService;
	
	@GetMapping
	public String checkout1(Model model) {
		model.addAttribute("titulo", "Cart : e-commerce");
		return "views/public/home/compra/checkout1";
	}
	
	@GetMapping("/buy/{id}")
	public String add(@PathVariable("id") int id, HttpSession session, Model model) {
		
		model.addAttribute("titulo", "checkout1 : e-commerce");
		
		if (session.getAttribute("checkout1") == null) {
			List<Item> cart = new ArrayList<Item>();
			cart.add(new Item(productService.find(id), 1));
			session.setAttribute("checkout1", cart);
		} else {
			List<Item> cart = (List<Item>) session.getAttribute("checkout1");
			int index = isEXists(id, session);
			
			if(index == -1) {
				cart.add(new Item(entradService.find(id), 1));
			} else {
				int quantity = cart.get(index).getQuantity() + 1;
				cart.get(index).setQuantity(quantity);
				session.setAttribute("checkout1", cart); 
			}
			session.setAttribute("checkout1", cart);
		}
		
		return "views/public/compra/checkout1";
	}
	
	@GetMapping("delete/{index}")
	public String delete(@PathVariable("index") int index, HttpSession session) {
		List<Item> cart = (List<Item>) session.getAttribute("checkout1");
		cart.remove(index);
		session.setAttribute("checkout1", cart);
		return "redirect:/checkout1";
	}

	private int isEXists(int id, HttpSession session) {
		List<Item> checkout1 = (List<Item>) session.getAttribute("checkout1");
		
		for (int i = 0; i < checkout1.size(); i++) {
			if (checkout1.get(i).getEntrada().getIdentrada() == id) {
				return i;
			}
		}
		
		return -1;
	}
	
	@PostMapping("/entrada")
	public String checkout(Model model, HttpSession session) {
		model.addAttribute("titulo", "Checkout : e-commerce");
		model.addAttribute("account", new Account());
		
		if (session.getAttribute("email") == null) {
			return "redirect:/account/register";
		} else {

			Orders orders = new Orders();
			
			Account account = accountService.find(session.getAttribute("email").toString());
			System.out.println(session.getAttribute("email").toString());
			
			orders.setAccount(account);

			orders.setDatecreation(new Date());
			orders.setName("New order");
			orders.setStatus((byte)0);
			Orders newOrder = ordersService.create(orders);
			
	
			List<Item> cart = (List<Item>) session.getAttribute("checkout1");

			for (Item item : cart) {
				
				System.out.println("Orders detail " + newOrder.getIdorders());

				Ordersdetail ordersdetail = new Ordersdetail();
				ordersdetail.setOrders(newOrder);
				ordersdetail.setEntrada(item.getEntrada());

			

				ordersdetail.setQuantity(item.getQuantity());
				ordersDetailService.create(ordersdetail);
			}
			
		
			session.removeAttribute("checkout1");
			return "views/public/compra/checkout1";
		}
	}

}
