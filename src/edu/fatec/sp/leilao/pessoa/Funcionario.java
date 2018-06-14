package edu.fatec.sp.leilao.pessoa;

import edu.fatec.sp.controle.Endereco;

public class Funcionario extends Pessoa{
	
	private Double salarioFuncionario;
	
	public Double getSalarioFuncionario() {
		return salarioFuncionario;
	}

	public void setSalarioFuncionario(Double salarioFuncionario) {
		this.salarioFuncionario = salarioFuncionario;
	}

	public Funcionario(String nome, String sobrenome, String cpf, Endereco endereco,
			String login, String senha, Double salarioFuncionario) {
		super(nome, sobrenome, cpf, endereco, login, senha, "FUNCIONARIO");
		this.salarioFuncionario = salarioFuncionario;
	}

}
