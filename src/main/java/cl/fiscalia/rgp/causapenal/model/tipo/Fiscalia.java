package cl.fiscalia.rgp.causapenal.model.tipo;

import java.io.Serializable;
import org.kie.api.remote.Remotable;


@Remotable
public class Fiscalia implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	private Long id;
	
	private String codFiscaliaLocal;
	private String nombreFiscaliaLocal;
	private String codFiscaliaRegional;
	private String nombreFiscaliaRegional;
	private String codFiscalia;
	private String nombreFiscalia;
	
	
	public Fiscalia() {
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getCodFiscaliaLocal() {
		return codFiscaliaLocal;
	}

	public void setCodFiscaliaLocal(String codFiscaliaLocal) {
		this.codFiscaliaLocal = codFiscaliaLocal;
	}

	public String getNombreFiscaliaLocal() {
		return nombreFiscaliaLocal;
	}

	public void setNombreFiscaliaLocal(String nombreFiscaliaLocal) {
		this.nombreFiscaliaLocal = nombreFiscaliaLocal;
	}

	public String getCodFiscaliaRegional() {
		return codFiscaliaRegional;
	}

	public void setCodFiscaliaRegional(String codFiscaliaRegional) {
		this.codFiscaliaRegional = codFiscaliaRegional;
	}

	public String getNombreFiscaliaRegional() {
		return nombreFiscaliaRegional;
	}

	public void setNombreFiscaliaRegional(String nombreFiscaliaRegional) {
		this.nombreFiscaliaRegional = nombreFiscaliaRegional;
	}

	public String getCodFiscalia() {
		return codFiscalia;
	}

	public void setCodFiscalia(String codFiscalia) {
		this.codFiscalia = codFiscalia;
	}

	public String getNombreFiscalia() {
		return nombreFiscalia;
	}

	public void setNombreFiscalia(String nombreFiscalia) {
		this.nombreFiscalia = nombreFiscalia;
	}

	public Fiscalia(String codFiscaliaLocal, String nombreFiscaliaLocal, String codFiscaliaRegional,
			String nombreFiscaliaRegional, String codFiscalia, String nombreFiscalia) {
		super();
		this.codFiscaliaLocal = codFiscaliaLocal;
		this.nombreFiscaliaLocal = nombreFiscaliaLocal;
		this.codFiscaliaRegional = codFiscaliaRegional;
		this.nombreFiscaliaRegional = nombreFiscaliaRegional;
		this.codFiscalia = codFiscalia;
		this.nombreFiscalia = nombreFiscalia;
	}
	
}
