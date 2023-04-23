package introducao;

import java.util.Scanner;

public class EntradaDeDados {

	public static void main(String[] args) {
		
		// Entrada padrão é o teclado
		// Saída padrão é o console
		
		//String nome = "Gabriel";
		
		//Aqui estou importando o Scanner
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Informe o seu nome");		
		String nome = entrada.nextLine(); //Esse aqui serve para String
		
		System.out.println("Informe um número");
		int numero1 = entrada.nextInt();
		
		System.out.println("Informe outro número");
		int numero2 = entrada.nextInt();
		
		System.out.println(
				"O nome informado é " + nome + " e a idade é ");
		
		System.out.println("O primeiro número é " + numero1);
		System.out.println("O segundo número é " + numero2);
		
		System.out.println("A soma dos números é " + (numero1 + numero2));
		
		entrada.close();
		
		
		
	}
	
}

