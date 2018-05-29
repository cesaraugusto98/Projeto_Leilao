package edu.fatec.sp.sjc;

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
	
	public Casa(String idLeilao, String idProduto, Double precoProduto, String endImov, String ufImov, String cidImov,
			String descricaoImov, Double areaTerreno, Double areaConstuidaCasa, Integer numComodos) {
		super(idLeilao, idProduto, precoProduto, endImov, ufImov, cidImov, descricaoImov, areaTerreno);
		this.areaConstuidaCasa = areaConstuidaCasa;
		this.numComodos = numComodos;
	}
	
}
