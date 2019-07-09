package pe.edu.unsch.entities;
// Generated 08-jul-2019 21:50:23 by Hibernate Tools 5.3.0.Beta2

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * Pago generated by hbm2java
 */
public class Pago implements java.io.Serializable {

	private Integer idpago;
	private int numerotarjeta;
	private Date fecha;
	private int cvv;
	private String nombre;
	private String apellido;
	private String correo;
	private Set compradors = new HashSet(0);

	public Pago() {
	}

	public Pago(int numerotarjeta, Date fecha, int cvv, String nombre, String apellido, String correo) {
		this.numerotarjeta = numerotarjeta;
		this.fecha = fecha;
		this.cvv = cvv;
		this.nombre = nombre;
		this.apellido = apellido;
		this.correo = correo;
	}

	public Pago(int numerotarjeta, Date fecha, int cvv, String nombre, String apellido, String correo, Set compradors) {
		this.numerotarjeta = numerotarjeta;
		this.fecha = fecha;
		this.cvv = cvv;
		this.nombre = nombre;
		this.apellido = apellido;
		this.correo = correo;
		this.compradors = compradors;
	}

	public Integer getIdpago() {
		return this.idpago;
	}

	public void setIdpago(Integer idpago) {
		this.idpago = idpago;
	}

	public int getNumerotarjeta() {
		return this.numerotarjeta;
	}

	public void setNumerotarjeta(int numerotarjeta) {
		this.numerotarjeta = numerotarjeta;
	}

	public Date getFecha() {
		return this.fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	public int getCvv() {
		return this.cvv;
	}

	public void setCvv(int cvv) {
		this.cvv = cvv;
	}

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return this.apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getCorreo() {
		return this.correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}

	public Set getCompradors() {
		return this.compradors;
	}

	public void setCompradors(Set compradors) {
		this.compradors = compradors;
	}

}