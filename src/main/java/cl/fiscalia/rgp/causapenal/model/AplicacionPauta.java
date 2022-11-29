package cl.fiscalia.rgp.causapenal.model;

import java.io.Serializable;
import org.kie.api.remote.Remotable;


@Remotable
public class AplicacionPauta implements Serializable{

	private static final long serialVersionUID = 1L;

	private Long id;
	private String nombre;
	private String descripcion;

	
	public AplicacionPauta(){}
	
	public AplicacionPauta(Long id, String nombre, String descripcion) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.descripcion = descripcion;
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


	public String getDescripcion() {
		return descripcion;
	}


	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}


	@Override
	public String toString() {
		return "AplicacionPauta [id=" + id + ", nombre=" + nombre + ", descripcion=" + descripcion + "]";
	}

}
