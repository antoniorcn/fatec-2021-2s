package edu.curso;

public class ListaLigadaTeste {
	
	public static void main(String args[]) { 
		
		ListaLigada lista = new ListaLigada();
		
		lista.adicionar("João");
		
		lista.adicionar("Maria");
		
		lista.adicionar("Alfredo");
		
		System.out.println( lista.buscar(0) );
		
		
		// lista.mostrarTodos();
		
	}

}
