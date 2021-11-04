package edu.curso;

class Aluno { 
	String ra;
	String nome;
	int idade;
}

public class Teste {
	public static void main(String[] args) {
		int a = 10;
		String s = "texto";
		System.out.println("Hello World");
		
		Aluno joao = new Aluno();
		Aluno maria = new Aluno();
		
		joao.nome = "João Silva";
		joao.ra = "000001";
		joao.idade = 19;
		
		maria.nome = "Maria Silva";
		maria.ra = "00002";
		maria.idade = 20;
		
		System.out.println("Fim do programa");
	}
}
