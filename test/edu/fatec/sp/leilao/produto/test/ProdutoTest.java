package edu.fatec.sp.leilao.produto.test;

import static org.junit.jupiter.api.Assertions.fail;

import java.time.LocalDateTime;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import edu.fatec.sp.controle.Endereco;
import edu.fatec.sp.controle.ModelProduto;
import edu.fatec.sp.leilao.Leilao;
import edu.fatec.sp.leilao.banco.InstituicaoFinanceira;
import edu.fatec.sp.leilao.produto.Produto;

/* TODO: Escrever testes de Produto*/

class ProdutoTest {
	InstituicaoFinanceira bancoTest;
	Leilao leilaoTest;
	Produto prod;
	Endereco end;
	@BeforeEach
	void setUp() throws Exception {
		end = new Endereco("teste Endereco", "123", "apto 111", "Sao Paulo", "SP");
		bancoTest = new InstituicaoFinanceira("123456", "Inter", "contato.inter@inter.com.br", end);
		
		leilaoTest = new Leilao(bancoTest, LocalDateTime.of(2018, 5, 3, 14, 0), LocalDateTime.of(2018, 5, 3, 20, 0), "Produto retidos no porto de Santos, no ultimo semestre", "leilao.leilao.com.br", end);
		
		//prod = new Casa("123", "123548", 50000, "Casa", endImov, ufImov, cidImov, descricaoImov, areaTerreno, areaConstuidaCasa, numComodos)
	ModelProduto.searchTipoProdutoLeilao((ModelProduto.searchAllProdutoLeilao(leilaoTest)), "CASA");
	}

	@Test
	void test() {
		fail("Not yet implemented");
	}

}
