package transformese;

import java.util.Scanner;

public class PrimeiraClasse {

	public static void main(String[] args) {
		
		// Exemplo de if else com as horas do dia
	    Scanner entrada = new Scanner(System.in);
        
        System.out.print("Informe a hora do dia: ");            
        int hora = entrada.nextInt();
		
        if (hora >= 5 && hora < 13) {
        	System.out.println("Tenha um bom dia!");
        } else if (hora >= 13 && hora < 18) {
        	System.out.println("Tenha uma boa tarde!");
        } else if (hora >= 18 && hora <= 24) {
        	System.out.println("Tenha uma boa noite!");
        } else if (hora >= 1 && hora < 5) {
        	System.out.println("Tenha uma boa madrugada!");
        } else {
        	System.out.println("A hora informada é inválida.");
        }
        
        entrada.close();
        
	}
	
}
