package edu.fatec.sp.leilao.produto;

import edu.fatec.sp.controle.Endereco;
import edu.fatec.sp.leilao.Leilao;

public abstract class Imovel extends Produto {
	
	private Endereco endereco;
	private String descricaoImov;
	
	
	public Endereco getEndereco() {
		return endereco;
	}
	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}
	public String getDescricaoImov() {
		return descricaoImov;
	}
	public void setDescricaoImov(String descricaoImov) {
		this.descricaoImov = descricaoImov;
	}
	
	public Imovel(Leilao idLeilao, Double precoProduto, Double precoProdutoFinal, String tipoProduto, Endereco endereco, String descricaoImov) {
		super(idLeilao, precoProduto, precoProdutoFinal ,tipoProduto);
		this.endereco = endereco;
		this.descricaoImov = descricaoImov;
	}

}
