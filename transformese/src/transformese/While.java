package transformese;

import java.util.Scanner;

public class While {

	public static void main(String[] args) {
		
		// While determinado
		int copos = 0;
		
		while (copos <= 30) {
			System.out.println("Copo de número " + copos + " foi lavado");
			copos++;
		}
		
		//While indeterminado
		Scanner entrada = new Scanner(System.in);
		int pratos = 0;
		
		while (true) {
			System.out.println("Digite o número de pratos lavados: ");
			int quantidade = entrada.nextInt();
			pratos += quantidade;
			
			if (pratos >= 20) {
				System.out.println("Lavagem de pratos concluída.");
				break;
			}
		}
		
		entrada.close();
	}

}


