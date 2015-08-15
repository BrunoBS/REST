package br.com.brunobs.loja.framework;

public class Info {

	private Long totalRegistrosGeral;
	private FetchType fetchType;
	private Long totalRegistroDevolvidos;

	public Long getTotalRegistrosGeral() {
		return this.totalRegistrosGeral;
	}

	public void setTotalRegistrosGeral(Long totalRegistrosGeral) {
		this.totalRegistrosGeral = totalRegistrosGeral;
	}

	public FetchType getFetchType() {
		return this.fetchType;
	}

	public void setFetchType(FetchType fetchType) {
		this.fetchType = fetchType;
	}

	public Long getTotalRegistroDevolvidos() {
		return this.totalRegistroDevolvidos;
	}

	public void setTotalRegistroDevolvidos(Long totalRegistroDevolvidos) {
		this.totalRegistroDevolvidos = totalRegistroDevolvidos;
	}

}
