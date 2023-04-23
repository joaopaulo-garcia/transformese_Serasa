package controle;

import java.util.Scanner;

public class While {

	public static void main(String[] args) {

		// While
		// Bar para lavar os copos
		// 9h às 12h - Quantidade indeterminada
		// 30 copos - Quantidade determinada

		// While determinado
		
		int copos = 0;

		while (copos <= 30) {

		 System.out.println("Copo de número " + copos + " foi lavado");
		 //copos += 1;
		 //Operador unário
		 //copos++;
		 //Mostrar só os números pares
		 copos += 1;
		 }

		// While indeterminado

		Scanner entrada = new Scanner(System.in);

		int pratos = 0;

		int hora = 0;
		// Palavra para
		// número 0

		while (!(hora < 9 && hora > 12)) {

			System.out.println("Informe a hora do dia: ");
			hora = entrada.nextInt();

			pratos++;
		}

		System.out.println("A quantidade de pratos lavados foi de " + pratos);

		entrada.close();

	}

}
