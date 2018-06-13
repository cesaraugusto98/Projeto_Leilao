package edu.fatec.sp.controle;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import edu.fatec.sp.leilao.Leilao;
import edu.fatec.sp.leilao.pessoa.Lance;
import edu.fatec.sp.leilao.produto.Produto;

public final class ModelLance {
	List<Lance> listLance = new ArrayList<>();
	
	public boolean addLance(Lance l) {
		if(l.isValid()) {
			listLance.add(l);
			return true;
		}
		return false;
	}
	
	public List<Lance> getAllLance(){
		return this.listLance;
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
	
	public Integer returnLastLance(Produto p, Leilao l) {
		List<Lance> lanValidos = new ArrayList<>();
		for(Lance lan:this.listLance) {
			if(lan.getLeilao().equals(l) && lan.getProduto().equals(p)) {
				lanValidos.add(lan);
			}
		}
		return lanValidos.size();
	}
	
	public List<Lance> getLancesOrdenadosLeilao(Produto p, Leilao l){
		List<Lance> lanValidos = new ArrayList<>();
		
		for(Lance lan:this.listLance) {
			if(lan.getLeilao().equals(l) && lan.getProduto().equals(p)) {
				lanValidos.add(lan);
			}
		}
		Collections.sort(lanValidos);
		return lanValidos;
	}
}
