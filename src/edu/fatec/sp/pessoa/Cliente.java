package edu.fatec.sp.pessoa;

import edu.fatec.sp.controle.Endereco;

public class Cliente extends Pessoa{
	public Cliente(String nomeCliente, String sobrenomeCliente, String cpfCliente, Endereco enderecoCliente, String loginCliente, String senhaCliente) {
		super(nomeCliente, sobrenomeCliente, cpfCliente, enderecoCliente, loginCliente, senhaCliente, "CLIENTE");
	}	
	
	public String toString() {
		return super.toString();
	}
}
