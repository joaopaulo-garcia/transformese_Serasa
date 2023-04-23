package atividades;

import java.util.Scanner;

public class AtividadeAula07FOR_A {
	
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int numero, soma = 0;
        
        for (int i = 1; i <= 4; i++) {
            System.out.print("Digite o " + i + "º número inteiro: ");
            numero = entrada.nextInt();
            soma += numero;
        }
        
        System.out.println("A soma dos números digitados é: " + soma);
        
        entrada.close();
    }
}
