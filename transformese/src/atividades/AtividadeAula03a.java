package atividades;

import java.util.Scanner;

public class AtividadeAula03a {
	
	  public static void main(String[] args) {
		  
	    try (Scanner input = new Scanner(System.in)) {
			System.out.println("Por favor, informe o seu nome: ");
			String nome = input.nextLine();

			System.out.println("Por favor, informe a sua idade: ");
			int idade = input.nextInt();

			System.out.println("O seu nome é " + nome + " e você tem " + idade + " anos de idade.");
		}
	  }
	}