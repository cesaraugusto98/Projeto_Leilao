package edu.fatec.sp.controle;

import java.util.ArrayList;
import java.util.List;

import edu.fatec.sp.leilao.banco.InstituicaoFinanceira;

public final class ModelInstituicaoFinanceira {
	static List<InstituicaoFinanceira> listBanco = new ArrayList<>();
	
	public static boolean addBanco(InstituicaoFinanceira b) {
		for(InstituicaoFinanceira bLista: listBanco) {
			if(bLista.equals(b)) {
				return false;	
			}			
		}
		listBanco.add(b);
		return true;
	}
	
	public static InstituicaoFinanceira searchBanco(String cnpjBanco) {
		for(InstituicaoFinanceira b:listBanco) {
			if(b.getCnpj().equals(cnpjBanco)) {
				return b;
			}
		}
		return null;
	}
	
	public static List<InstituicaoFinanceira> getAllBanco(){
		return listBanco;
	}
	
	public static void updatBanco(InstituicaoFinanceira bAtualizar) {
		for(InstituicaoFinanceira b: listBanco) {
			if(b.equals(bAtualizar)) {
				listBanco.set(listBanco.indexOf(b), bAtualizar);
			}
		}
	}
	
	public static void removeBanco(InstituicaoFinanceira bRemover) {
		for(InstituicaoFinanceira b: listBanco) {
			if(b.equals(bRemover)) {
				listBanco.remove(listBanco.indexOf(b));
			}
		}
	}
}
