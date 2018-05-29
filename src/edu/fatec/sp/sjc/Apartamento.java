package edu.fatec.sp.sjc;

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
	
	public Apartamento(String idLeilao, String idProduto, Double precoProduto, String endImov, String ufImov,
			String cidImov, String descricaoImov, Double custoCondominio, Integer numComodos, Double areaApto, Integer andar) {
		super(idLeilao, idProduto, precoProduto, endImov, ufImov, cidImov, descricaoImov);
		this.custoCondominio = custoCondominio;
		this.numComodos = numComodos;
		this.areaApto = areaApto;
		this.andar = andar;
	}

}
