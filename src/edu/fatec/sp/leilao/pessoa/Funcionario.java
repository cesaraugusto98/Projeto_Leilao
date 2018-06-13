package edu.fatec.sp.leilao.pessoa;

public class Funcionario extends Pessoa{
	
	private Double salarioFuncionario;
	
	public Double getSalarioFuncionario() {
		return salarioFuncionario;
	}

	public void setSalarioFuncionario(Double salarioFuncionario) {
		this.salarioFuncionario = salarioFuncionario;
	}

	public Funcionario(String nome, String sobrenome, String cpf, String endereco, String cidade, String estado,
			String login, String senha, Double salarioFuncionario) {
		super(nome, sobrenome, cpf, endereco, cidade, estado, login, senha, "FUNCIONARIO");
		this.salarioFuncionario = salarioFuncionario;
	}

}
