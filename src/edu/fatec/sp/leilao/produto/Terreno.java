package edu.fatec.sp.leilao.produto;

import edu.fatec.sp.leilao.Leilao;

public class Terreno extends Imovel {

	private Double areaTerreno;
	
	public Double getAreaTerreno() {
		return areaTerreno;
	}

	public void setAreaTerreno(Double areaTerreno) {
		this.areaTerreno = areaTerreno;
	}

	public Terreno(Leilao idLeilao, Double precoProduto, String tipoProduto, String endImov, String ufImov, String cidImov, String descricaoImov, Double areaTerreno) {
		super(idLeilao, precoProduto, tipoProduto, endImov, ufImov, cidImov, descricaoImov);
		this.areaTerreno = areaTerreno;
	}
}
