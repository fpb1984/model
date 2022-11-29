package cl.fiscalia.rgp.causapenal.model;

import java.io.Serializable;

public class Diligencia implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	private Long id;
	
	private String codigo;
	
	private String descripcion;
	
	public Diligencia() {
	}
	
	public Diligencia(Long id, String codigo, String descripcion) {
		super();
		this.id = id;
		this.codigo = codigo;
		this.descripcion = descripcion;
	}


	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}


	public String getCodigo() {
		return codigo;
	}


	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}


	public String getDescripcion() {
		return descripcion;
	}


	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}


}
