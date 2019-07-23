package pe.edu.unsch.entities;

public class Item {
	
	private Entrada entrada;
	private int quantity;
	
	public Item() {
		super();
	}
	
	public Item(Entrada entrada, int quantity) {
		super();
		this.entrada = entrada;
		this.quantity = quantity;
	}
	
	public Entrada getProduct() {
		return entrada;
	}
	public void setProduct(Entrada entrada) {
		this.entrada = entrada;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

}
