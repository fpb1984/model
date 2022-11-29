package cl.fiscalia.rgp.causapenal.model.tipo;

import java.io.Serializable;

public class TipoDocumento implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	private Long id;
	
	private String nombre;
	
	public TipoDocumento() {
	}
	
	public TipoDocumento(Long id, String nombre) {
		this.id = id;
		this.nombre = nombre;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@Override
	public String toString() {
		return "TipoDocumento [id=" + id + ", nombre=" + nombre + "]";
	}

	
}
