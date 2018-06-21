package edu.fatec.sp.pessoa.test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.time.LocalDateTime;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import edu.fatec.sp.banco.InstituicaoFinanceira;
import edu.fatec.sp.controle.Endereco;
import edu.fatec.sp.controle.ModelLance;
import edu.fatec.sp.controle.ModelProduto;
import edu.fatec.sp.leilao.Leilao;
import edu.fatec.sp.pessoa.Cliente;
import edu.fatec.sp.pessoa.Lance;
import edu.fatec.sp.produto.Moto;
import edu.fatec.sp.produto.Produto;

class LanceTest {
	InstituicaoFinanceira bancoTest;
	Leilao leilaoTest;
	Produto prod;
	Endereco end;
	Cliente cliTest;
	Lance lanceTest;
	Lance lanceTest2;
	Lance lanceTest3;
	@BeforeEach
	void setUp() throws Exception {
		end = new Endereco("teste Endereco", "123", "apto 111", "Sao Paulo", "SP");
		bancoTest = new InstituicaoFinanceira("123456", "Inter", "contato.inter@inter.com.br", end);
		
		leilaoTest = new Leilao(bancoTest, LocalDateTime.of(2018, 5, 3, 14, 0), LocalDateTime.of(2018, 5, 3, 20, 0), "Produto retidos no porto de Santos, no ultimo semestre", "leilao.leilao.com.br", end);
		prod = new Moto(leilaoTest, 5000.00, 2012, "Honda", 5000, "cb250r", "branca", 0, "AAA-0000", 600);
		cliTest = new Cliente("Teste", "Ignat", "12315646", end, "ignat", "1234");
		lanceTest = new Lance(leilaoTest, prod, cliTest, 6000.00);
		lanceTest2 = new Lance(leilaoTest, prod, cliTest, 7000.00);
		lanceTest3 = new Lance(leilaoTest, prod, cliTest, 8000.00);
		
	}

	@Test
	void darLance() {
		assertTrue(lanceTest.isValid());
		ModelProduto.addProduto(prod);
		ModelLance.addLance(lanceTest);
		assertEquals(String.valueOf(lanceTest.getIdLance()), prod.getIdLanceVencedor());
		assertEquals(lanceTest.getValorLance(), prod.getPrecoProdutoFinal(), 0.1);
		
		ModelLance.addLance(lanceTest2);
		ModelLance.addLance(lanceTest3);
		
		assertEquals(ModelLance.getLancesOrdenadosLeilao(prod, leilaoTest).size(), 3);
	}

}
