package edu.fatec.sp.leilao.banco.test;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import edu.fatec.sp.controle.Endereco;
import edu.fatec.sp.controle.ModelInstituicaoFinanceira;
import edu.fatec.sp.leilao.banco.InstituicaoFinanceira;

class InstituicaoFinanceiraTest {
	InstituicaoFinanceira bancoTeste;
	InstituicaoFinanceira bd2;
	Endereco end;
	@BeforeEach
	void setUp() throws Exception {
		
		end = new Endereco("teste Endereco", "123", "apto 111", "Sao Paulo", "SP");
		bancoTeste = new InstituicaoFinanceira("1234679", "ITAU", "contato@itau.com.br", end);
		bd2 = new InstituicaoFinanceira("1234679", "Iter", "contato.inter@inter.com.br", end);
	}

	@Test
	void test() {
		ModelInstituicaoFinanceira.addBanco(bancoTeste);
		assertTrue(bancoTeste.equals(bd2));
		
		bd2.setCnpj("1111111");
		
		assertFalse(bancoTeste.equals(bd2));
		assertEquals(ModelInstituicaoFinanceira.searchBanco(bancoTeste.getCnpj()), bancoTeste);


	}

}
