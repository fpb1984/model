package cl.fiscalia.rgp.causapenal.model;

import java.io.Serializable;
import org.kie.api.remote.Remotable;
import cl.fiscalia.rgp.causapenal.model.tipo.TipoDocumental;

@Remotable
public class Documento implements Serializable{

	private static final long serialVersionUID = 1L;

	private Long id;
	private TipoDocumental tipoDocumental;
	private String nombre;
	private String descripcion;
	private String archivo;
	
	
	public Documento() {}
	
	public Documento(Long id, TipoDocumental tipoDocumental, String nombre, String descripcion, String archivo) {
		super();
		this.id = id;
		this.tipoDocumental = tipoDocumental;
		this.nombre = nombre;
		this.descripcion = descripcion;
		this.archivo = archivo;
	}





	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public TipoDocumental getTipoDocumental() {
		return tipoDocumental;
	}


	public void setTipoDocumental(TipoDocumental tipoDocumental) {
		this.tipoDocumental = tipoDocumental;
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


	public String getArchivo() {
		return archivo;
	}


	public void setArchivo(String archivo) {
		this.archivo = archivo;
	}



	@Override
	public String toString() {
		return "Documento [id=" + id + ", tipoDocumental=" + tipoDocumental + ", nombre=" + nombre + ", descripcion="
				+ descripcion + ", archivo=" + archivo + "]";
	}
	
	
	
	
}
