package edu.fatec.sp.controle;

import java.util.ArrayList;
import java.util.List;

import edu.fatec.sp.leilao.Leilao;
import edu.fatec.sp.leilao.produto.Produto;

public final class ModelProduto {
	List<Produto> listProduto = new ArrayList<>();
	
	public boolean addProduto(Produto p) {
		for(Produto pLista: this.listProduto) {
			if(pLista.equals(p)) {
				return false;	
			}			
		}
		this.listProduto.add(p);
		return true;
	}
	
	public List<Produto> searchAllProdutoLeilao(Leilao l){
		List<Produto> prodLeilao = new ArrayList<>();
		for(Produto p: this.listProduto) {
			if(p.getIdLeilao().equals(l)) {
				prodLeilao.add(p);
			}
		}
		
		return prodLeilao;
	}
	
	public Produto searchProduto(String idProduto) {
		for(Produto p:this.listProduto) {
			if(p.getIdProduto().equals(idProduto)) {
				return p;
			}
		}
		return null;
	}
	
	public List<Produto>  getAllProduto(){
		return this.listProduto;
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
}
