package edu.fatec.sp.produto;

import edu.fatec.sp.controle.Endereco;
import edu.fatec.sp.leilao.Leilao;

public abstract class Imovel extends Produto {
	
	private Endereco endereco;
	private String descricaoImov;
	
	
	public Endereco getEndereco() {
		return endereco;
	}
	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}
	public String getDescricaoImov() {
		return descricaoImov;
	}
	public void setDescricaoImov(String descricaoImov) {
		this.descricaoImov = descricaoImov;
	}
	
	public Imovel(Leilao idLeilao, Double precoProduto, String tipoProduto, Endereco endereco, String descricaoImov) {
		super(idLeilao, precoProduto,  tipoProduto);
		this.endereco = endereco;
		this.descricaoImov = descricaoImov;
	}
	
	public String toString() {
		StringBuilder sb = new StringBuilder();
		
		sb.append(super.toString()).append("\n");
		sb.append(this.endereco.toString()).append("\n");
		sb.append("Descricao: " + this.descricaoImov);
		
		return sb.toString();
	}

}
