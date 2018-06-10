package edu.fatec.sp.leilao.banco;

public class InstituicaoFinanceira {
	private String cnpj;
	private String nomeBanco;
	private String contatoBanco;
	
	public String getCnpj() {
		return cnpj;
	}
	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}
	public String getNomeBanco() {
		return nomeBanco;
	}
	public void setNomeBanco(String nomeBanco) {
		this.nomeBanco = nomeBanco;
	}
	public String getContatoBanco() {
		return contatoBanco;
	}
	public void setContatoBanco(String contatoBanco) {
		this.contatoBanco = contatoBanco;
	}

	public InstituicaoFinanceira (String cnpj, String nomeBanco, String contatoBanco) {
		this.cnpj = cnpj;
		this.nomeBanco = nomeBanco;
		this.contatoBanco = contatoBanco;
	}
	
	public boolean equals(InstituicaoFinanceira b) {
		return this.getCnpj().equals(b.getCnpj());
	}
}
