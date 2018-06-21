package edu.fatec.sp.controle;

import java.util.ArrayList;
import java.util.List;

import edu.fatec.sp.leilao.Leilao;

public final class ModelLeilao {
	static List<Leilao> listLeilao = new ArrayList<>();
	
	public static boolean addLeilao(Leilao l) {
		for(Leilao lLista: listLeilao) {
			if(lLista.equals(l)) {
				return false;	
			}			
		}
		listLeilao.add(l);
		return true;
	}
	
	public static Leilao searchLeilao(String idLeilao) {
		for(Leilao l:listLeilao) {
			if(l.getIdLeilao().equals(idLeilao)) {
				return l;
			}
		}
		return null;
	}
	
	public static List<Leilao> getAllLeilao(){
		return listLeilao;
	}
	
	public static void updateLeilao(Leilao lAtualizar) {
		for(Leilao l: listLeilao) {
			if(l.equals(lAtualizar)) {
				listLeilao.set(listLeilao.indexOf(l), lAtualizar);
			}
		}
	}
	
	public static void removeLeilao(Leilao lRemover) {
		for(Leilao l: listLeilao) {
			if(l.equals(lRemover)) {
				listLeilao.remove(listLeilao.indexOf(l));
			}
		}
	}	
}
