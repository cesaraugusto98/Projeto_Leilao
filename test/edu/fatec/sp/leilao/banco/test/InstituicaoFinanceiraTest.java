package edu.fatec.sp.leilao.banco.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import edu.fatec.sp.leilao.banco.InstituicaoFinanceira;

class InstituicaoFinanceiraTest {
	InstituicaoFinanceira bancoTeste;
	InstituicaoFinanceira bd2;
	@BeforeEach
	void setUp() throws Exception {
		bancoTeste = new InstituicaoFinanceira("1234679", "ITAU", "contato@itau.com.br");
		bd2 = new InstituicaoFinanceira("1234679", "Iter", "contato.inter@inter.com.br");
	}

	@Test
	void test() {
		assertTrue(bancoTeste.equals(bd2));
		
		bd2.setCnpj("1111111");
		
		assertFalse(bancoTeste.equals(bd2));
	}

}
