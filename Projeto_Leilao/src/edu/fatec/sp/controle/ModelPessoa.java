package edu.fatec.sp.controle;

import java.util.ArrayList;
import java.util.List;

import edu.fatec.sp.leilao.pessoa.Pessoa;

public final class ModelPessoa {
	static List<Pessoa> listPessoa = new ArrayList<>();
	
	public static boolean addPessoa(Pessoa c) {
		for(Pessoa cLista: listPessoa) {
			if(cLista.equals(c)) {
				return false;	
			}			
		}
		listPessoa.add(c);
		return true;
	}
	
	public static Pessoa searchPessoa(String cpfCliente ) {
		for(Pessoa c:listPessoa) {
			if(c.getCpf().equals(cpfCliente)) {
				return c;
			}
		}
		return null;
	}
	
	public static List<Pessoa> getAllPessoa(){
		return listPessoa;
	}
	
	public static void updatePessoa(Pessoa cAtualizar) {
		for(Pessoa c: listPessoa) {
			if(c.equals(cAtualizar)) {
				listPessoa.set(listPessoa.indexOf(c), cAtualizar);
			}
		}
	}
	
	public static void removePessoa(Pessoa cRemover) {
		for(Pessoa c: listPessoa) {
			if(c.equals(cRemover)) {
				listPessoa.remove(listPessoa.indexOf(c));
			}
		}
	}
	
	public static Pessoa loginPessoa(String login, String senha) {
		for(Pessoa p: listPessoa) { 
			if(p.getLogin().equals(login) && p.getSenha().equals(senha)) {
				return p;
			}
		}
		return null;
	}
}
