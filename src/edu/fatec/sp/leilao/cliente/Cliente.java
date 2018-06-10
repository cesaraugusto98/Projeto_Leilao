package edu.fatec.sp.leilao.cliente;

public class Cliente {
	private String nomeCliente;
	private String sobrenomeCliente;
	private String cpfCliente;
	private String enderecoCliente;
	private String cidadeCliente;
	private String estadoCliente;
	private String loginCliente;
	private String senhaCliente;
	
	public String getCpfCliente() {
		return cpfCliente;
	}
	
	public String getNomeCliente() {
		return nomeCliente;
	}
	public void setNomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}
	public String getSobrenomeCliente() {
		return sobrenomeCliente;
	}
	public void setSobrenomeCliente(String sobrenomeCliente) {
		this.sobrenomeCliente = sobrenomeCliente;
	}
	
	public void setCpfCliente(String cpfCliente) {
		this.cpfCliente = cpfCliente;
	}
	public String getEnderecoCliente() {
		return enderecoCliente;
	}
	public void setEnderecoCliente(String enderecoCliente) {
		this.enderecoCliente = enderecoCliente;
	}
	public String getCidadeCliente() {
		return cidadeCliente;
	}
	public void setCidadeCliente(String cidadeCliente) {
		this.cidadeCliente = cidadeCliente;
	}
	public String getEstadoCliente() {
		return estadoCliente;
	}
	public void setEstadoCliente(String estadoCliente) {
		this.estadoCliente = estadoCliente;
	}
	public String getLoginCliente() {
		return loginCliente;
	}
	public void setLoginCliente(String loginCliente) {
		this.loginCliente = loginCliente;
	}
	public String getSenhaCliente() {
		return senhaCliente;
	}
	public void setSenhaCliente(String senhaCliente) {
		this.senhaCliente = senhaCliente;
	}
	
	public Cliente(String nomeCliente, String sobrenomeCliente, String cpfCliente, String enderecoCliente, String cidadeCliente, String estadoCliente, String loginCliente, String senhaCliente) {
		this.nomeCliente = nomeCliente;
		this.sobrenomeCliente = sobrenomeCliente;
		this.cpfCliente = cpfCliente;
		this.enderecoCliente = enderecoCliente;
		this.cidadeCliente = cidadeCliente;
		this.estadoCliente = estadoCliente;
		this.loginCliente = loginCliente;
		this.senhaCliente = senhaCliente;
	}
	
	public boolean equals(Cliente c) {
		return this.cpfCliente.equals(c.getCpfCliente());
	}
}
