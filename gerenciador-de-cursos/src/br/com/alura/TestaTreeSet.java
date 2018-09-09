package br.com.alura;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class TestaTreeSet {

	public static void main(String[] args) {

		Recibo rec1 = new Recibo(2);
		Recibo rec2 = new Recibo(3);
		Recibo rec3 = new Recibo(10);

		Set<Recibo> listaDeRecibos = new TreeSet<Recibo>(new ReciboComparator());

		listaDeRecibos.add(rec1);
		listaDeRecibos.add(rec2);
		listaDeRecibos.add(rec3);

		System.out.println(listaDeRecibos);
	}

}

class Recibo {

	int numeroDoRecibo;

	public Recibo(int numeroDoRecibo) {
		this.numeroDoRecibo = numeroDoRecibo;
	}

	public int getNumeroDoRecibo() {
		return numeroDoRecibo;
	}

	public void setNumeroDoRecibo(int numeroDoRecibo) {
		this.numeroDoRecibo = numeroDoRecibo;
	}

	@Override
	public String toString() {
		return "[Recibo: " + this.numeroDoRecibo + "]";
	}

}

class ReciboComparator implements Comparator<Recibo> {

	@Override
	public int compare(Recibo o1, Recibo o2) {

		return Integer.compare(o1.getNumeroDoRecibo(), o2.getNumeroDoRecibo());
	}

}
