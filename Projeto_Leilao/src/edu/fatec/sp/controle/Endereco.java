package edu.fatec.sp.controle;

public class Endereco {
	private String endereco;
	private String numero;
	private String cidade;
	private String estado;
	private String complemento;
	
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	public String getNumero() {
		return numero;
	}
	public void setNumero(String numero) {
		this.numero = numero;
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
	public String getComplemento() {
		return complemento;
	}
	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}
	
	public Endereco(String endereco, String numero, String complemento,String cidade, String estado) {
		this.endereco = endereco;
		this.numero = numero;
		if(complemento == null) {	
			this.complemento = "";
		}else {
			this.complemento = complemento;
		}
			
		this.cidade = cidade;
		this.estado = estado;
	}
	
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("Endereco: " + this.endereco).append("\n");
		sb.append("Numero: " + this.numero).append("\n");
		sb.append("Complemento: " + this.complemento).append("\n");
		sb.append("Cidade: " + this.cidade).append("\n");
		sb.append("Estado: " + this.estado);
		return sb.toString();
	}
}
