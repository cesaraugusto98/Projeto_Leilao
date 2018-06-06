package edu.fatec.sp.leilao.banco;

public class InstituicaoFinanceira {
	private String cnpj;
	private String nomeBanco;
	private String contatoBanco;
	
	public InstituicaoFinanceira (String cnpj, String nomeBanco, String contatoBanco) {
		this.cnpj = cnpj;
		this.nomeBanco = nomeBanco;
		this.contatoBanco = contatoBanco;
	}
}
