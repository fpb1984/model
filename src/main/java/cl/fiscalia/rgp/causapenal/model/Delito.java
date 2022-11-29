package cl.fiscalia.rgp.causapenal.model;

import java.io.Serializable;
import java.util.Date;
import cl.fiscalia.rgp.causapenal.model.tipo.TipoDelito;
import org.kie.api.remote.Remotable;


@Remotable
public class Delito implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	private Long id;
		
	private String codigo;
	
	private TipoDelito tipoDelito;
	
	private boolean esVif;
	
	private boolean esFragancia;
	
	private Date fechaDelito;
		
	private Date fechaRangoDesde;
	
	private Date fechaRangoHasta;
	
	private boolean camaraVigilancia;
	
	private String refCamaraVigilancia;


	public Delito() {}
	
	public Delito(Long id, String codigo, TipoDelito tipoDelito, boolean esVif, boolean esFragancia,
			Date fechaDelito, Date fechaRangoDesde, Date fechaRangoHasta,
			boolean camaraVigilancia, String refCamaraVigilancia) {
		super();
		this.id = id;
		this.codigo = codigo;
		this.tipoDelito = tipoDelito;
		this.esVif = esVif;
		this.esFragancia = esFragancia;
		this.fechaDelito = fechaDelito;
		this.fechaRangoDesde = fechaRangoDesde;
		this.fechaRangoHasta = fechaRangoHasta;
		this.camaraVigilancia = camaraVigilancia;
		this.refCamaraVigilancia = refCamaraVigilancia;
		
	}



	public Delito(Long id) {
		this.id = id;
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

	public TipoDelito getTipoDelito() {
		return tipoDelito;
	}

	public void setTipoDelito(TipoDelito tipoDelito) {
		this.tipoDelito = tipoDelito;
	}

	public boolean isEsVif() {
		return esVif;
	}

	public void setEsVif(boolean esVif) {
		this.esVif = esVif;
	}

	public boolean isEsFragancia() {
		return esFragancia;
	}

	public void setEsFragancia(boolean esFragancia) {
		this.esFragancia = esFragancia;
	}

	public Date getFechaDelito() {
		return fechaDelito;
	}

	public void setFechaDelito(Date fechaDelito) {
		this.fechaDelito = fechaDelito;
	}

	public boolean isCamaraVigilancia() {
		return camaraVigilancia;
	}

	public void setCamaraVigilancia(boolean camaraVigilancia) {
		this.camaraVigilancia = camaraVigilancia;
	}

	public String getRefCamaraVigilancia() {
		return refCamaraVigilancia;
	}

	public void setRefCamaraVigilancia(String refCamaraVigilancia) {
		this.refCamaraVigilancia = refCamaraVigilancia;
	}

	public Date getFechaRangoDesde() {
		return fechaRangoDesde;
	}

	public void setFechaRangoDesde(Date fechaRangoDesde) {
		this.fechaRangoDesde = fechaRangoDesde;
	}

	public Date getFechaRangoHasta() {
		return fechaRangoHasta;
	}

	public void setFechaRangoHasta(Date fechaRangoHasta) {
		this.fechaRangoHasta = fechaRangoHasta;
	}

	@Override
	public String toString() {
		return "Delito [id=" + id + ", codigo=" + codigo + ", tipoDelito=" + tipoDelito + ", esVif=" + esVif
				+ ", esFragancia=" + esFragancia + ", fechaDelito=" + fechaDelito + ", fechaRangoDesde="
				+ fechaRangoDesde + ", fechaRangoHasta=" + fechaRangoHasta + ", camaraVigilancia=" + camaraVigilancia
				+ ", refCamaraVigilancia=" + refCamaraVigilancia + "]";
	}


}
