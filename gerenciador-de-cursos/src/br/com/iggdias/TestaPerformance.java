package br.com.iggdias;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;

public class TestaPerformance {

	public static void main(String[] args) {

		Collection<Integer> numerosAL = new ArrayList<Integer>();
		Collection<Integer> numerosHS = new HashSet<Integer>();

		long inicio, fim, tempoDeExecucao;

		System.out.println("utilizando ArrayList");
		
		inicio = System.currentTimeMillis();

		for (int i = 1; i <= 50000; i++) {
			numerosAL.add(i);
		}

		fim = System.currentTimeMillis();
		tempoDeExecucao = fim - inicio;
		System.out.println("Tempo gasto para ADD: " + tempoDeExecucao);

		inicio = System.currentTimeMillis();

		for (Integer numero : numerosAL) {
			numerosAL.contains(numero);
		}

		fim = System.currentTimeMillis();
		tempoDeExecucao = fim - inicio;
		System.out.println("Tempo gasto para READ: " + tempoDeExecucao);

//----------

		System.out.println("utilizando HashSet");
		
		inicio = System.currentTimeMillis();

		for (int i = 1; i <= 50000; i++) {
			numerosHS.add(i);
		}

		fim = System.currentTimeMillis();
		tempoDeExecucao = fim - inicio;
		System.out.println("Tempo gasto para ADD: " + tempoDeExecucao);

		inicio = System.currentTimeMillis();

		for (Integer numero : numerosHS) {
			numerosHS.contains(numero);
		}

		fim = System.currentTimeMillis();
		tempoDeExecucao = fim - inicio;
		System.out.println("Tempo gasto para READ: " + tempoDeExecucao);

		
	}

}
