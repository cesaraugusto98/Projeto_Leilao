package edu.fatec.sp.produto;

import edu.fatec.sp.controle.Endereco;
import edu.fatec.sp.leilao.Leilao;

public class Casa extends Terreno {
	private Double areaConstuidaCasa;
	private Integer numComodos;
	
	public Double getAreaConstuidaCasa() {
		return areaConstuidaCasa;
	}
	public void setAreaConstuidaCasa(Double areaConstuidaCasa) {
		this.areaConstuidaCasa = areaConstuidaCasa;
	}
	public int getNumComodos() {
		return numComodos;
	}
	public void setNumComodos(int numComodos) {
		this.numComodos = numComodos;
	}
	
	public Casa(Leilao idLeilao, Double precoProduto, Double precoProdutoFinal, String tipoProduto, Endereco endereco, 
			String descricaoImov, Double areaTerreno, Double areaConstuidaCasa, Integer numComodos) {
		super(idLeilao, precoProduto, tipoProduto, endereco, descricaoImov, areaTerreno);
		this.areaConstuidaCasa = areaConstuidaCasa;
		this.numComodos = numComodos;
	}
	
	public String toString() {
		StringBuilder sb = new StringBuilder();
		
		sb.append(super.toString()).append("\n");
		sb.append("Area Construida: " + this.areaConstuidaCasa).append("\n");
		sb.append("Comodos: " + this.numComodos);
		
		return sb.toString();
	}
	
}
