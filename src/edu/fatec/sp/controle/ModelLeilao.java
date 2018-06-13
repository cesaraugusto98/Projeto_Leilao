package edu.fatec.sp.controle;

import java.util.ArrayList;
import java.util.List;

import edu.fatec.sp.leilao.Leilao;

public final class ModelLeilao {
	List<Leilao> listLeilao = new ArrayList<>();
	
	public boolean addLeilao(Leilao l) {
		for(Leilao lLista: this.listLeilao) {
			if(lLista.equals(l)) {
				return false;	
			}			
		}
		this.listLeilao.add(l);
		return true;
	}
	
	public Leilao searchLeilao(String idLeilao) {
		for(Leilao l:this.listLeilao) {
			if(l.getIdLeilao().equals(idLeilao)) {
				return l;
			}
		}
		return null;
	}
	
	public List<Leilao> getAllLeilao(){
		return this.listLeilao;
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
	
}
