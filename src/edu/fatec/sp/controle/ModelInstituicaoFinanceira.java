package edu.fatec.sp.controle;

import java.util.ArrayList;
import java.util.List;

import edu.fatec.sp.leilao.banco.InstituicaoFinanceira;

public final class ModelInstituicaoFinanceira {
	List<InstituicaoFinanceira> listBanco = new ArrayList<>();
	
	public boolean addBanco(InstituicaoFinanceira b) {
		for(InstituicaoFinanceira bLista: this.listBanco) {
			if(bLista.equals(b)) {
				return false;	
			}			
		}
		this.listBanco.add(b);
		return true;
	}
	
	public InstituicaoFinanceira searchBanco(String cnpjBanco) {
		for(InstituicaoFinanceira b:this.listBanco) {
			if(b.getCnpj().equals(cnpjBanco)) {
				return b;
			}
		}
		return null;
	}
	
	public List<InstituicaoFinanceira> getAllBanco(){
		return this.listBanco;
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
	
}
