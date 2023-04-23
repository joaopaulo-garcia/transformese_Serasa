package atividades;

import java.util.Scanner;

public class AtividadeAula07White_B {
	
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int numero, soma = 0;
        String resposta;
        
        do {
            System.out.print("Digite um número inteiro (ou 'N' para sair): ");
            resposta = entrada.nextLine();
            
            if (!resposta.equalsIgnoreCase("N")) {
                numero = Integer.parseInt(resposta);
                soma += numero;
            }
        } while (!resposta.equalsIgnoreCase("N"));
        
        System.out.println("A soma dos números digitados é: " + soma);
        
        entrada.close();
    }
}
