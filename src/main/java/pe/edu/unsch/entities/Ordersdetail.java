package pe.edu.unsch.entities;

import java.math.BigDecimal;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


@Entity
@Table(name = "ordersdetail", catalog = "bdentrada")
public class Ordersdetail implements java.io.Serializable {

	private Integer idordersdetail;
	private Orders orders;
	private Entrada entrada;
	private long price;
	private int quantity;

	public Ordersdetail() {
	}

	public Ordersdetail(Orders orders, Entrada entrada, long price, int quantity) {
		this.orders = orders;
		this.entrada = entrada;
		this.price = price;
		this.quantity = quantity;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)

	@Column(name = "idordersdetail", unique = true, nullable = false)
	public Integer getIdordersdetail() {
		return this.idordersdetail;
	}

	public void setIdordersdetail(Integer idordersdetail) {
		this.idordersdetail = idordersdetail;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "idorders", nullable = false)
	public Orders getOrders() {
		return this.orders;
	}

	public void setOrders(Orders orders) {
		this.orders = orders;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "identrada", nullable = false)
	public Entrada getEntrada() {
		return this.entrada;
	}

	public void setEntrada(Entrada entrada) {
		this.entrada = entrada;
	}

	@Column(name = "price", nullable = false, precision = 18)
	public long getPrice() {
		return this.price;
	}

	public void setPrice(long price) {
		this.price = price;
	}

	@Column(name = "quantity", nullable = false)
	public int getQuantity() {
		return this.quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

}
