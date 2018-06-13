package edu.fatec.sp.leilao.pessoa;

public class Cliente extends Pessoa{
	public Cliente(String nomeCliente, String sobrenomeCliente, String cpfCliente, String enderecoCliente, String cidadeCliente, String estadoCliente, String loginCliente, String senhaCliente) {
		super(nomeCliente, sobrenomeCliente, cpfCliente, enderecoCliente, cidadeCliente, estadoCliente, loginCliente, senhaCliente, "CLIENTE");
	}	
	
}
