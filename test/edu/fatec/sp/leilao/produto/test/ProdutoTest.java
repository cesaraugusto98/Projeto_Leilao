package edu.fatec.sp.leilao.produto.test;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDateTime;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import edu.fatec.sp.leilao.Leilao;
import edu.fatec.sp.leilao.banco.InstituicaoFinanceira;
import edu.fatec.sp.leilao.produto.Casa;
import edu.fatec.sp.leilao.produto.Produto;

/* TODO: Escrever testes de Produto*/

class ProdutoTest {
	InstituicaoFinanceira bancoTest;
	Leilao leilaoTest;
	Produto prod;
	@BeforeEach
	void setUp() throws Exception {
		bancoTest = new InstituicaoFinanceira("123456", "Inter", "contato.inter@inter.com.br");
		
		leilaoTest = new Leilao(bancoTest, "123", LocalDateTime.of(2018, 5, 3, 14, 0), LocalDateTime.of(2018, 5, 3, 20, 0), "Produto retidos no porto de Santos, no ultimo semestre", "Porto de Santos", "Santos", "SP");
		
		//prod = new Casa("123", "123548", 50000, "Casa", endImov, ufImov, cidImov, descricaoImov, areaTerreno, areaConstuidaCasa, numComodos)
	
	}

	@Test
	void test() {
		fail("Not yet implemented");
	}

}
