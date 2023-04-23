package introducao;

public class TiposPrimitivos {

    public static void main(String[] args) {
        // Exemplo de tipos primitivos em Java
        
        // Float e Double
        float salarioMenor = 1000.00f;
        double salarioComBonus = 120.54d;
        
        // Byte e Short
        byte idade = 127;
        short salarioMaior = 32767;
        
        // Boolean
        boolean temPermissao = true;
        boolean possuiAcesso = false;
        
        // Int e Long
        int impostoBrasil = 2_147_483_647;
        long identificador = 987_878_452_000L;
        
        // Demonstra o uso de cada tipo de variável
        System.out.println("Exemplo de tipos primitivos em Java:");
        System.out.println("salarioMenor: " + salarioMenor);
        System.out.println("salarioComBonus: " + salarioComBonus);
        System.out.println("idade: " + idade);
        System.out.println("salarioMaior: " + salarioMaior);
        System.out.println("temPermissao: " + temPermissao);
        System.out.println("possuiAcesso: " + possuiAcesso);
        System.out.println("impostoBrasil: " + impostoBrasil);
        System.out.println("identificador: " + identificador);
    }

}

