package edu.fatec.sp.leilao.produto;

public class Terreno extends Imovel {

	private Double areaTerreno;
	
	public Double getAreaTerreno() {
		return areaTerreno;
	}

	public void setAreaTerreno(Double areaTerreno) {
		this.areaTerreno = areaTerreno;
	}

	public Terreno(String idLeilao, String idProduto, Double precoProduto, String tipoProduto, String endImov, String ufImov, String cidImov, String descricaoImov, Double areaTerreno) {
		super(idLeilao, idProduto, precoProduto, tipoProduto, endImov, ufImov, cidImov, descricaoImov);
		this.areaTerreno = areaTerreno;
	}
}