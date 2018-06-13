package edu.fatec.sp.controle;

public class Identificador {
	
	public static Integer chave = 0;
	
	public static String getChave() {
		return String.valueOf(++chave);
	}
}
