package edu.fatec.sp.banco;

import edu.fatec.sp.controle.Endereco;

public class InstituicaoFinanceira {
	private String cnpj;
	private String nomeBanco;
	private String contatoBanco;
	private Endereco endereco;
	
	public Endereco getEndereco() {
		return endereco;
	}
	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}
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

	public InstituicaoFinanceira (String cnpj, String nomeBanco, String contatoBanco, Endereco endereco) {
		this.cnpj = cnpj;
		this.nomeBanco = nomeBanco;
		this.contatoBanco = contatoBanco;
		this.endereco = endereco;
	}
	
	public boolean equals(InstituicaoFinanceira b) {
		return this.getCnpj().equals(b.getCnpj());
	}
	
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("CNPJ: " + this.cnpj).append("\n");
		sb.append("Instituicao Financeira: " + this.nomeBanco).append("\n");
		sb.append("Contato: " + this.contatoBanco).append("\n");
		sb.append(this.endereco.toString());
		return sb.toString();
	}
}
