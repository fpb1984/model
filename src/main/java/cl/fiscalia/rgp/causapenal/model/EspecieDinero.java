package cl.fiscalia.rgp.causapenal.model;

import java.io.Serializable;

import cl.fiscalia.rgp.causapenal.model.tipo.TipoEspecie;
import cl.fiscalia.rgp.causapenal.model.tipo.TipoUnidadMedida;
import org.kie.api.remote.Remotable;


@Remotable
public class EspecieDinero implements Serializable{

	private static final long serialVersionUID = 1L;

	private Long id;
	private TipoEspecie familiaEspecie;
	private SujetoInterviniente imputado;
	private SujetoInterviniente victima;
	private String cantidad;
	private String archivo;
	private TipoUnidadMedida tipoUnidadMedida;
	private String avaluoEstimado;
	private String denunciadaIncautada;

	
	public EspecieDinero(){}
	
	public EspecieDinero(Long id, TipoEspecie familiaEspecie, SujetoInterviniente imputado, SujetoInterviniente victima,
			String cantidad, String archivo, TipoUnidadMedida tipoUnidadMedida, String avaluoEstimado,
			String denunciadaIncautada) {
		super();
		this.id = id;
		this.familiaEspecie = familiaEspecie;
		this.imputado = imputado;
		this.victima = victima;
		this.cantidad = cantidad;
		this.archivo = archivo;
		this.tipoUnidadMedida = tipoUnidadMedida;
		this.avaluoEstimado = avaluoEstimado;
		this.denunciadaIncautada = denunciadaIncautada;
	}




	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public TipoEspecie getFamiliaEspecie() {
		return familiaEspecie;
	}


	public void setFamiliaEspecie(TipoEspecie familiaEspecie) {
		this.familiaEspecie = familiaEspecie;
	}


	public SujetoInterviniente getImputado() {
		return imputado;
	}


	public void setImputado(SujetoInterviniente imputado) {
		this.imputado = imputado;
	}


	public SujetoInterviniente getVictima() {
		return victima;
	}


	public void setVictima(SujetoInterviniente victima) {
		this.victima = victima;
	}


	public String getCantidad() {
		return cantidad;
	}


	public void setCantidad(String cantidad) {
		this.cantidad = cantidad;
	}


	public String getArchivo() {
		return archivo;
	}


	public void setArchivo(String archivo) {
		this.archivo = archivo;
	}


	public TipoUnidadMedida getTipoUnidadMedida() {
		return tipoUnidadMedida;
	}


	public void setTipoUnidadMedida(TipoUnidadMedida tipoUnidadMedida) {
		this.tipoUnidadMedida = tipoUnidadMedida;
	}


	public String getAvaluoEstimado() {
		return avaluoEstimado;
	}


	public void setAvaluoEstimado(String avaluoEstimado) {
		this.avaluoEstimado = avaluoEstimado;
	}


	public String getDenunciadaIncautada() {
		return denunciadaIncautada;
	}


	public void setDenunciadaIncautada(String denunciadaIncautada) {
		this.denunciadaIncautada = denunciadaIncautada;
	}

	
	
	@Override
	public String toString() {
		return "EspecieDinero [id=" + id + ", familiaEspecie=" + familiaEspecie + ", imputado=" + imputado
				+ ", victima=" + victima + ", cantidad=" + cantidad + ", archivo=" + archivo + ", tipoUnidadMedida="
				+ tipoUnidadMedida + ", avaluoEstimado=" + avaluoEstimado + ", denunciadaIcautada=" + denunciadaIncautada
				+ "]";
	}
	
	
	
}
