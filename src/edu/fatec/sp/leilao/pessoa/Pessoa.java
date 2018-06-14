package edu.fatec.sp.leilao.pessoa;

import edu.fatec.sp.controle.Endereco;

public abstract class Pessoa {
	private String nome;
	private String sobrenome;
	private String cpf;
	private Endereco endereco;
	private String login;
	private String senha;
	private String tipo;
	
	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getCpf() {
		return cpf;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getSobrenome() {
		return sobrenome;
	}
	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}
	
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public Endereco getEndereco() {
		return endereco;
	}
	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}	
	public String getLogin() {
		return login;
	}
	public void setLogin(String login) {
		this.login = login;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	
	public Pessoa(String nome, String sobrenome, String cpf, Endereco endereco, String login, String senha, String tipo) {
		this.nome = nome;
		this.sobrenome = sobrenome;
		this.cpf = cpf;
		this.endereco = endereco;
		this.login = login;
		this.senha = senha;
		this.tipo = tipo;
	}
	
	public boolean equals(Pessoa c) {
		return this.cpf.equals(c.getCpf()) && this.login.equals(c.getLogin());
	}
}
