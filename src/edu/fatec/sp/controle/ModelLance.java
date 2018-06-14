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
			return true;
		}
		return false;
	}
	
	public static List<Lance> getAllLance(){
		return listLance;
	}
	
	public static Lance returnVencedor(Produto p, Leilao l) {
		List<Lance> lanValidos = new ArrayList<>();
		for(Lance lan:listLance) {
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
