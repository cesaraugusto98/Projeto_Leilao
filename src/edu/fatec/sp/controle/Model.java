package edu.fatec.sp.controle;

import java.util.ArrayList;
import java.util.List;

import edu.fatec.sp.leilao.Leilao;
import edu.fatec.sp.leilao.banco.InstituicaoFinanceira;
import edu.fatec.sp.leilao.cliente.Cliente;
import edu.fatec.sp.leilao.cliente.Lance;
import edu.fatec.sp.leilao.produto.Produto;

public class Model {
	
	List<Produto> listProduto = new ArrayList<>();
	
	List<Leilao> listLeilao = new ArrayList<>();
	
	List<Cliente> listCliente = new ArrayList<>();
	
	List<InstituicaoFinanceira> listBanco = new ArrayList<>();
	
	List<Lance> listLance = new ArrayList<>();
	
	//----------------------------------------------------------------------------------------	
	public void addProduto(Produto p) {
		this.listProduto.add(p);
	}
	
	public void updateProduto(Produto pAtualizar) {
		for(Produto p: this.listProduto) {
			if(p.equals(pAtualizar)) {
				this.listProduto.set(this.listProduto.indexOf(p), pAtualizar);
			}
		}
	}
	
	public void removeProduto(Produto pRemover) {
		for(Produto p: this.listProduto) {
			if(p.equals(pRemover)) {
				this.listProduto.remove(this.listProduto.indexOf(p));
			}
		}
	}
	//----------------------------------------------------------------------------------------
	public void addLeilao(Leilao l) {
		this.listLeilao.add(l);
	}
	
	public void updateLeilao(Leilao lAtualizar) {
		for(Leilao l: this.listLeilao) {
			if(l.equals(lAtualizar)) {
				this.listLeilao.set(this.listLeilao.indexOf(l), lAtualizar);
			}
		}
	}
	
	public void removeLeilao(Leilao lRemover) {
		for(Leilao l: this.listLeilao) {
			if(l.equals(lRemover)) {
				this.listLeilao.remove(this.listLeilao.indexOf(l));
			}
		}
	}
	//----------------------------------------------------------------------------------------
	
	public void addCliente(Cliente c) {
		this.listCliente.add(c);
	}
	
	public void updateCliente(Cliente cAtualizar) {
		for(Cliente c: this.listCliente) {
			if(c.equals(cAtualizar)) {
				this.listCliente.set(this.listCliente.indexOf(c), cAtualizar);
			}
		}
	}
	
	public void removeCliente(Cliente cRemover) {
		for(Cliente c: this.listCliente) {
			if(c.equals(cRemover)) {
				this.listCliente.remove(this.listCliente.indexOf(c));
			}
		}
	}
	//----------------------------------------------------------------------------------------
	
	public void addBanco(InstituicaoFinanceira b) {
		this.listBanco.add(b);
	}
	
	public void updatBanco(InstituicaoFinanceira bAtualizar) {
		for(InstituicaoFinanceira b: this.listBanco) {
			if(b.equals(bAtualizar)) {
				this.listBanco.set(this.listBanco.indexOf(b), bAtualizar);
			}
		}
	}
	
	public void removeBanco(InstituicaoFinanceira bRemover) {
		for(InstituicaoFinanceira b: this.listBanco) {
			if(b.equals(bRemover)) {
				this.listBanco.remove(this.listBanco.indexOf(b));
			}
		}
	}
	//----------------------------------------------------------------------------------------
	
	public boolean addLance(Lance l) {
		if(l.isValid()) {
			listLance.add(l);
			return true;
		}
		return false;
	}
	
	public Lance returnVencedor(Produto p, Leilao l) {
		List<Lance> lanValidos = new ArrayList<>();
		for(Lance lan:this.listLance) {
			if(lan.getLeilao().equals(l) && lan.getProduto().equals(p)) {
				lanValidos.add(lan);
			}
		}
		if(lanValidos.size() < 1) {
			return null;
		}else {
			int lanVencedor = 0;
			for(int i = 1; i < lanValidos.size(); i++) {
				if(lanValidos.get(lanVencedor).getValorLance() < lanValidos.get(0).getValorLance()) {
					lanVencedor = i;
				}
			}
			return lanValidos.get(lanVencedor);
		}
	}
}