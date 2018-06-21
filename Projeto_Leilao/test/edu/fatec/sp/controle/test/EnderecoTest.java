package edu.fatec.sp.controle.test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.fail;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import edu.fatec.sp.controle.Endereco;

class EnderecoTest {
	Endereco end;
	@BeforeEach
	void setUp() throws Exception {
		end = new Endereco("Rua Jose Firmino de Moares", "121", "Apto 404", "São José dos Campos", "SP");
	}

	@Test
	void testToString() {
		System.out.println(end.toString());
		assertEquals(end.getNumero(), "121");

	}

}
