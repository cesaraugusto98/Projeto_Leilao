package edu.fatec.sp.leilao.produto;

import edu.fatec.sp.controle.Identificador;
import edu.fatec.sp.leilao.Leilao;

public abstract class Produto {
	private Leilao idLeilao;
	private String idProduto;
	private String tipoProduto;
	private Double precoProduto;
	
	public String getTipoProduto() {
		return tipoProduto;
	}
	public void setTipoProduto(String tipoProduto) {
		this.tipoProduto = tipoProduto;
	}
	public Leilao getIdLeilao() {
		return idLeilao;
	}
	public void setIdLeilao(Leilao idLeilao) {
		this.idLeilao = idLeilao;
	}
	public String getIdProduto() {
		return idProduto;
	}
	public void setIdProduto(String idProduto) {
		this.idProduto = idProduto;
	}
	public Double getPrecoProduto() {
		return precoProduto;
	}
	public void setPrecoProduto(Double precoProduto) {
		this.precoProduto = precoProduto;
	}
	
	public Produto(Leilao idLeilao, Double precoProduto, String tipoProduto) {
		this.idLeilao = idLeilao;
		this.idProduto = Identificador.getChave();
		this.precoProduto = precoProduto;
		this.tipoProduto = tipoProduto;
	}
	
	public boolean equals(Produto p) {
		return this.idProduto.equals(p.getIdProduto());
	}
}
