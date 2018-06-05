package edu.fatec.sp.sjc;

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
	
	public Carro(String idLeilao, String idProduto, Double precoProduto, Integer anoVeiculo, String fabricanteVeiculo,
			Integer kmsRodadosVeiculo, String estadoVeiculo, String corVeiculo, Integer numMultas, String placaVeiculo, Integer numPortasCarro, String potenciaMotorCarro) {
		super(idLeilao, idProduto, precoProduto, anoVeiculo, fabricanteVeiculo, kmsRodadosVeiculo, estadoVeiculo, corVeiculo,
				numMultas, placaVeiculo);
		this.numPortasCarro = numPortasCarro;
		this.potenciaMotorCarro = potenciaMotorCarro;
	}
	
}
