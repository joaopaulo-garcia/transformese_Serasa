package atividade_banco_aula20;

import atividade_contas_aula20.ContaPf;
import atividade_contas_aula20.ContaPj;

public class SistemaBanco {

    public static void main(String[] args) {
        
        ContaPf contaPf = new ContaPf("Chucky Ribeiro", "078364");

        System.out.println("Conta pessoa física:");
        System.out.println("Nome do titular: " + contaPf.getNomeTitular());
        System.out.println("Número da conta: " + contaPf.getNumeroConta());

        ContaPj contaPj = new ContaPj("Xuxa Luiza", "786466", "Empresa XPTO", "123.456.789/0001-10");

        System.out.println("\nConta pessoa jurídica:");
        System.out.println("Nome do titular: " + contaPj.getNomeTitular());
        System.out.println("Número da conta: " + contaPj.getNumeroConta());
        System.out.println("Nome da empresa: " + contaPj.getNomeEmpresa());
        System.out.println("CNPJ da empresa: " + contaPj.getCnpjEmpresa());

        contaPf.setNomeTitular("João Santos");
        contaPf.setNumeroConta("987654");

        System.out.println("\nConta pessoa física (após alteração):");
        System.out.println("Nome do titular: " + contaPf.getNomeTitular());
        System.out.println("Número da conta: " + contaPf.getNumeroConta());

        contaPj.setNomeTitular("Maria Santos");
        contaPj.setNumeroConta("456789");
        contaPj.setNomeEmpresa("Empresa ABC");
        contaPj.setCnpjEmpresa("111.222.333/0001-99");

        System.out.println("\nConta pessoa jurídica (após alteração):");
        System.out.println("Nome do titular: " + contaPj.getNomeTitular());
        System.out.println("Número da conta: " + contaPj.getNumeroConta());
        System.out.println("Nome da empresa: " + contaPj.getNomeEmpresa());
        System.out.println("CNPJ da empresa: " + contaPj.getCnpjEmpresa());
    }

}