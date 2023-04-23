package controle;

import java.util.Scanner;

public class DoWhile {

	public static void main(String[] args) {

		// O while indeterminado é mais interessante quando não sabemos a quantidade
		// No caso veremos o For que será interessante para quantidades pre definidas

		// Exemplo do Do WHile
		// Vamos supor que fomos chamados para trabalhar em um bar fds para lavar os
		// copos
		// Uma coisa é eu ser pago das 10 as 12 e outra coisa é lavar 30 copos

		/*
		 * A diferenla entre o while e o do while é que a sentença pode ser executada 0
		 * vezes ou nenhuma vez no while por exemplo se eu passasse no exemplo anterios
		 * -1 direto na variável não mostraria nada já no do while pelo menos uma vez o
		 * código será executado, por exemplo
		 * 
		 */

		Scanner entrada = new Scanner(System.in);

		int num1 = -1;

		do {
			// Primeiro ele executa esse trecho mesmo o num1 sendo -1
			System.out.print("Informe um número:  ");
			num1 = entrada.nextInt();
		} while (num1 != -1);

		System.out.println("Obrigado!");
		entrada.close();

	}

}
