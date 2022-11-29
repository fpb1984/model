package cl.fiscalia.rgp.causapenal.model;

import java.io.Serializable;
import java.util.Date;
import org.kie.api.remote.Remotable;
import cl.fiscalia.rgp.causapenal.model.tipo.Institucion;


@Remotable
public class InstruccionDiligencia implements Serializable{

	private static final long serialVersionUID = 1L;

	private Long id;
	private Diligencia diligencia;
	private Date fechaInstruccion;
	private Date fechaPlazo;
	private String observaciones;
	private String especificaciones;
	private Institucion tipoInstitucionEjecutora;
	private String nombreInstitucionEjecutora;
	private String ambito;
	private String referencia;
	private String estado;
	private boolean solicitado;
	
	
	
	public InstruccionDiligencia() {}
	

	public InstruccionDiligencia(Long id, Diligencia deligencia, Date fechaInstruccion, Date fechaPlazo,
			String observaciones, String especificaciones, Institucion tipoInstitucionEjecutora,
			String nombreInstitucionEjecutora, String ambito, String referencia, String estado, boolean solicitado) {
		super();
		this.id = id;
		this.diligencia = deligencia;
		this.fechaInstruccion = fechaInstruccion;
		this.fechaPlazo = fechaPlazo;
		this.observaciones = observaciones;
		this.especificaciones = especificaciones;
		this.tipoInstitucionEjecutora = tipoInstitucionEjecutora;
		this.nombreInstitucionEjecutora = nombreInstitucionEjecutora;
		this.ambito = ambito;
		this.referencia = referencia;
		this.estado = estado;
		this.solicitado = solicitado;
	}



	public Diligencia getDiligencia() {
		return diligencia;
	}

	public void setDiligencia(Diligencia deligencia) {
		this.diligencia = deligencia;
	}

	public Date getFechaInstruccion() {
		return fechaInstruccion;
	}

	public void setFechaInstruccion(Date fechaInstruccion) {
		this.fechaInstruccion = fechaInstruccion;
	}

	public Date getFechaPlazo() {
		return fechaPlazo;
	}

	public void setFechaPlazo(Date fechaPlazo) {
		this.fechaPlazo = fechaPlazo;
	}

	public String getObservaciones() {
		return observaciones;
	}

	public void setObservaciones(String observaciones) {
		this.observaciones = observaciones;
	}

	public String getEspecificaciones() {
		return especificaciones;
	}

	public void setEspecificaciones(String especificaciones) {
		this.especificaciones = especificaciones;
	}

	public Institucion getTipoInstitucionEjecutora() {
		return tipoInstitucionEjecutora;
	}

	public void setTipoInstitucionEjecutora(Institucion tipoInstitucionEjecutora) {
		this.tipoInstitucionEjecutora = tipoInstitucionEjecutora;
	}

	public String getNombreInstitucionEjecutora() {
		return nombreInstitucionEjecutora;
	}

	public void setNombreInstitucionEjecutora(String nombreInstitucionEjecutora) {
		this.nombreInstitucionEjecutora = nombreInstitucionEjecutora;
	}

	public String getAmbito() {
		return ambito;
	}

	public void setAmbito(String ambito) {
		this.ambito = ambito;
	}

	public String getReferencia() {
		return referencia;
	}

	public void setReferencia(String referencia) {
		this.referencia = referencia;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}


	public boolean isSolicitado() {
		return solicitado;
	}


	public void setSolicitado(boolean solicitado) {
		this.solicitado = solicitado;
	}
	
	

}
