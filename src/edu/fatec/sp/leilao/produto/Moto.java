package edu.fatec.sp.leilao.produto;

public class Moto extends Veiculo {

	private Integer cilindradasMoto;

	public Integer getCilindradasMoto() {
		return cilindradasMoto;
	}

	public void setCilindradasMoto(Integer cilindradasMoto) {
		this.cilindradasMoto = cilindradasMoto;
	}
	
	public Moto(String idLeilao, String idProduto, Double precoProduto, String tipoProduto, Integer anoVeiculo, String fabricanteVeiculo,
			Integer kmsRodadosVeiculo, String estadoVeiculo, String corVeiculo, Integer numMultas, String placaVeiculo, Integer cilindradasMoto) {
		super(idLeilao, idProduto, precoProduto, tipoProduto, anoVeiculo, fabricanteVeiculo, kmsRodadosVeiculo, estadoVeiculo, corVeiculo,
				numMultas, placaVeiculo);
		this.cilindradasMoto = cilindradasMoto;
	}
	
}