package cl.fiscalia.rgp.causapenal.model;

import java.io.Serializable;

import cl.fiscalia.rgp.causapenal.model.tipo.EstadoCivil;
import cl.fiscalia.rgp.causapenal.model.tipo.Genero;
import cl.fiscalia.rgp.causapenal.model.tipo.Pais;
import cl.fiscalia.rgp.causapenal.model.tipo.TipoDocumento;
import cl.fiscalia.rgp.causapenal.model.tipo.TipoSujetoInterviniente;
import org.kie.api.remote.Remotable;

@Remotable
public class SujetoInterviniente implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	private Long id;
	private TipoSujetoInterviniente tipoSujetoInterviniente;  
	private String tipoPersona;
	private TipoDocumento tipoDocumento;  
	private String numeroDocumento;  
	private String nombres;
	private String apaterno;
	private String amaterno;
	private String puntaje;
	private Genero genero;
	private boolean confidencial;
	private boolean ordenDetencion;
	private boolean funcionarioPublico;
	private EstadoCivil estadoCivil;
	private Pais pais;
	
	
	public SujetoInterviniente() {}
	
	
	public SujetoInterviniente(Long id, TipoSujetoInterviniente tipoSujetoInterviniente, String tipoPersona,
			TipoDocumento tipoDocumento, String numeroDocumento, String nombres, String apaterno, String amaterno,
			String puntaje, Genero genero, boolean confidencial, boolean ordenDetencion, boolean funcionarioPublico,
			EstadoCivil estadoCivil, Pais pais) {
		super();
		this.id = id;
		this.tipoSujetoInterviniente = tipoSujetoInterviniente;
		this.tipoPersona = tipoPersona;
		this.tipoDocumento = tipoDocumento;
		this.numeroDocumento = numeroDocumento;
		this.nombres = nombres;
		this.apaterno = apaterno;
		this.amaterno = amaterno;
		this.puntaje = puntaje;
		this.genero = genero;
		this.confidencial = confidencial;
		this.ordenDetencion = ordenDetencion;
		this.funcionarioPublico = funcionarioPublico;
		this.estadoCivil = estadoCivil;
		this.pais = pais;
	}




	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTipoPersona() {
		return tipoPersona;
	}

	public void setTipoPersona(String tipoPersona) {
		this.tipoPersona = tipoPersona;
	}

	public TipoDocumento getTipoDocumento() {
		return tipoDocumento;
	}

	public void setTipoDocumento(TipoDocumento tipoDocumento) {
		this.tipoDocumento = tipoDocumento;
	}

	public String getNumeroDocumento() {
		return numeroDocumento;
	}

	public void setNumeroDocumento(String numeroDocumento) {
		this.numeroDocumento = numeroDocumento;
	}

	public String getNombres() {
		return nombres;
	}

	public void setNombres(String nombres) {
		this.nombres = nombres;
	}

	public String getApaterno() {
		return apaterno;
	}

	public void setApaterno(String apaterno) {
		this.apaterno = apaterno;
	}

	public String getAmaterno() {
		return amaterno;
	}

	public void setAmaterno(String amaterno) {
		this.amaterno = amaterno;
	}

	public String getPuntaje() {
		return puntaje;
	}

	public void setPuntaje(String puntaje) {
		this.puntaje = puntaje;
	}

	public Genero getGenero() {
		return genero;
	}

	public void setGenero(Genero genero) {
		this.genero = genero;
	}

	public EstadoCivil getEstadoCivil() {
		return estadoCivil;
	}

	public void setEstadoCivil(EstadoCivil estadoCivil) {
		this.estadoCivil = estadoCivil;
	}

	public TipoSujetoInterviniente getTipoSujetoInterviniente() {
		return tipoSujetoInterviniente;
	}

	public void setTipoSujetoInterviniente(TipoSujetoInterviniente tipoSujetoInterviniente) {
		this.tipoSujetoInterviniente = tipoSujetoInterviniente;
	}

	public Pais getPais() {
		return pais;
	}

	public void setPais(Pais pais) {
		this.pais = pais;
	}


	public boolean isConfidencial() {
		return confidencial;
	}


	public void setConfidencial(boolean confidencial) {
		this.confidencial = confidencial;
	}


	public boolean isOrdenDetencion() {
		return ordenDetencion;
	}


	public void setOrdenDetencion(boolean ordenDetencion) {
		this.ordenDetencion = ordenDetencion;
	}


	public boolean isFuncionarioPublico() {
		return funcionarioPublico;
	}


	public void setFuncionarioPublico(boolean funcionarioPublico) {
		this.funcionarioPublico = funcionarioPublico;
	}


	@Override
	public String toString() {
		return "SujetoInterviniente [id=" + id + ", tipoSujetoInterviniente=" + tipoSujetoInterviniente
				+ ", tipoPersona=" + tipoPersona + ", tipoDocumento=" + tipoDocumento + ", numeroDocumento="
				+ numeroDocumento + ", nombres=" + nombres + ", apaterno=" + apaterno + ", amaterno=" + amaterno
				+ ", puntaje=" + puntaje + ", genero=" + genero + ", confidencial=" + confidencial + ", ordenDetencion="
				+ ordenDetencion + ", funcionarioPublico=" + funcionarioPublico + ", estadoCivil=" + estadoCivil
				+ ", pais=" + pais + "]";
	}

	
	
}
