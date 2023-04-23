package atividades;

import java.util.Scanner;

public class AtividadeAula07White_A {

	
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int numero, soma = 0;
        
        while (soma < 100) {
            System.out.print("Digite um número inteiro: ");
            numero = entrada.nextInt();
            soma += numero;
        }
        
        System.out.println("A soma dos números digitados é: " + soma);
        
        entrada.close();
    }
}
