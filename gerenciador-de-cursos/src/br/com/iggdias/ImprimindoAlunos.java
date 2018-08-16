package br.com.iggdias;

import java.util.HashSet;
import java.util.Set;

public class ImprimindoAlunos {

	public static void main(String[] args) {
		Set<String> alunos = new HashSet<>();

		alunos.add("Igor");
		alunos.add("João");
		alunos.add("Carlos");
		alunos.add("Paulo");
		
		System.out.println(alunos);
		
		alunos.add("Carlos");
		System.out.println("tam: " + alunos.size());
		alunos.add("Carlos");
		System.out.println("tam: " + alunos.size());
		alunos.add("Carlos");
		System.out.println("tam: " + alunos.size());
		alunos.add("Carlos");
		System.out.println("tam: " + alunos.size());
		alunos.add("Carlos");
		System.out.println("tam: " + alunos.size());

		
		for (String aluno : alunos) {
			System.out.println(aluno.toString());
		}

	}
}
