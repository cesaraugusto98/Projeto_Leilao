package edu.fatec.sp.leilao.produto;

import edu.fatec.sp.leilao.Leilao;

public class Moto extends Veiculo {

	private Integer cilindradasMoto;

	public Integer getCilindradasMoto() {
		return cilindradasMoto;
	}

	public void setCilindradasMoto(Integer cilindradasMoto) {
		this.cilindradasMoto = cilindradasMoto;
	}
	
	public Moto(Leilao idLeilao, Double precoProduto, Double precoProdutoFinal, Integer anoVeiculo, String fabricanteVeiculo,
			Integer kmsRodadosVeiculo, String estadoVeiculo, String corVeiculo, Integer numMultas, String placaVeiculo, Integer cilindradasMoto) {
		super(idLeilao, precoProduto, precoProdutoFinal,"MOTO", anoVeiculo, fabricanteVeiculo, kmsRodadosVeiculo, estadoVeiculo, corVeiculo,
				numMultas, placaVeiculo);
		this.cilindradasMoto = cilindradasMoto;
	}
	
}
