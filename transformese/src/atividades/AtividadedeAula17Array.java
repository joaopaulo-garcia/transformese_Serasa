package atividades;

import java.util.Scanner;

public class AtividadedeAula17Array {
	
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			double[] notas = new double[4];

			for (int i = 0; i < 4; i++) {
				System.out.print("Digite a nota " + (i+1) + ": ");
				notas[i] = sc.nextDouble();
			}

			System.out.print("Notas: [ ");
			for (double nota : notas) {
				System.out.print(nota + " ");
			}
		}
		System.out.println("]");
	}
}
