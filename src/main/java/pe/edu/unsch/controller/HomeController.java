package pe.edu.unsch.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@Controller
public class HomeController {

	// @Autowired
	// private CategorySevice categoryService;

	@GetMapping({ "/", "/home" })
	// @RequestMapping(value = "/home", method = RequestMethod.GET)
	public String home(Model model) {
		// model.addAttribute("categories", categoryService.findAll());
		return "views/public/home/index";
	}

}
