package edu.curso;


public class ListaLigada {
	
	Node primeiro = new Node();
	Node ultimo = primeiro;
	

	public void adicionar(String texto) { 
		ultimo.proximo = new Node();
		ultimo = ultimo.proximo;
		
		ultimo.conteudo = texto;
	}

	
	public void mostrarTodos() { 
		Node temp = primeiro.proximo;
		
		while (temp != null) { 
			System.out.println(temp.conteudo);
			temp = temp.proximo;
		}
	}
	
	public String buscar(int indice) { 
		int contador = 0;
		Node temp = primeiro.proximo;
		
		while (temp != null && contador < indice) { 
			contador++;
			temp = temp.proximo;
		}
		
		return(temp.conteudo);
	}
}
