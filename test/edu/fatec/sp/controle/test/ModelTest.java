package edu.fatec.sp.controle.test;

import static org.junit.jupiter.api.Assertions.*;
import java.time.LocalDateTime;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import edu.fatec.sp.controle.Model;
import edu.fatec.sp.leilao.Leilao;
import edu.fatec.sp.leilao.banco.InstituicaoFinanceira;
import edu.fatec.sp.leilao.pessoa.Lance;
import edu.fatec.sp.leilao.produto.Produto;

class ModelTest {
	Model model = new Model();
	InstituicaoFinanceira bancoTest;
	Leilao leilaoTest;
	Produto prodTest;
	Lance lTest;
	@BeforeEach
	void setUp() throws Exception {
		bancoTest = new InstituicaoFinanceira("123456", "Inter", "contato.inter@inter.com.br");
		
		leilaoTest = new Leilao(bancoTest, LocalDateTime.of(2018, 5, 3, 14, 0), LocalDateTime.of(2018, 5, 3, 20, 0), "Produto retidos no porto de Santos, no ultimo semestre", "leilao.leilao.com.br","Porto de Santos", "Santos", "SP");
		
		//prod = new Casa("123", "123548", 50000, "Casa", endImov, ufImov, cidImov, descricaoImov, areaTerreno, areaConstuidaCasa, numComodos)
	}

	@Test
	void testAddProduto() {
		//model.addProduto();
	}

	@Test
	void testSearchProduto() {
		fail("Not yet implemented");
	}

	@Test
	void testGetAllProduto() {
		fail("Not yet implemented");
	}

	@Test
	void testUpdateProduto() {
		fail("Not yet implemented");
	}

	@Test
	void testRemoveProduto() {
		fail("Not yet implemented");
	}

	@Test
	void testAddLeilao() {
		fail("Not yet implemented");
	}

	@Test
	void testSearchLeilao() {
		fail("Not yet implemented");
	}

	@Test
	void testGetAllLeilao() {
		fail("Not yet implemented");
	}

	@Test
	void testUpdateLeilao() {
		fail("Not yet implemented");
	}

	@Test
	void testRemoveLeilao() {
		fail("Not yet implemented");
	}

	@Test
	void testAddPessoa() {
		fail("Not yet implemented");
	}

	@Test
	void testSearchPessoa() {
		fail("Not yet implemented");
	}

	@Test
	void testGetAllPessoa() {
		fail("Not yet implemented");
	}

	@Test
	void testUpdatePessoa() {
		fail("Not yet implemented");
	}

	@Test
	void testRemovePessoa() {
		fail("Not yet implemented");
	}

	@Test
	void testAddBanco() {
		fail("Not yet implemented");
	}

	@Test
	void testSearchBanco() {
		fail("Not yet implemented");
	}

	@Test
	void testGetAllBanco() {
		fail("Not yet implemented");
	}

	@Test
	void testUpdatBanco() {
		fail("Not yet implemented");
	}

	@Test
	void testRemoveBanco() {
		fail("Not yet implemented");
	}

	@Test
	void testAddLance() {
		fail("Not yet implemented");
	}

	@Test
	void testGetAllLance() {
		fail("Not yet implemented");
	}

	@Test
	void testReturnVencedor() {
		fail("Not yet implemented");
	}

}
