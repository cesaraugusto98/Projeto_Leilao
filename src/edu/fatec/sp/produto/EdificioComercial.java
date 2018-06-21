package edu.fatec.sp.produto;

import edu.fatec.sp.controle.Endereco;
import edu.fatec.sp.leilao.Leilao;

public class EdificioComercial extends Imovel {
	
	private Double areaEdificio;
	private Double custoCondominio;
	
	public Double getAreaEdificio() {
		return areaEdificio;
	}
	public void setAreaEdificio(Double areaEdificio) {
		this.areaEdificio = areaEdificio;
	}
	public Double getCustoCondominio() {
		return custoCondominio;
	}
	public void setCustoCondominio(Double custoCondominio) {
		this.custoCondominio = custoCondominio;
	}
	
	public EdificioComercial(Leilao idLeilao, Double precoProduto, Endereco endereco,  String descricaoImov,
			Double areaEdificio, Double custoCondominio) {
		super(idLeilao, precoProduto, "EDIFICIO COMERCIAL", endereco, descricaoImov);
		this.areaEdificio = areaEdificio;
		this.custoCondominio = custoCondominio;
	}
	
	public String toString() {
		StringBuilder sb = new StringBuilder();
		
		sb.append(super.toString()).append("\n");
		sb.append("Area: " + this.areaEdificio).append("\n");
		sb.append("Custo Condominio: " + this.custoCondominio);
		
		return sb.toString();
	}


}
