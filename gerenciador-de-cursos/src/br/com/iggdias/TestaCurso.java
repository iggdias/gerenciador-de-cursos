package br.com.iggdias;

import java.util.ArrayList;
import java.util.List;

public class TestaCurso {
	public static void main(String[] args) {
		Curso cursoDaVida = new Curso("Como ser pai", "ninguém");

		Aula aula = new Aula("como nao dormir", 50);
		cursoDaVida.adiciona(aula);
		
		cursoDaVida.adiciona(new Aula("como ganhar dinheiro", 25));
		cursoDaVida.adiciona(new Aula("como perder dinheiro", 1));

		List<Aula> aulas = cursoDaVida.getAulas();
		System.out.println(aulas.get(0));
	}
}
