package edu.fatec.sp.leilao.pessoa.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import edu.fatec.sp.leilao.pessoa.Cliente;

class ClienteTest {
	Cliente cli;
	Cliente cliIgual;
	@BeforeEach
	void setUp() throws Exception {
		cli = new Cliente("Jose", "Silva", "1232456789", "Rua das Rosas", "Jacarei", "SP", "jssilva", "1234");
		cliIgual = new Cliente("Jose", "Silva", "12324766789", "Rua das Rosas", "Jacarei", "SP", "jssilva", "1234");
	}

	@Test
	void test() {
		assertFalse(cli.equals(cliIgual));
		
		cli.setCpfCliente("12324766789");
		
		assertTrue(cli.equals(cliIgual));
	}

}
