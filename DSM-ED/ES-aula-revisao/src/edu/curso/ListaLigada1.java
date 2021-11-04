package edu.curso;

public class ListaLigada1 {
	
//	public static void teste1() { 
//		Node primeiro = new Node();
//		primeiro.conteudo = "Informação 1";
//		
//		Node segundo = new Node();
//		segundo.conteudo = "Informação 2";
//		primeiro.proximo = segundo;
//		
//		Node terceiro = new Node();
//		segundo.proximo = terceiro;
//		terceiro.conteudo = "Informação 3";
//	}
	
	
	
	
	
	
	public static void teste2() { 
		Node primeiro = new Node();

		Node temp = primeiro;
		
		
		temp.proximo = new Node();
		temp = temp.proximo;
		temp.conteudo = "Informação 2";
		
		
		temp.proximo = new Node();
		temp = temp.proximo;
		
		temp.proximo = new Node();
		temp = temp.proximo;
		
		temp.proximo = new Node();
		temp = temp.proximo;
		
		temp.proximo = new Node();
		temp = temp.proximo;
	}
	
	
	
	
	
	
	
	
	public static void main(String args[]) { 
		teste2();
	}
	
	
}
