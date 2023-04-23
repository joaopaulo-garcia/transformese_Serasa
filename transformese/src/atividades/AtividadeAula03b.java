package atividades;

import java.util.Scanner;

public class AtividadeAula03b {
	
	public static void main(String[] args) {
	    try (Scanner input = new Scanner(System.in)) {
			System.out.println("Por favor, informe o primeiro número: ");
			int num1 = input.nextInt();

			System.out.println("Por favor, informe o segundo número: ");
			int num2 = input.nextInt();

			System.out.println("Qual operação você deseja realizar? (+, -, *, / ou %)");
			String operacao = input.next();

			int resultado = 0;

			switch(operacao) {
			  case "+":
			    resultado = num1 + num2;
			    break;
			  case "-":
			    resultado = num1 - num2;
			    break;
			  case "*":
			    resultado = num1 * num2;
			    break;
			  case "/":
			    resultado = num1 / num2;
			    break;
			  case "%":
			    resultado = num1 % num2;
			    break;
			  default:
			    System.out.println("Operação inválida!");
			}

			System.out.println("O resultado da operação é: " + resultado);
		}
	  }
	}

