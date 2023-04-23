package transformese;

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
		
		
		entrada.close();
	}
	
	
	
}
