package atividades;

import java.util.Scanner;

public class AtividadeAula05 {

    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        
        System.out.print("Informe a hora do dia (formato 24 horas): ");
        int hora = entrada.nextInt();
        
        System.out.print("Informe o tipo de pessoa (1 - Pessoa Física / 2 - Pessoa Jurídica): ");
        int tipoPessoa = entrada.nextInt();
        
        String saudacao = "";
        
        if(hora >= 0 && hora < 12) {
            saudacao = "Bom dia";
        } else if(hora >= 12 && hora < 18) {
            saudacao = "Boa tarde";
        } else if(hora >= 18 && hora <= 23) {
            saudacao = "Boa noite";
        } else {
            System.out.println("Hora inválida!");
            entrada.close();
            return;
        }
        
        String tipo = "";
        
        switch(tipoPessoa) {
            case 1:
                tipo = "Pessoa Física";
                break;
            case 2:
                tipo = "Pessoa Jurídica";
                break;
            default:
                System.out.println("Tipo de pessoa inválido!");
                entrada.close();
                return;
        }
        
        System.out.println(saudacao + ", " + tipo + "!");
        
        entrada.close();
    }

}

