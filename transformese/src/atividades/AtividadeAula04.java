package atividades;

import java.util.Scanner;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class AtividadeAula04 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        // Recebe a data atual
        System.out.print("Digite a data atual (DD/MM/AAAA): ");
        String dataAtualStr = entrada.nextLine();
        LocalDate dataAtual = LocalDate.parse(dataAtualStr, DateTimeFormatter.ofPattern("dd/MM/yyyy"));
        
        // Recebe a data de vencimento
        System.out.print("Digite a data de vencimento (DD/MM/AAAA): ");
        String dataVencimentoStr = entrada.nextLine();
        LocalDate dataVencimento = LocalDate.parse(dataVencimentoStr, DateTimeFormatter.ofPattern("dd/MM/yyyy"));
        
        // Calcula a quantidade de dias em atraso
        long diasAtraso = ChronoUnit.DAYS.between(dataVencimento, dataAtual);
        
        // Calcula o valor da multa e da correção
        double valorMulta = diasAtraso > 10 ? 1.5 : diasAtraso;
        double valorCorrecao = diasAtraso * 1;
        double valorTotal = valorMulta + valorCorrecao;
        
        // Verifica se há multa a ser paga
        if (diasAtraso <= 0) {
            System.out.println("Não há multa a ser paga.");
        } else {
            System.out.printf("Valor da multa: R$ %.2f\n", valorMulta);
            System.out.printf("Valor da correção: R$ %.2f\n", valorCorrecao);
            System.out.printf("Valor total a ser pago: R$ %.2f\n", valorTotal);
        }
        
        entrada.close();
    }

}