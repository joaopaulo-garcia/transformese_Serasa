package introducao;

import java.util.Scanner;

public class ResolucaoAtividadeDois {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Informe um número");
		double primeiroNumero = entrada.nextDouble();
		
		System.out.println("Informe um segundo número");
		double segundoNumero = entrada.nextDouble();
		
		// Precedência  
		double resultado = (primeiroNumero + segundoNumero) / 2;
		
		System.out.printf("A média entre o número %.2f e o número %.2f é %.2f%n", primeiroNumero, segundoNumero, resultado);
		
        String nome = "Gabriel";
        int numero1 = 1234;

        System.out.printf("Olá meu nome é %s e o número é %d%n", nome, numero1);

        // %s - para String 
        // %d - para inteiros
        // %f - para decimais
		
		entrada.close();	
		
	}
	
}
