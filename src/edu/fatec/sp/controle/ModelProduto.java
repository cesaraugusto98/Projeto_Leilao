package edu.fatec.sp.controle;

import java.util.ArrayList;
import java.util.List;

import edu.fatec.sp.leilao.Leilao;
import edu.fatec.sp.produto.Imovel;
import edu.fatec.sp.produto.Produto;
import edu.fatec.sp.produto.Veiculo;

public final class ModelProduto {
	static List<Produto> listProduto = new ArrayList<>();
	
	public static boolean addProduto(Produto p) {
		for(Produto pLista: listProduto) {
			if(pLista.equals(p)) {
				return false;	
			}			
		}
		listProduto.add(p);
		return true;
	}
	
	public static List<Produto> searchAllProdutoLeilao(Leilao l){
		List<Produto> prodLeilao = new ArrayList<>();
		for(Produto p: listProduto) {
			if(p.getIdLeilao().equals(l)) {
				prodLeilao.add(p);
			}
		}
		
		return prodLeilao;
	}
	
	public static List<Produto> searchTipoProdutoLeilao(List<Produto> lstProd, String tipo){
		List<Produto> lstProdTipo = new ArrayList<>();
		for(Produto p:lstProd) {
			if(p.getTipoProduto().equals(tipo)) {
				lstProdTipo.add(p);
			}
		}
		return lstProdTipo;
	}
	public static List<Produto> searchPalavraChaveProdutoLeilao(List<Produto> lstProd, String palavraChave){
		List<Produto> lstProdPalavraChave = new ArrayList<>();
		for(Produto p:lstProd) {
			if(p.getTipoProduto().equals("MOTO") || p.getTipoProduto().equals("CARRO")){
				if(((Veiculo)p).getEstadoVeiculo().contains(palavraChave))
					lstProdPalavraChave.add(p);
				
			}else {
				if(((Imovel)p).getDescricaoImov().contains(palavraChave))
					lstProdPalavraChave.add(p);
			}
			
		}
		return lstProdPalavraChave;
	}
	
	public static List<Produto> searchIntervaloValorProdutoLeilao(List<Produto> lstProd, Double min, Double max){
		List<Produto> lstProdIntervalo = new ArrayList<>();
		for(Produto p:lstProd) {
			if(p.getPrecoProduto() >= min || p.getPrecoProduto() <= max)
				lstProdIntervalo.add(p);
		}
		return lstProdIntervalo;
	}
	
	
	public static Produto searchProduto(String idProduto) {
		for(Produto p:listProduto) {
			if(p.getIdProduto().equals(idProduto)) {
				return p;
			}
		}
		return null;
	}
	
	public static List<Produto>  getAllProduto(){
		return listProduto;
	}
	
	public static void updateProduto(Produto pAtualizar) {
		for(Produto p: listProduto) {
			if(p.equals(pAtualizar)) {
				listProduto.set(listProduto.indexOf(p), pAtualizar);
			}
		}
	}
	
	public static void removeProduto(Produto pRemover) {
		for(Produto p: listProduto) {
			if(p.equals(pRemover)) {
				listProduto.remove(listProduto.indexOf(p));
			}
		}
	}
}
