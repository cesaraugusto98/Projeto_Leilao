package edu.fatec.sp.controle;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import edu.fatec.sp.leilao.Leilao;
import edu.fatec.sp.leilao.banco.InstituicaoFinanceira;
import edu.fatec.sp.leilao.pessoa.Pessoa;
import edu.fatec.sp.leilao.pessoa.Funcionario;
import edu.fatec.sp.leilao.pessoa.Lance;
import edu.fatec.sp.leilao.produto.Produto;

public class DELETAR_Model {
	
	List<Produto> listProduto = new ArrayList<>();
	
	List<Leilao> listLeilao = new ArrayList<>();
	
	List<Pessoa> listPessoa = new ArrayList<>();
	
	List<InstituicaoFinanceira> listBanco = new ArrayList<>();
	
	List<Lance> listLance = new ArrayList<>();
	//----------------------------------------------------------------------------------------	
	public boolean addProduto(Produto p) {
		for(Produto pLista: this.listProduto) {
			if(pLista.equals(p)) {
				return false;	
			}			
		}
		this.listProduto.add(p);
		return true;
	}
	
	public Produto searchProduto(String idProduto) {
		for(Produto p:this.listProduto) {
			if(p.getIdProduto().equals(idProduto)) {
				return p;
			}
		}
		return null;
	}
	
	public List<Produto>  getAllProduto(){
		return this.listProduto;
	}
	
	public void updateProduto(Produto pAtualizar) {
		for(Produto p: this.listProduto) {
			if(p.equals(pAtualizar)) {
				this.listProduto.set(this.listProduto.indexOf(p), pAtualizar);
			}
		}
	}
	
	public void removeProduto(Produto pRemover) {
		for(Produto p: this.listProduto) {
			if(p.equals(pRemover)) {
				this.listProduto.remove(this.listProduto.indexOf(p));
			}
		}
	}
	//----------------------------------------------------------------------------------------
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
	//----------------------------------------------------------------------------------------
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
	//----------------------------------------------------------------------------------------
	
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
	//----------------------------------------------------------------------------------------
	
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