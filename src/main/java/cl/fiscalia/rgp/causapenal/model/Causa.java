package cl.fiscalia.rgp.causapenal.model;

import java.io.Serializable;
import java.util.List;
import cl.fiscalia.rgp.causapenal.model.tipo.EstadoCausa;
import cl.fiscalia.rgp.causapenal.model.tipo.Region;
import cl.fiscalia.rgp.causapenal.model.tipo.Fiscalia;

import org.kie.api.remote.Remotable;


@Remotable
public class Causa implements Serializable{

	private static final long serialVersionUID = 1L;

	private Long id;

	private Denuncia denuncia;
	
	private List<Delito> delitos;
	
	private List<SujetoInterviniente> sujetosIntervinentes;
	
	private List<EspecieDinero> especiesDineros;
	
	private List<MedidaProteccion> medidasProteccion;
	
	private List<AplicacionPauta> aplicacionPautas;
	
	private List<Documento> documentacion;
	
	private List<InstruccionDiligencia> diligencias;
	
	private String relato;
	
	private String ruc;
	
	private EstadoCausa estado;
	
	private String nombreCausa;
	
	private String recomendacionPreclasificador;
	
	private Region region;
	
	private Fiscalia fiscaliaLocal;
	
	private Fiscalia fiscaliaRegional;
	
	// seguir linea investigativa
	
	private String clasificacion;
	
	private String especialidad;
	
	private String fiscalPropuesto;
	
	private String observaciones;

	private Fiscalia fiscalia;
	
	private List docs;
	
	
	public Causa() {}

	
	public Causa(Long id, Denuncia denuncia, List<Delito> delitos, List<SujetoInterviniente> sujetosIntervinentes,
			List<EspecieDinero> especiesDineros, List<MedidaProteccion> medidasProteccion,
			List<AplicacionPauta> aplicacionPautas, List<Documento> documentacion, String relato, String ruc,
			EstadoCausa estado, String nombreCausa, String clasificacion, String especialidad, String fiscalPropuesto,
			String observaciones, Region region, Fiscalia fiscaliaLocal, Fiscalia fiscaliaRegional,List<InstruccionDiligencia> diligencias,
			String recomendacionPreclasificador, Fiscalia fiscalia, List<String> docs) {
		super();
		this.id = id;
		this.denuncia = denuncia;
		this.delitos = delitos;
		this.sujetosIntervinentes = sujetosIntervinentes;
		this.especiesDineros = especiesDineros;
		this.medidasProteccion = medidasProteccion;
		this.aplicacionPautas = aplicacionPautas;
		this.documentacion = documentacion;
		this.relato = relato;
		this.ruc = ruc;
		this.estado = estado;
		this.nombreCausa = nombreCausa;
		this.clasificacion = clasificacion;
		this.especialidad = especialidad;
		this.fiscalPropuesto = fiscalPropuesto;
		this.observaciones = observaciones;
		this.region = region;
		this.fiscaliaLocal = fiscaliaLocal;
		this.fiscaliaRegional = fiscaliaRegional;
		this.diligencias = diligencias;
		this.recomendacionPreclasificador = recomendacionPreclasificador;
	    this.fiscalia = fiscalia;
		this.docs = docs;
	}







	public Long getId() {
		return id;
	}
	
	
	public void setId(Long id) {
		this.id = id;
	}


	public Denuncia getDenuncia() {
		return denuncia;
	}


	public void setDenuncia(Denuncia denuncia) {
		this.denuncia = denuncia;
	}


	public List<Delito> getDelitos() {
		return delitos;
	}


	public void setDelitos(List<Delito> delitos) {
		this.delitos = delitos;
	}


	public List<SujetoInterviniente> getSujetosIntervinentes() {
		return sujetosIntervinentes;
	}


	public void setSujetosIntervinentes(List<SujetoInterviniente> sujetosIntervinentes) {
		this.sujetosIntervinentes = sujetosIntervinentes;
	}


	public List<EspecieDinero> getEspeciesDineros() {
		return especiesDineros;
	}


	public void setEspeciesDineros(List<EspecieDinero> especiesDineros) {
		this.especiesDineros = especiesDineros;
	}


	public String getRelato() {
		return relato;
	}


	public void setRelato(String relato) {
		this.relato = relato;
	}


	public String getRuc() {
		return ruc;
	}


	public void setRuc(String ruc) {
		this.ruc = ruc;
	}


	public EstadoCausa getEstado() {
		return estado;
	}


	public void setEstado(EstadoCausa estado) {
		this.estado = estado;
	}


	public String getNombreCausa() {
		return nombreCausa;
	}


	public void setNombreCausa(String nombreCausa) {
		this.nombreCausa = nombreCausa;
	}


	public List<MedidaProteccion> getMedidasProteccion() {
		return medidasProteccion;
	}


	public void setMedidasProteccion(List<MedidaProteccion> medidasProteccion) {
		this.medidasProteccion = medidasProteccion;
	}


	public List<AplicacionPauta> getAplicacionPautas() {
		return aplicacionPautas;
	}


	public void setAplicacionPautas(List<AplicacionPauta> aplicacionPautas) {
		this.aplicacionPautas = aplicacionPautas;
	}


	public String getClasificacion() {
		return clasificacion;
	}


	public void setClasificacion(String clasificacion) {
		this.clasificacion = clasificacion;
	}


	public List<Documento> getDocumentacion() {
		return documentacion;
	}


	public void setDocumentacion(List<Documento> documentacion) {
		this.documentacion = documentacion;
	}


	public String getEspecialidad() {
		return especialidad;
	}


	public void setEspecialidad(String especialidad) {
		this.especialidad = especialidad;
	}


	public String getFiscalPropuesto() {
		return fiscalPropuesto;
	}


	public void setFiscalPropuesto(String fiscalPropuesto) {
		this.fiscalPropuesto = fiscalPropuesto;
	}


	public String getObservaciones() {
		return observaciones;
	}


	public void setObservaciones(String observaciones) {
		this.observaciones = observaciones;
	}


	public Region getRegion() {
		return region;
	}


	public void setRegion(Region region) {
		this.region = region;
	}


	public Fiscalia getFiscaliaLocal() {
		return fiscaliaLocal;
	}


	public void setFiscaliaLocal(Fiscalia fiscaliaLocal) {
		this.fiscaliaLocal = fiscaliaLocal;
	}


	public Fiscalia getFiscaliaRegional() {
		return fiscaliaRegional;
	}


	public void setFiscaliaRegional(Fiscalia fiscaliaRegional) {
		this.fiscaliaRegional = fiscaliaRegional;
	}


	public List<InstruccionDiligencia> getDiligencias() {
		return diligencias;
	}


	public void setDiligencias(List<InstruccionDiligencia> diligencias) {
		this.diligencias = diligencias;
	}


	public String getRecomendacionPreclasificador() {
		return recomendacionPreclasificador;
	}

	public void setRecomendacionPreclasificador(String recomendacionPreclasificador) {
		this.recomendacionPreclasificador = recomendacionPreclasificador;
	}

	public void setFiscalia(Fiscalia fiscalia) {
		this.fiscalia = fiscalia;
	}
	
	public Fiscalia getFiscalia() {
		return fiscalia;
	}

	public void setDocs(List docs) {
		this.docs = docs;
	}
	
	public List getDocs() {
		return docs;
	}
	
    public boolean containsCod(String cod) {
		
		for(Delito delito:this.getDelitos())
			if(delito.getCodigo().equals(cod))
				return true;
		return false;
	}

	
}
