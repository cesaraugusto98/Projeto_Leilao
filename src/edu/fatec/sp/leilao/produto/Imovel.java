package edu.fatec.sp.leilao.produto;

import edu.fatec.sp.leilao.Leilao;

public abstract class Imovel extends Produto {
	
	private String endImov;
	private String ufImov;
	private String cidImov;
	private String descricaoImov;
	
	public String getEndImov() {
		return endImov;
	}
	public void setEndImov(String endImov) {
		this.endImov = endImov;
	}
	public String getUfImov() {
		return ufImov;
	}
	public void setUfImov(String ufImov) {
		this.ufImov = ufImov;
	}
	public String getCidImov() {
		return cidImov;
	}
	public void setCidImov(String cidImov) {
		this.cidImov = cidImov;
	}
	public String getDescricaoImov() {
		return descricaoImov;
	}
	public void setDescricaoImov(String descricaoImov) {
		this.descricaoImov = descricaoImov;
	}
	
	public Imovel(Leilao idLeilao, String idProduto, Double precoProduto, String tipoProduto, String endImov, String ufImov, String cidImov, String descricaoImov) {
		super(idLeilao, idProduto, precoProduto, tipoProduto);
		this.endImov = endImov;
		this.ufImov = ufImov;
		this.cidImov = cidImov;
		this.descricaoImov = descricaoImov;
	}

}
