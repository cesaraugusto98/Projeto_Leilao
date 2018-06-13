package edu.fatec.sp.leilao;

import java.time.LocalDateTime;

import edu.fatec.sp.controle.Identificador;
import edu.fatec.sp.leilao.banco.InstituicaoFinanceira;

public class Leilao {
	private InstituicaoFinanceira banco;
	private String idLeilao;
	private LocalDateTime dataInicioLeilao;
	private LocalDateTime dataFimLeilao;
	private String statusLeilao;
	private String descricao;
	private String dominioEletronico;
	private String endereco;
	private String cidade;
	private String estado;
	
	
	public InstituicaoFinanceira getBanco() {
		return banco;
	}
	
	public void setBanco(InstituicaoFinanceira banco) {
		this.banco = banco;
	}
	
	public String getDominioEletronico() {
		return dominioEletronico;
	}
	
	public void setDominioEletronico(String dominioEletronico) {
		this.dominioEletronico = dominioEletronico;
	}
	public String getIdLeilao() {
		return idLeilao;
	}
	public void setIdLeilao(String idLeilao) {
		this.idLeilao = idLeilao;
	}
	public LocalDateTime getDataInicioLeilao() {
		return dataInicioLeilao;
	}
	public void setDataInicioLeilao(LocalDateTime dataInicioLeilao) {
		this.dataInicioLeilao = dataInicioLeilao;
	}
	public LocalDateTime getDataFimLeilao() {
		return dataFimLeilao;
	}
	public void setDataFimLeilao(LocalDateTime dataFimLeilao) {
		this.dataFimLeilao = dataFimLeilao;
	}
	public String getStatusLeilao() {
		return statusLeilao;
	}
	public void setStatusLeilao(String statusLeilao) {
		this.statusLeilao = statusLeilao;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	public String getCidade() {
		return cidade;
	}
	public void setCidade(String cidade) {
		this.cidade = cidade;
	}
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}

	public Leilao(InstituicaoFinanceira banco, LocalDateTime dataInicioLeilao, LocalDateTime dataFimLeilao, String descricao, String dominioEletronico, String endereco, String cidade, String estado) {
		this.banco = banco;
		this.idLeilao = Identificador.getChave();
		this.dataInicioLeilao = dataInicioLeilao;
		this.dataFimLeilao = dataFimLeilao;
		this.statusLeilao = "EM ABERTO";
		this.descricao = descricao;
		this.dominioEletronico = dominioEletronico;
		this.endereco = endereco;
		this.cidade = cidade;
		this.estado = estado;
	}
	
	public void attStatus() {
		if(LocalDateTime.now().isAfter(this.dataInicioLeilao) && LocalDateTime.now().isBefore(this.dataFimLeilao))
		{
			this.statusLeilao = "EM ANDAMENTO";
		}
		else {
			if(LocalDateTime.now().isAfter(this.dataInicioLeilao) && LocalDateTime.now().isAfter(this.dataFimLeilao))
			{
				this.statusLeilao = "FINALIZADO";
			}
			else
			{
				this.statusLeilao = "EM ABERTO";
			}
		}
	}
	
	public boolean equals(Leilao l) {
		return this.idLeilao.equals(l.getIdLeilao());
	}

}
