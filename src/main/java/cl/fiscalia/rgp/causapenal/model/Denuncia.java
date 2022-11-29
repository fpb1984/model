package cl.fiscalia.rgp.causapenal.model;

import java.io.Serializable;
import java.util.Date;

import cl.fiscalia.rgp.causapenal.model.tipo.Institucion;
import cl.fiscalia.rgp.causapenal.model.tipo.MedioRecepcion;
import cl.fiscalia.rgp.causapenal.model.tipo.TipoDenuncia;
import cl.fiscalia.rgp.causapenal.model.tipo.UnidadPolicialOrganismo;
import org.kie.api.remote.Remotable;


@Remotable
public class Denuncia implements Serializable {

	private static final long serialVersionUID = 1L;

	private Long id;
	private Institucion institucion;
	private UnidadPolicialOrganismo unidadPolicialOrganismo;
	private MedioRecepcion medioRecepcion;
	private TipoDenuncia tipoDenuncia;
	private Date fechaParteDenuncia;
	private String numeroParteDenuncia;
	private boolean denunciaReservada;
	private Date fechaIngresoFiscalia;
	//private Fiscalia fiscalia;
	
	
	public Denuncia() {}


	public Denuncia(Long id, Institucion institucion, UnidadPolicialOrganismo unidadPolicialOrganismo,
			MedioRecepcion medioRecepcion, TipoDenuncia tipoDenuncia, Date fechaParteDenuncia,
			String numeroParteDenuncia, boolean denunciaReservada, Date fechaIngresoFiscalia) {
		super();
		this.id = id;
		this.institucion = institucion;
		this.unidadPolicialOrganismo = unidadPolicialOrganismo;
		this.medioRecepcion = medioRecepcion;
		this.tipoDenuncia = tipoDenuncia;
		this.fechaParteDenuncia = fechaParteDenuncia;
		this.numeroParteDenuncia = numeroParteDenuncia;
		this.denunciaReservada = denunciaReservada;
		this.fechaIngresoFiscalia = fechaIngresoFiscalia;
	}


	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public UnidadPolicialOrganismo getUnidadPolicialOrganismo() {
		return unidadPolicialOrganismo;
	}

	public void setUnidadPolicialOrganismo(UnidadPolicialOrganismo unidadPolicialOrganismo) {
		this.unidadPolicialOrganismo = unidadPolicialOrganismo;
	}

	public MedioRecepcion getMedioRecepcion() {
		return medioRecepcion;
	}

	public void setMedioRecepcion(MedioRecepcion medioRecepcion) {
		this.medioRecepcion = medioRecepcion;
	}

	public TipoDenuncia getTipoDenuncia() {
		return tipoDenuncia;
	}

	public void setTipoDenuncia(TipoDenuncia tipoDenuncia) {
		this.tipoDenuncia = tipoDenuncia;
	}

	public String getNumeroParteDenuncia() {
		return numeroParteDenuncia;
	}

	public void setNumeroParteDenuncia(String numeroParteDenuncia) {
		this.numeroParteDenuncia = numeroParteDenuncia;
	}

	public boolean isDenunciaReservada() {
		return denunciaReservada;
	}

	public void setDenunciaReservada(boolean denunciaReservada) {
		this.denunciaReservada = denunciaReservada;
	}

	public Date getFechaIngresoFiscalia() {
		return fechaIngresoFiscalia;
	}

	public void setFechaIngresoFiscalia(Date fechaIngresoFiscalia) {
		this.fechaIngresoFiscalia = fechaIngresoFiscalia;
	}


	public Date getFechaParteDenuncia() {
		return fechaParteDenuncia;
	}

	public void setFechaParteDenuncia(Date fechaParteDenuncia) {
		this.fechaParteDenuncia = fechaParteDenuncia;
	}


	public Institucion getInstitucion() {
		return institucion;
	}


	public void setInstitucion(Institucion institucion) {
		this.institucion = institucion;
	}

}
