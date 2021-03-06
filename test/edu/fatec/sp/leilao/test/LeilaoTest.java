package edu.fatec.sp.leilao.test;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDateTime;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import edu.fatec.sp.banco.InstituicaoFinanceira;
import edu.fatec.sp.controle.Endereco;
import edu.fatec.sp.leilao.Leilao;

class LeilaoTest {
	InstituicaoFinanceira banco;
	Leilao l1;
	Leilao l2;
	Leilao l3;
	Endereco end;
	
	
	@BeforeEach
	void setUp() throws Exception {
		end = new Endereco("teste Endereco", "123", "apto 111", "Sao Paulo", "SP");
		banco = new InstituicaoFinanceira("12344555", "inter", "inter@inter.com.br", end);
		l1 = new Leilao(banco, LocalDateTime.of(2018, 3, 14, 10, 00), LocalDateTime.of(2018, 3, 14, 14, 00), "descricao teste", "link.com.br", end);
		l2 = new Leilao(banco, LocalDateTime.of(2018, 3, 14, 10, 00), LocalDateTime.of(2018, 3, 14, 14, 00), "descricao teste", "link.com.br", end);
		l3 = new Leilao(banco, LocalDateTime.of(2018, 3, 14, 10, 00), LocalDateTime.of(2018, 3, 14, 14, 00), "descricao teste", "link.com.br", end);
	}

	@Test
	void test() {
		assertFalse(l1.equals(l2));
		assertFalse(l2.equals(l3));
		assertFalse(l3.equals(l1));
		assertTrue(l1.equals(l1));
	}

}
