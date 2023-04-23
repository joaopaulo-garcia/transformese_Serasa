package atividades;

import java.util.Scanner;

public class AtividadeAula07FOR_Desafio {
	
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int numero, soma = 0;
        
        for (int i = 1; i <= 4; i++) {
            do {
                System.out.print("Digite o " + i + "º número par: ");
                numero = entrada.nextInt();
            } while (numero % 2 != 0);
            
            soma += numero;
        }
        
        System.out.println("A soma dos números digitados é: " + soma);
        
        entrada.close();
    }
}
