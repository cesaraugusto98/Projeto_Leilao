package edu.fatec.sp.leilao;

import java.time.LocalDateTime;

import edu.fatec.sp.controle.Endereco;
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
	private Endereco endereco;

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

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
	
	public Leilao(InstituicaoFinanceira banco, LocalDateTime dataInicioLeilao, LocalDateTime dataFimLeilao, String descricao, String dominioEletronico, Endereco endereco) {
		this.banco = banco;
		this.idLeilao = Identificador.getChave();
		this.dataInicioLeilao = dataInicioLeilao;
		this.dataFimLeilao = dataFimLeilao;
		this.statusLeilao = "EM ABERTO";
		this.descricao = descricao;
		this.dominioEletronico = dominioEletronico;
		this.endereco = endereco;
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
	
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(this.banco.toString()).append("\n");
		sb.append("Data/Hora Inicio: " + this.dataInicioLeilao.toString()).append("\n");
		sb.append("Data/Hora Fim: " + this.dataFimLeilao.toString()).append("\n");
		sb.append("Descricao: " + this.descricao).append("\n");
		sb.append("Dominio eletronico: " + this.dominioEletronico).append("\n");
		sb.append(this.endereco.toString());
		
		return sb.toString();
		
	}

}
