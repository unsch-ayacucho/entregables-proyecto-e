package pe.edu.unsch.entities;
// Generated 08-jul-2019 21:50:23 by Hibernate Tools 5.3.0.Beta2

import java.util.Date;

/**
 * Servicio generated by hbm2java
 */
public class Servicio implements java.io.Serializable {

	private Integer idservicio;
	private Categoria categoria;
	private String titulo;
	private String subtitulo;
	private Date fecha1;
	private Date fecha2;
	private String descripcion;
	private String imagen;

	public Servicio() {
	}

	public Servicio(Categoria categoria, String titulo, String subtitulo, Date fecha1, Date fecha2, String descripcion,
			String imagen) {
		this.categoria = categoria;
		this.titulo = titulo;
		this.subtitulo = subtitulo;
		this.fecha1 = fecha1;
		this.fecha2 = fecha2;
		this.descripcion = descripcion;
		this.imagen = imagen;
	}

	public Integer getIdservicio() {
		return this.idservicio;
	}

	public void setIdservicio(Integer idservicio) {
		this.idservicio = idservicio;
	}

	public Categoria getCategoria() {
		return this.categoria;
	}

	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}

	public String getTitulo() {
		return this.titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getSubtitulo() {
		return this.subtitulo;
	}

	public void setSubtitulo(String subtitulo) {
		this.subtitulo = subtitulo;
	}

	public Date getFecha1() {
		return this.fecha1;
	}

	public void setFecha1(Date fecha1) {
		this.fecha1 = fecha1;
	}

	public Date getFecha2() {
		return this.fecha2;
	}

	public void setFecha2(Date fecha2) {
		this.fecha2 = fecha2;
	}

	public String getDescripcion() {
		return this.descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public String getImagen() {
		return this.imagen;
	}

	public void setImagen(String imagen) {
		this.imagen = imagen;
	}

}
