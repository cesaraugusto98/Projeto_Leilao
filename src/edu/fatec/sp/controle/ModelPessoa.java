package edu.fatec.sp.controle;

import java.util.ArrayList;
import java.util.List;

import edu.fatec.sp.leilao.pessoa.Pessoa;

public final class ModelPessoa {
	List<Pessoa> listPessoa = new ArrayList<>();
	
	public boolean addPessoa(Pessoa c) {
		for(Pessoa cLista: this.listPessoa) {
			if(cLista.equals(c)) {
				return false;	
			}			
		}
		this.listPessoa.add(c);
		return true;
	}
	
	public Pessoa searchPessoa(String cpfCliente ) {
		for(Pessoa c:this.listPessoa) {
			if(c.getCpf().equals(cpfCliente)) {
				return c;
			}
		}
		return null;
	}
	
	public List<Pessoa> getAllCliente(){
		return this.listPessoa;
	}
	
	public void updatePessoa(Pessoa cAtualizar) {
		for(Pessoa c: this.listPessoa) {
			if(c.equals(cAtualizar)) {
				this.listPessoa.set(this.listPessoa.indexOf(c), cAtualizar);
			}
		}
	}
	
	public void removePessoa(Pessoa cRemover) {
		for(Pessoa c: this.listPessoa) {
			if(c.equals(cRemover)) {
				this.listPessoa.remove(this.listPessoa.indexOf(c));
			}
		}
	}
	
	public Pessoa loginPessoa(String login, String senha) {
		for(Pessoa p: this.listPessoa) { 
			if(p.getLogin().equals(login) && p.getSenha().equals(senha)) {
				return p;
			}
		}
		return null;
	}
	
}
