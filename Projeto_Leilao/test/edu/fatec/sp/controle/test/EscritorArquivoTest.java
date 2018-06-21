package edu.fatec.sp.controle.test;

import static org.junit.Assert.fail;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import edu.fatec.sp.controle.Endereco;
import edu.fatec.sp.controle.EscritorArquivo;
import edu.fatec.sp.controle.ModelInstituicaoFinanceira;
import edu.fatec.sp.controle.ModelLance;
import edu.fatec.sp.controle.ModelLeilao;
import edu.fatec.sp.controle.ModelPessoa;
import edu.fatec.sp.controle.ModelProduto;
import edu.fatec.sp.leilao.Leilao;
import edu.fatec.sp.leilao.banco.InstituicaoFinanceira;
import edu.fatec.sp.leilao.pessoa.Cliente;
import edu.fatec.sp.leilao.pessoa.Funcionario;
import edu.fatec.sp.leilao.pessoa.Lance;
import edu.fatec.sp.leilao.pessoa.Pessoa;
import edu.fatec.sp.leilao.produto.Moto;
import edu.fatec.sp.leilao.produto.Produto;
import edu.fatec.sp.leilao.produto.Terreno;

class EscritorArquivoTest {
	InstituicaoFinanceira bancoTest1;
	InstituicaoFinanceira bancoTest2;
	Leilao leilaoTest;
	Produto prod1;
	Produto prod2;
	Endereco end;
	Pessoa pTest;
	Pessoa cTest;
	Lance lanceTeste1;
	Lance lanceTeste2;
	
	private boolean verificaExistencia(String diretorio) {
		File f = new File(diretorio);
		if(f.exists() && !f.isDirectory()) 
		    return true;
		else
			return false;
	}
	
	@BeforeEach
	void setUp() throws Exception {
		end = new Endereco("teste Endereco", "123", "apto 111", "Sao Paulo", "SP");
		
		bancoTest1 = new InstituicaoFinanceira("123456", "Inter", "contato.inter@inter.com.br", end);
		bancoTest2 = new InstituicaoFinanceira("123456", "Intau", "contato.itau@itau.com", end);
		leilaoTest = new Leilao(bancoTest1, LocalDateTime.of(2018, 5, 3, 14, 0), LocalDateTime.of(2018, 5, 3, 20, 0), "Produto retidos no porto de Santos, no ultimo semestre", "leilao.leilao.com.br", end);
		
		prod1 = new Moto(leilaoTest, 6000.00, 2012, "Honda", 5000, "CBR1000", "Branca", 5, "AAA-0000", 1000);
		prod2 = new Terreno(leilaoTest, 60000.00, "TERRENO", end, "Terreno em condominio fechado", 250.00);
		
		pTest = new Funcionario("Gustavo", "Soares", "1234564897", end, "GSOA", "SENHASENHA", 6000.00);
		cTest = new Cliente("Cesar", "Santos", "999999999", end, "CESAR", "SENHA");
		
		lanceTeste1 = new Lance(leilaoTest, prod1, cTest, 7000.00);
		lanceTeste2 = new Lance(leilaoTest, prod2, cTest, 70000.00);
		
		ModelProduto.addProduto(prod1);
		ModelProduto.addProduto(prod2);
		ModelInstituicaoFinanceira.addBanco(bancoTest1);
		ModelInstituicaoFinanceira.addBanco(bancoTest2);
		ModelPessoa.addPessoa(pTest);
		ModelPessoa.addPessoa(cTest);
		ModelLance.addLance(lanceTeste1);
		ModelLance.addLance(lanceTeste2);
	}

	@Test
	void testPrintProduto() {
		try {
			EscritorArquivo.printProduto(ModelProduto.getAllProduto());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			fail();
		}
		
		assertTrue(verificaExistencia("C:\\temp\\produtos-Projeto_Final_Leilao.det"));
	}

	@Test
	void testPrintFuncionario() {
		try {
			EscritorArquivo.printFuncionario(ModelPessoa.getAllPessoa());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			fail();
		}
		
		assertTrue(verificaExistencia("C:\\temp\\funcionario-Projeto_Final_Leilao.det"));
		
	}

	@Test
	void testPrintCliente() {
		try {
			EscritorArquivo.printCliente(ModelPessoa.getAllPessoa());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			fail();
		}
		
		assertTrue(verificaExistencia("C:\\temp\\cliente-Projeto_Final_Leilao.det"));
	}

	@Test
	void testPrintLance() {
		try {
			EscritorArquivo.printLance(ModelLance.getAllLance());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			fail();
		}
		assertTrue(verificaExistencia("C:\\temp\\lance-Projeto_Final_Leilao.det"));
	}

	@Test
	void testPrintLeilao() {
		try {
			EscritorArquivo.printLeilao(ModelLeilao.getAllLeilao());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			fail();
		}
		assertTrue(verificaExistencia("C:\\temp\\leilao-Projeto_Final_Leilao.det"));
	}
	
	@Test
	void testPrintBanco() {
		try {
			EscritorArquivo.printBanco(ModelInstituicaoFinanceira.getAllBanco());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			fail();
		}
		
		assertTrue(verificaExistencia("C:\\temp\\banco-Projeto_Final_Leilao.det"));

	}
}
