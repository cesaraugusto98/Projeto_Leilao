package edu.fatec.sp.controle;

public class Identificador {
	
	public static Integer chave = -1;
	
	public static String getChave() {
		return String.valueOf(chave++);
	}
}
