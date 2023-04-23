package escola1;

import java.util.Scanner;

public class SistemaEscola {

    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        
        Aluno aluno1 = new Aluno("Tati", "Martins", 123456, "7ª série", "B");
        double mediaCalculada = aluno1.calcularMedia(5.2, 7.1, 4.8, 4.7);
        System.out.println(mediaCalculada);
        
        System.out.println("Informe o sexo: 1-F 2-M 3-Prefiro não informar");
        int sexo = entrada.nextInt();
        
        String fraseFormatada = aluno1.boasVindasAluno(sexo, aluno1.nome, aluno1.sobreNome);
        System.out.println(fraseFormatada);
        
        Professor prof2 = new Professor("Ariel", "000.000.000-00", "Matemática", fraseFormatada);
        System.out.println(prof2.nome);
        System.out.println(prof2.getCpf());
        
        System.out.println("O endereço da escola é " + Escola.enderecoEscola);
        
        entrada.close();
        
    }
    
}
