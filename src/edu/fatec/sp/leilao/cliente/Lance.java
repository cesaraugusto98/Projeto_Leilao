package edu.fatec.sp.leilao.cliente;

import edu.fatec.sp.leilao.Leilao;
import edu.fatec.sp.leilao.produto.Produto;

public class Lance {
	private Leilao leilao;
	private Produto produto;
	private Cliente cliente;
	private String idLance;
	private Double valorLance;
	
	public String getIdLance() {
		return idLance;
	}

	public void setIdLance(String idLance) {
		this.idLance = idLance;
	}

	public Double getValorLance() {
		return valorLance;
	}

	public void setValorLance(Double valorLance) {
		this.valorLance = valorLance;
	}

	public Lance(Leilao leilao, Produto produto, Cliente cliente, String idLance, Double valorLance) {
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
}
