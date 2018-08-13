package br.com.iggdias;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class TesteListas {

	public static void main(String[] args) {

		System.out.println("**** ArrayList vs LinkedList ***");

		List<Integer> numerosArrayList = new ArrayList<>();
		List<Integer> numerosLinkedList = new LinkedList<>();
		int quantidadeElementos = 100000;
		int n = 50000;

		long tempoArrayList = insereElementosNo(numerosArrayList, quantidadeElementos);
		long tempoLinkedList = insereElementosNo(numerosLinkedList, quantidadeElementos);

		System.out.println("Inserção na ArrayList demorou  " + tempoArrayList);
		System.out.println("Inserção na LinkedList demorou " + tempoLinkedList);

		tempoArrayList = leNesimoElemento(numerosArrayList, n);
		tempoLinkedList = leNesimoElemento(numerosLinkedList, n);

		System.out.println("Leitura da ArrayList demorou  " + tempoArrayList);
		System.out.println("Leitura da LinkedList demorou " + tempoLinkedList);
		
		tempoArrayList = removePrimeirosElementos(numerosArrayList, quantidadeElementos);
		tempoLinkedList = removePrimeirosElementos(numerosLinkedList, quantidadeElementos);

		System.out.println("Remoção da ArrayList demorou  " + tempoArrayList);
		System.out.println("Remoção da LinkedList demorou " + tempoLinkedList);



	}

	/*
	 * Comparando o tempo de leitura do n-esimo elemento da lista
	 * 
	 */

	private static long leNesimoElemento(List<Integer> numeros, int pos) {
		long ini = System.currentTimeMillis();
		numeros.get(pos);
		long fim = System.currentTimeMillis();
		return fim - ini;
	}

	/*
	 * removendo 100 elementos sempre na primeira posição
	 */
	private static long removePrimeirosElementos(List<Integer> numeros, int quantidade) {
		long ini = System.currentTimeMillis();

		for (int i = 0; i < quantidade; i++) {
			numeros.remove(0); // removendo sempre o primeiro elemento
		}
		long fim = System.currentTimeMillis();
		return fim - ini;
	}

	private static long insereElementosNo(List<Integer> numeros, int quantidade) {
		long ini = System.currentTimeMillis();
		for (int i = 0; i < quantidade; i++) {
			numeros.add(0, i);
		}
		long fim = System.currentTimeMillis();
		return fim - ini;
	}

}
