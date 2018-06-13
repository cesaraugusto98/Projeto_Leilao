package edu.fatec.sp.controle;

import java.time.LocalDateTime;

import edu.fatec.sp.leilao.Leilao;
import edu.fatec.sp.leilao.banco.InstituicaoFinanceira;

public class Main {
	public static void main(String[] Args) {
		InstituicaoFinanceira banco = new InstituicaoFinanceira("12344555", "inter", "inter@inter.com.br");
		Leilao l1 = new Leilao(banco, "", LocalDateTime.of(2018, 3, 14, 10, 00), LocalDateTime.of(2018, 3, 14, 14, 00), "teste", "teste", "teste", "SP");
		Leilao l2 = new Leilao(banco, "", LocalDateTime.of(2018, 3, 14, 10, 00), LocalDateTime.of(2018, 3, 14, 14, 00), "teste", "teste", "teste", "SP");
		Leilao l3 = new Leilao(banco, "", LocalDateTime.of(2018, 3, 14, 10, 00), LocalDateTime.of(2018, 3, 14, 14, 00), "teste", "teste", "teste", "SP");
		
		
		System.out.println(l1.getIdLeilao());
		System.out.println(l2.getIdLeilao());
		System.out.println(l3.getIdLeilao());
	}
}
