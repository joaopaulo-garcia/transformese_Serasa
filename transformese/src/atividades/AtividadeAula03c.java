package atividades;

import java.util.Scanner;

public class AtividadeAula03c {
	

	  public static void main(String[] args) {
	    try (Scanner input = new Scanner(System.in)) {
			System.out.println("Por favor, informe o seu nome: ");
			String nome = input.nextLine();

			System.out.println("Por favor, informe o seu sobrenome: ");
			String sobrenome = input.nextLine();

			System.out.println("Por favor, informe o seu time favorito: ");
			String timeFavorito = input.nextLine();

			System.out.println("O seu nome é " + nome + " " + sobrenome + " e o seu time favorito é o " + timeFavorito + ".");
		}
	  }
	}
