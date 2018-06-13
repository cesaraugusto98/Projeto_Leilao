package edu.fatec.sp.leilao.test;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDateTime;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import edu.fatec.sp.leilao.Leilao;
import edu.fatec.sp.leilao.banco.InstituicaoFinanceira;

class LeilaoTest {
	InstituicaoFinanceira banco;
	Leilao l1;
	Leilao l2;
	Leilao l3;
	
	
	
	@BeforeEach
	void setUp() throws Exception {
		banco = new InstituicaoFinanceira("12344555", "inter", "inter@inter.com.br");
		l1 = new Leilao(banco, LocalDateTime.of(2018, 3, 14, 10, 00), LocalDateTime.of(2018, 3, 14, 14, 00), "teste","teste", "teste", "teste", "SP");
		l2 = new Leilao(banco, LocalDateTime.of(2018, 3, 14, 10, 00), LocalDateTime.of(2018, 3, 14, 14, 00), "teste", "teste", "teste", "teste", "SP");
		l3 = new Leilao(banco, LocalDateTime.of(2018, 3, 14, 10, 00), LocalDateTime.of(2018, 3, 14, 14, 00), "teste", "teste", "teste", "teste", "SP");
	}

	@Test
	void test() {
		assertFalse(l1.equals(l2));
		assertFalse(l2.equals(l3));
		assertFalse(l3.equals(l1));
	}

}
