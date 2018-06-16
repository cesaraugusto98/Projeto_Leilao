package edu.fatec.sp.controle;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import edu.fatec.sp.leilao.Leilao;
import edu.fatec.sp.leilao.pessoa.Lance;
import edu.fatec.sp.leilao.produto.Produto;

public final class ModelLance {
	static List<Lance> listLance = new ArrayList<>();
	
	public static boolean addLance(Lance l) {
		if(l.isValid()) {
			listLance.add(l);
			l.getProduto().setPrecoProdutoFinal(l.getValorLance());
			l.getProduto().setIdLanceVencedor(String.valueOf(l.getIdLance()));
			return true;
		}
		return false;
	}
	
	public static List<Lance> getAllLance(){
		return listLance;
	}
	
	public static Lance returnVencedor(Produto p) {
		for(Lance l:listLance) {
			if(p.getIdLanceVencedor().equals(String.valueOf(l.getIdLance()))){
				return l;
			}
		}
		return null;
	}
	
	public static Integer returnLastLance(Produto p, Leilao l) {
		List<Lance> lanValidos = new ArrayList<>();
		for(Lance lan:listLance) {
			if(lan.getLeilao().equals(l) && lan.getProduto().equals(p)) {
				lanValidos.add(lan);
			}
		}
		return lanValidos.size();
	}
	
	public static List<Lance> getLancesOrdenadosLeilao(Produto p, Leilao l){
		List<Lance> lanValidos = new ArrayList<>();
		
		for(Lance lan:listLance) {
			if(lan.getLeilao().equals(l) && lan.getProduto().equals(p)) {
				lanValidos.add(lan);
			}
		}
		Collections.sort(lanValidos);
		return lanValidos;
	}
}
