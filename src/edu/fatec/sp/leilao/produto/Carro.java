package edu.fatec.sp.leilao.produto;

import edu.fatec.sp.leilao.Leilao;

public class Carro extends Veiculo {
	private Integer numPortasCarro;
	private String potenciaMotorCarro;
	
	public Integer getNumPortasCarro() {
		return numPortasCarro;
	}
	public void setNumPortasCarro(Integer numPortasCarro) {
		this.numPortasCarro = numPortasCarro;
	}
	public String getPotenciaMotorCarro() {
		return potenciaMotorCarro;
	}
	public void setPotenciaMotorCarro(String potenciaMotorCarro) {
		this.potenciaMotorCarro = potenciaMotorCarro;
	}
	
	public Carro(Leilao idLeilao, String idProduto, Double precoProduto, String tipoProduto, Integer anoVeiculo, String fabricanteVeiculo,
			Integer kmsRodadosVeiculo, String estadoVeiculo, String corVeiculo, Integer numMultas, String placaVeiculo, Integer numPortasCarro, String potenciaMotorCarro) {
		super(idLeilao, idProduto, precoProduto, tipoProduto, anoVeiculo, fabricanteVeiculo, kmsRodadosVeiculo, estadoVeiculo, corVeiculo,
				numMultas, placaVeiculo);
		this.numPortasCarro = numPortasCarro;
		this.potenciaMotorCarro = potenciaMotorCarro;
	}
	
}
