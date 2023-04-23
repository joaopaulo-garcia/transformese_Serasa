package transformese;

import java.util.Scanner;

public class CorrecaoAtividade5 {

	public static void main(String[] args) {
		
		// 5 > 5 = falso MAIOR
		// 5 != 5 = falso DIFERENTE
		// 5 < 5 = falso MENOR
		// 5 == 5 = verdadeiro IGUAL
		
		/*
		  Atalhos
		Para adicionar identação. tecla TAB
		Para remover identação. Shift + TAB
		Comentar bloco. Selecione o bloco e aperte Ctrl + /
		Para descomentar bloco. Selecione o bloco e aperte Ctrl + /
		 
		 */ 
		
		Scanner entrada = new Scanner(System.in);

        // Declaração das variáveis
        int hora;
        String pessoa;

        // Exemplo de uso de atalhos no código

        /*
         * Atalhos Para adicionar identação. tecla TAB Para remover identação. Shift +
         * TAB Comentar bloco. Selecione o bloco e aperte Ctrl + / Para descomentar
         * bloco. Selecione o bloco e aperte Ctrl + /
         */

        // IF para verificar a hora
        System.out.println("Informe a hora do dia: ");
        hora = entrada.nextInt();

        if (hora >= 0 && hora <= 12) {
            System.out.println("Bom dia!");

        } else if (hora >= 13 && hora <= 18) {
            System.out.println("Boa tarde!");

        } else if (hora >= 19 && hora <= 23) {
            System.out.println("Boa noite!");

        } else {
            System.out.println("Hora inválida");
        }

        // IF para verificar o tipo de pessoa
        System.out.println("Informe o seu tipo de pessoa: ");
        pessoa = entrada.next();

        if (pessoa.equals("fisica")) {
            System.out.println("Você é uma pessoa física");
        } else if (pessoa.equals("juridica")) {
            System.out.println("Você é uma pessoa jurídica");
        } else {
            System.out.println("Favor informar um valor válido");
        }

        // Verificação de documento com Switch
        System.out.println("Informe o seu CPF ou CNPJ:");
        String documento = entrada.next();

        switch (documento.length()) {
            case 11:
                System.out.println("CPF válido.");
                break;
            case 14:
            case 18:
                if (documento.contains("/")) {
                    System.out.println("CNPJ válido.");
                } else {
                    System.out.println("CPF válido.");
                }
                break;
            default:
                System.out.println("Documento inválido.");
                break;
        }

        entrada.close();
    }

}
