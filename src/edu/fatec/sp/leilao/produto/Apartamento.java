package edu.fatec.sp.leilao.produto;

import edu.fatec.sp.controle.Endereco;
import edu.fatec.sp.leilao.Leilao;

public class Apartamento extends Imovel {
	private Double custoCondominio;
	private Integer numComodos;
	private Double areaApto;
	private Integer andar;
	
	public Double getCustoCondominio() {
		return custoCondominio;
	}
	public void setCustoCondominio(Double custoCondominio) {
		this.custoCondominio = custoCondominio;
	}
	public Integer getNumComodos() {
		return numComodos;
	}
	public void setNumComodos(Integer numComodos) {
		this.numComodos = numComodos;
	}
	public Double getAreaApto() {
		return areaApto;
	}
	public void setAreaApto(Double areaApto) {
		this.areaApto = areaApto;
	}
	public Integer getAndar() {
		return andar;
	}
	public void setAndar(Integer andar) {
		this.andar = andar;
	}
	
	public Apartamento(Leilao idLeilao, Double precoProduto, Endereco endereco, String descricaoImov,
			Double custoCondominio, Integer numComodos, Double areaApto, Integer andar) {
		super(idLeilao, precoProduto, "APARTAMENTO", endereco, descricaoImov);
		this.custoCondominio = custoCondominio;
		this.numComodos = numComodos;
		this.areaApto = areaApto;
		this.andar = andar;
	}

}
