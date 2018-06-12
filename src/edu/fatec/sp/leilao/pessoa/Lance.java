package edu.fatec.sp.leilao.pessoa;

import edu.fatec.sp.leilao.Leilao;
import edu.fatec.sp.leilao.produto.Produto;

public class Lance implements Comparable<Lance>{
	private Leilao leilao;
	private Produto produto;
	private Cliente cliente;
	private Integer idLance;
	private Double valorLance;
	
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

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	
	public Integer getIdLance() {
		return idLance;
	}

	public void setIdLance(Integer idLance) {
		this.idLance = idLance;
	}

	public Double getValorLance() {
		return valorLance;
	}

	public void setValorLance(Double valorLance) {
		this.valorLance = valorLance;
	}

	public Lance(Leilao leilao, Produto produto, Cliente cliente, Integer idLance, Double valorLance) {
		this.leilao = leilao;
		this.produto = produto;
		this.cliente = cliente;
		this.idLance =  idLance;
		this.valorLance = valorLance;
	}
	
	public boolean isValid() {
		return this.valorLance > this.produto.getPrecoProduto();
	}
	
	public boolean isGreather(Lance l) {
		return this.valorLance > l.getValorLance();
	}

	@Override
	public int compareTo(Lance l) {
		return (this.getValorLance() < l.getValorLance() ? -1 : 
            (this.getValorLance() == l.getValorLance() ? 0 : 1));
	}
}
