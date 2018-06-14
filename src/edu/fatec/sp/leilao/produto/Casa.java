package edu.fatec.sp.leilao.produto;

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
		super(idLeilao, precoProduto, precoProdutoFinal, tipoProduto, endereco, descricaoImov, areaTerreno);
		this.areaConstuidaCasa = areaConstuidaCasa;
		this.numComodos = numComodos;
	}
	
}
