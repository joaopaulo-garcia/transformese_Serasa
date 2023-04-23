package transformese;

import java.util.Scanner;

public class Escopo {

	public static void main(String[] args) {
		
        // declaração de variáveis e constantes
        int idade;
        final int IDADE_MINIMA = 18;
        double salario;
        double juros = 0.10;
        boolean estaEmpregado = false;
        String nome;

        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite seu nome: ");
        nome = scanner.nextLine();
        System.out.print("Digite sua idade: ");
        idade = scanner.nextInt();
        System.out.print("Digite seu salário: ");
        salario = scanner.nextDouble();

        // cálculo de aumento salarial com base na idade
        if (idade >= IDADE_MINIMA) {
            salario *= (1 + juros);
        } else {
            System.out.println("Você ainda não pode receber aumento salarial.");
        }

        // verificação de emprego atual
        if (salario > 0 && !estaEmpregado) {
            System.out.println("Parabéns, " + nome + ", você foi contratado!");
            estaEmpregado = true;
        }

        // impressão dos resultados
        System.out.println("Seu nome é " + nome);
        System.out.println("Sua idade é " + idade);
        System.out.println("Seu salário atual é R$" + salario);

        // repetição até o usuário digitar um valor válido
        while (!estaEmpregado) {
            System.out.print("Você está empregado atualmente? (S/N) ");
            String resposta = scanner.next();
            if (resposta.equalsIgnoreCase("S")) {
                estaEmpregado = true;
            } else if (resposta.equalsIgnoreCase("N")) {
                System.out.println("Procure por empregos na nossa plataforma!");
            } else {
                System.out.println("Opção inválida. Digite 'S' ou 'N'.");
            }
        }

        scanner.close();
    }
}