package controle;

import java.util.Scanner;

public class Switch {

public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Avalie o nosso atendimento");
		int nota = entrada.nextInt();
		
		switch (nota) {
		 	case 1:
		 		System.out.println("Muito ruim");
		 		break;
			case 2:
				System.out.println("ruim");
				break;
			case 3: 
				System.out.println("Bom");
				break;
			case 4: 
				System.out.println("Ótimo");
				break;
				
			// Este é o valor padrão, caso nenhuma das notas sejam digitadas	
			default: 
				System.out.println("Valor inválido");
				break;
		}
		
		 // Switch para mais de uma opção com mesmo valor

        int hora = 10;

        switch(hora) {
            
            case 1:
            case 2:
            case 4:
            case 5:
                System.out.println("Bom dia!");
                break;
            case 12:    
            case 13:    
            case 14:    
            case 15:
                System.out.println("Boa tarde!"); 
                break;
            case 19:
            case 20:
            case 21:
            case 22:
                System.out.println("Boa noite!"); 
                break;
            default:
             System.out.println("A hora é inválida");
             break;      
        }

        // A mesma verificação só que um ao lado do outro uma forma resumida
        switch(hora) {
            
            case 1: case 2: case 3: case 4: case 5:
                System.out.println("Bom dia!");
                break;
            case 12: case 13: case 14: case 15:
                System.out.println("Boa tarde!"); 
                break;
            case 19: case 20: case 21: case 22:
                System.out.println("Boa noite!"); 
                break;
            default:
                System.out.println("A hora é inválida");
                break;      
        }

        // A mesma verificação utilizando Switch expressions ( Expressões Switch - Java 12 )

        switch (hora) {
            case 1, 2, 3, 4, 5 -> System.out.println("Bom dia!");
            case 12, 13, 14, 15 -> System.out.println("Boa tarde!");
            case 19, 20, 21, 22 -> System.out.println("Bom dia!");
            default -> System.out.println("A hora é inválida");
         }

		
		
		entrada.close();
	}
	
}