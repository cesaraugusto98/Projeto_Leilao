package edu.fatec.sp.controle;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import edu.fatec.sp.leilao.Leilao;
import edu.fatec.sp.leilao.banco.InstituicaoFinanceira;
import edu.fatec.sp.leilao.pessoa.Lance;
import edu.fatec.sp.leilao.pessoa.Pessoa;
import edu.fatec.sp.leilao.produto.Produto;

public class EscritorArquivo {
	
	public static void printProduto(List<Produto> lstProduto) throws IOException {
		PrintWriter escritor = new PrintWriter( new FileWriter("C:\\temp\\produtos-Projeto_Final_Leilao.det"));
		for(Produto p: lstProduto) {
			escritor.println(p.toString());
			escritor.println("--------------------------------------------------------------------------------------------");
		}
		escritor.close();
	}
	
	public static void printCliente(List<Pessoa> lstPessoa) throws IOException {
		PrintWriter escritor = new PrintWriter( new FileWriter("C:\\temp\\cliente-Projeto_Final_Leilao.det"));
		for(Pessoa p: lstPessoa) {
			if(p.getTipo() == "CLIENTE"){
				escritor.println(p.toString());
				escritor.println("--------------------------------------------------------------------------------------------");	
			}
		}
		escritor.close();
	}
	
	public static void printFuncionario(List<Pessoa> lstPessoa) throws IOException {
		PrintWriter escritor = new PrintWriter( new FileWriter("C:\\temp\\funcionario-Projeto_Final_Leilao.det"));
		for(Pessoa p: lstPessoa) {
			if(p.getTipo() == "FUNCIONARIO"){
				escritor.println(p.toString());
				escritor.println("--------------------------------------------------------------------------------------------");	
			}
		}
		escritor.close();
	}
	
	public static void printLance(List<Lance> lstLance) throws IOException {
		PrintWriter escritor = new PrintWriter( new FileWriter("C:\\temp\\lance-Projeto_Final_Leilao.det"));
		for(Lance l: lstLance) {
			escritor.println(l.toString());
			escritor.println("--------------------------------------------------------------------------------------------");
		}
		escritor.close();
	}
	
	public static void printLeilao(List<Leilao> lstLeilao) throws IOException {
		PrintWriter escritor = new PrintWriter( new FileWriter("C:\\temp\\leilao-Projeto_Final_Leilao.det"));
		for(Leilao l: lstLeilao) {
			escritor.println(l.toString());
			escritor.println("--------------------------------------------------------------------------------------------");
		}
		escritor.close();
	}
	
	public static void printBanco(List<InstituicaoFinanceira> lstBanco) throws IOException {
		PrintWriter escritor = new PrintWriter( new FileWriter("C:\\temp\\banco-Projeto_Final_Leilao.det"));
		for(InstituicaoFinanceira i: lstBanco) {
			escritor.println(i.toString());
			escritor.println("--------------------------------------------------------------------------------------------");
		}
		escritor.close();
	}
}
