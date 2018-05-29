package edu.fatec.sp.sjc;

import edu.fatec.sp.sjc.Produto;

public abstract class Veiculo extends Produto {
	private Integer anoVeiculo;
	private String fabricanteVeiculo;
	private Integer kmRodadosVeiculo;
	private String estadoVeiculo;
	private String corVeiculo;
	private Integer numMultasVeiculo;
	public Integer getAnoVeiculo() {
		return anoVeiculo;
	}
	public void setAnoVeiculo(Integer anoVeiculo) {
		this.anoVeiculo = anoVeiculo;
	}
	public String getFabricanteVeiculo() {
		return fabricanteVeiculo;
	}
	public void setFabricanteVeiculo(String fabricanteVeiculo) {
		this.fabricanteVeiculo = fabricanteVeiculo;
	}
	public Integer getKmRodadosVeiculo() {
		return kmRodadosVeiculo;
	}
	public void setKmRodadosVeiculo(Integer kmRodadosVeiculo) {
		this.kmRodadosVeiculo = kmRodadosVeiculo;
	}
	public String getEstadoVeiculo() {
		return estadoVeiculo;
	}
	public void setEstadoVeiculo(String estadoVeiculo) {
		this.estadoVeiculo = estadoVeiculo;
	}
	public String getCorVeiculo() {
		return corVeiculo;
	}
	public void setCorVeiculo(String corVeiculo) {
		this.corVeiculo = corVeiculo;
	}
	public Integer getNumMultasVeiculo() {
		return numMultasVeiculo;
	}
	public void setNumMultasVeiculo(Integer numMultasVeiculo) {
		this.numMultasVeiculo = numMultasVeiculo;
	}
	
	public Veiculo(String idLeilao, String idProduto, Double precoProduto,
			Integer anoVeiculo, String fabricanteVeiculo, Integer kmsRodadosVeiculo, String estadoVeiculo, String corVeiculo, Integer numMultas) {
		super(idLeilao, idProduto, precoProduto);
		this.anoVeiculo = anoVeiculo;
		this.fabricanteVeiculo = fabricanteVeiculo;
		this.kmRodadosVeiculo = kmsRodadosVeiculo;
		this.estadoVeiculo = estadoVeiculo;
		this.corVeiculo = corVeiculo;
		this.numMultasVeiculo = numMultas;
	}
	
}
