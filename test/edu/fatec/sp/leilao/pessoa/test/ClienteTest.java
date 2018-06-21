package edu.fatec.sp.leilao.pessoa.test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import edu.fatec.sp.controle.Endereco;
import edu.fatec.sp.leilao.pessoa.Cliente;


class ClienteTest {
	Cliente cli;
	Cliente cliIgual;
	Endereco end;
	@BeforeEach
	void setUp() throws Exception {
		end = new Endereco("teste Endereco", "123", "apto 111", "Sao Paulo", "SP");
		cli = new Cliente("Jose", "Silva", "1232456789", end, "jssilva", "1234");
		cliIgual = new Cliente("Jose", "Silva", "12324766789", end, "jssilva", "1234");
	}

	@Test
	void test() {
		assertFalse(cli.equals(cliIgual));
		cli.setCpf("12324766789");
		
		assertTrue(cli.equals(cliIgual));
	}

}
