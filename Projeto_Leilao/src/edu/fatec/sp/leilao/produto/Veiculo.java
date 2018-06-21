package edu.fatec.sp.leilao.produto;

import edu.fatec.sp.leilao.Leilao;
import edu.fatec.sp.leilao.produto.Produto;

public abstract class Veiculo extends Produto {
	private Integer anoVeiculo;
	private String fabricanteVeiculo;
	private Integer kmRodadosVeiculo;
	private String modeloVeiculo;
	private String corVeiculo;
	private Integer numMultasVeiculo;
	private String placaVeiculo;
	
	public String getPlacaVeiculo() {
		return placaVeiculo;
	}
	public void setPlacaVeiculo(String placaVeiculo) {
		this.placaVeiculo = placaVeiculo;
	}
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
		return modeloVeiculo;
	}
	public void setEstadoVeiculo(String estadoVeiculo) {
		this.modeloVeiculo = estadoVeiculo;
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
	
	public Veiculo(Leilao idLeilao, Double precoProduto, String tipoProduto,
			Integer anoVeiculo, String fabricanteVeiculo, Integer kmsRodadosVeiculo, String modeloVeiculo, String corVeiculo, Integer numMultas, String placaVeiculo) {
		super(idLeilao, precoProduto, tipoProduto);
		this.anoVeiculo = anoVeiculo;
		this.fabricanteVeiculo = fabricanteVeiculo;
		this.kmRodadosVeiculo = kmsRodadosVeiculo;
		this.modeloVeiculo = modeloVeiculo;
		this.corVeiculo = corVeiculo;
		this.numMultasVeiculo = numMultas;
		this.placaVeiculo = placaVeiculo;
	}
	
	public String toString(){
		StringBuilder sb = new StringBuilder();
		
		sb.append(super.toString()).append("\n");
		sb.append("Ano: " + this.anoVeiculo).append("\n");
		sb.append("Fabricante: " + this.fabricanteVeiculo).append("\n");
		sb.append("Kms Rodados: " + this.kmRodadosVeiculo).append("\n");
		sb.append("Modelo: " + this.modeloVeiculo).append("\n");
		sb.append("Cor: " + this.corVeiculo).append("\n");
		sb.append("Multas: " + this.numMultasVeiculo).append("\n");
		sb.append("Placa: " + this.placaVeiculo);
		
		return sb.toString();
	}
	
}
