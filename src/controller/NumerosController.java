package controller;

import br.edu.fateczl.Lista;

@SuppressWarnings("unchecked")
public class NumerosController {

	Lista<Integer>[] hashTable = new Lista[5];
	
	public NumerosController() {
		int tamanho = hashTable.length;
		for (int i = 0 ; i < tamanho ; i++) {
			hashTable[i] = new Lista<Integer>();
		}
	}
	
	private int hash(int numero) {
		return numero % 5;
	}
	
	public void add(int numero) throws Exception {
		int i = hash(numero);
		
		Lista<Integer> listaAux = hashTable[i];
		if (listaAux.isEmpty()) {
			listaAux.addFirst(numero);
		} else {
			listaAux.addLast(numero);
		}
	}
	
	public void print(int index) throws Exception {
		Lista<Integer> listaAux = hashTable[index];
		int tamanho = listaAux.size();
		for (int i = 0 ; i < tamanho ; i++) {
			System.out.print(listaAux.get(i) + " ");
		}
		System.out.println("");
	}
}
