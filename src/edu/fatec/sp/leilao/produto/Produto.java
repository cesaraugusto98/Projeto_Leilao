package edu.fatec.sp.leilao.produto;

public abstract class Produto {
	private String idLeilao;
	private String idProduto;
	private String tipoProduto;
	private Double precoProduto;
	
	public String getTipoProduto() {
		return tipoProduto;
	}
	public void setTipoProduto(String tipoProduto) {
		this.tipoProduto = tipoProduto;
	}
	public String getIdLeilao() {
		return idLeilao;
	}
	public void setIdLeilao(String idLeilao) {
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
	
	public Produto(String idLeilao, String idProduto, Double precoProduto, String tipoProduto) {
		this.idLeilao = idLeilao;
		this.idProduto = idProduto;
		this.precoProduto = precoProduto;
		this.tipoProduto = tipoProduto;
	}
	
	public boolean equals(Produto p) {
		return this.idProduto.equals(p.getIdProduto());
	}
}
