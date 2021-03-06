package edu.fatec.sp.produto;

import edu.fatec.sp.controle.Identificador;
import edu.fatec.sp.leilao.Leilao;
import edu.fatec.sp.pessoa.Lance;

public abstract class Produto {
	private Leilao idLeilao;
	private String idProduto;
	private String tipoProduto;
	private Double precoProduto;
	private Double precoProdutoFinal;
	private String idLanceVencedor;
	
	public String getIdLanceVencedor() {
		return idLanceVencedor;
	}
	public void setIdLanceVencedor(String idLanceVencedor) {
		this.idLanceVencedor = idLanceVencedor;
	}
	public Double getPrecoProdutoFinal() {
		return precoProdutoFinal;
	}
	public void setPrecoProdutoFinal(Double precoProdutoFinal) {
		this.precoProdutoFinal = precoProdutoFinal;
	}
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
		this.precoProdutoFinal = precoProduto;
		this.tipoProduto = tipoProduto;
		this.idLanceVencedor = "N/A";
	}
	
	public boolean equals(Produto p) {
		return this.idProduto.equals(p.getIdProduto());
	}
	
	public String toString() {
		StringBuilder sb= new StringBuilder();
		
		sb.append(this.idLeilao.toString()).append("\n");
		sb.append("Identificador: " + this.idProduto).append("\n");
		sb.append("Preco Inicial: " + this.precoProduto).append("\n");
		sb.append("Preco Final: " + this.precoProdutoFinal).append("\n");
		sb.append("Tipo: " + this.tipoProduto).append("\n");
		sb.append("C�digo Lance Vencedor: " + this.idLanceVencedor).append("\n");
		
		return sb.toString();
		
	}
}
