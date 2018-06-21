package edu.fatec.sp.produto;

import edu.fatec.sp.leilao.Leilao;

public class Moto extends Veiculo {

	private Integer cilindradasMoto;

	public Integer getCilindradasMoto() {
		return cilindradasMoto;
	}

	public void setCilindradasMoto(Integer cilindradasMoto) {
		this.cilindradasMoto = cilindradasMoto;
	}
	
	public Moto(Leilao idLeilao, Double precoProduto, Integer anoVeiculo, String fabricanteVeiculo,
			Integer kmsRodadosVeiculo, String modeloVeiculo, String corVeiculo, Integer numMultas, String placaVeiculo, Integer cilindradasMoto) {
		super(idLeilao, precoProduto,"MOTO", anoVeiculo, fabricanteVeiculo, kmsRodadosVeiculo, modeloVeiculo, corVeiculo,
				numMultas, placaVeiculo);
		this.cilindradasMoto = cilindradasMoto;
	}
	
	public String toString() {
		StringBuilder sb = new StringBuilder();
		
		sb.append(super.toString()).append("\n");
		sb.append("Cilindradas: " + this.cilindradasMoto);
		
		return sb.toString();
	}
}
