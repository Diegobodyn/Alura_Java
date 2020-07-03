package br.com.alura;

import java.util.Iterator;
import java.util.Set;

public class TestaCusoComAluno {
	
	public static void main(String[] args) {
		
		Curso javaColecoes = new Curso("Dominado as cole��es do Java", "Paulo Silveira");

		javaColecoes.adiciona(new Aula("Trabalhando com ArrayList", 21));
		javaColecoes.adiciona(new Aula("Criando uma Aula", 20));
		javaColecoes.adiciona(new Aula("Modelando com cole��es", 22));
		
		Aluno a1 = new Aluno("Rodrigo Turini", 34672);
		Aluno a2 = new Aluno("Guilherme Silveira", 5617);
		Aluno a3 = new Aluno("Mauricio Aniche", 17645);
		
		javaColecoes.matricula(a1);
		javaColecoes.matricula(a2);
		javaColecoes.matricula(a3);
		
		System.out.println("Todos os alunos matriculados: ");
		
		Set<Aluno> alunos = javaColecoes.getAlunos();
		Iterator<Aluno> iterador = alunos.iterator();
		while(iterador.hasNext()) {
			Aluno proximo = iterador.next();
			System.out.println(proximo);
		}
		
		/* for(Aluno a : javaColecoes.getAlunos()) {
			System.out.println(a);
		}*/
		
		/*javaColecoes.getAlunos().forEach(a ->{
			System.out.println(a);
		});*/
			
		System.out.println("o aluno " + a1 + " est� matriculado?");
		System.out.println(javaColecoes.estaMatriculado(a1));
		
		Aluno turini = new Aluno("Rodrigo Turini", 34672);
		System.out.println("E esse Turini, est� matriculado?");
		System.out.println(javaColecoes.estaMatriculado(turini));
		
		
		System.out.println("O a1 � equals ao Turini?");
		System.out.println(a1.equals(turini));
		
		
		System.out.println(a1.hashCode() == turini.hashCode());
		
		
		}

}
