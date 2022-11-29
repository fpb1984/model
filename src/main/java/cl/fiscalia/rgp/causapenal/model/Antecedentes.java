package cl.fiscalia.rgp.causapenal.model;

import java.util.List;
import org.kie.api.remote.Remotable;


@Remotable
public class Antecedentes implements java.io.Serializable {

	static final long serialVersionUID = 1L;

	private Long idCausa;
	private List<Documento> documentos;

	public Antecedentes() {}
	
	public Antecedentes(
			java.lang.Long idCausa,
			List<Documento> documentos) {
		this.idCausa = idCausa;
		this.documentos = documentos;
	}


	public java.lang.Long getIdCausa() {
		return this.idCausa;
	}

	public void setIdCausa(java.lang.Long idCausa) {
		this.idCausa = idCausa;
	}

	public java.util.List<cl.fiscalia.rgp.causapenal.model.Documento> getDocumentos() {
		return this.documentos;
	}

	public void setDocumentos(
			java.util.List<cl.fiscalia.rgp.causapenal.model.Documento> documentos) {
		this.documentos = documentos;
	}

	@Override
	public String toString() {
		return "Antecedentes [idCausa=" + idCausa + ", documentos=" + documentos + "]";
	}
	
}