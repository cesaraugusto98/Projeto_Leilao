package edu.fatec.sp.leilao.pessoa;

import edu.fatec.sp.controle.Identificador;
import edu.fatec.sp.leilao.Leilao;
import edu.fatec.sp.leilao.produto.Produto;

public class Lance implements Comparable<Lance>{
	private Leilao leilao;
	private Produto produto;
	private Pessoa cliente;
	private Integer idLance;	
	private Double valorLance;
	
	public Integer getIdLance() {
		return idLance;
	}

	public void setIdLance(Integer idLance) {
		this.idLance = idLance;
	}

	
	public Leilao getLeilao() {
		return leilao;
	}

	public void setLeilao(Leilao leilao) {
		this.leilao = leilao;
	}

	public Produto getProduto() {
		return produto;
	}

	public void setProduto(Produto produto) {
		this.produto = produto;
	}

	public Pessoa getCliente() {
		return cliente;
	}

	public void setCliente(Pessoa cliente) {
		this.cliente = cliente;
	}

	public Double getValorLance() {
		return valorLance;
	}

	public void setValorLance(Double valorLance) {
		this.valorLance = valorLance;
	}

	public Lance(Leilao leilao, Produto produto, Pessoa cTest, Double valorLance) {
		this.leilao = leilao;
		this.produto = produto;
		this.cliente = cTest;
		this.idLance =  Identificador.getChaveLance();
		this.valorLance = valorLance;
	}
	
	public boolean isValid() {
		return this.valorLance > this.produto.getPrecoProdutoFinal();
	}
	
	public boolean isGreather(Lance l) {
		return this.valorLance > l.getValorLance();
	}

	@Override
	public int compareTo(Lance l) {
		return (this.getIdLance() < l.getIdLance() ? -1 : 
            (this.getIdLance() == l.getIdLance() ? 0 : 1));
	}
	
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(this.leilao.toString()).append("\n");
		sb.append(this.produto.toString()).append("\n");
		sb.append(this.cliente.toString()).append("\n");
		sb.append("Indentificador: " + this.idLance).append("\n");
		sb.append("Valor Lance: " + this.valorLance);
		
		return sb.toString();
		
	}
}
