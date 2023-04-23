package transformese;

import java.util.Locale;
import java.util.Scanner;

public class Aula4 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		// Conteúdo aula 4 Java
		
		//Revisando os conceitos sobre Scanner 
		 		
		// Inserindo um Scanner na nossa classe para que possamos receber os dados inseridos no teclado 
		Scanner entrada = new Scanner(System.in);
		
		// Para conseguirmos ler um valor do tipo String podemos utilizar o next() e o nextLine
		// Lembrando que o Next() só lê a primeira palavra
		
		System.out.println("Informe seu nome");
		String nome = entrada.next();
		System.out.printf("O nome informado foi %s \n", nome);
		
		
		// Agora para ler um número inteiro precisamos utilizar o entrada.nextInt();
//		System.out.println("Informe sua idade");
//		int idade = entrada.nextInt();		
//		System.out.printf("A idade informada foi %d \n", idade);
		
		// Para ler um dado do tipo double precisamos utilizar o entrada.nextDouble();
		/* 
			Só que neste caso tem um problema, o nextDouble() ele pega a localidade do sistema
			que aqui na minha maquina é português do Brasil, então o separador é a vírgula,
			então caso queira utilizar o ponto, precisará configurar a localidade do seu sistema antes com o
			Locale.setDefault(Locale.US);
		
		*/
		
		System.out.println("Informe sua altura");
		float altura = entrada.nextFloat();
		
		// Como utilizei o double ele vai mostrar 6 casas decimais depois da vírgula por padrão e no float também
		// então precisamos estipular o número de casas decimais
		System.out.printf("A altura informada foi: %.2f n", altura);
		
		
		// Para imprimir um caractere utilizamos entrada.next().charAt(0); 
		// Porque neste caso não temos uma leitura específica para o char, então precisamos pegar o primeiro
		// caractere de uma String
		
		System.out.println("Informe a letra da turma");
		
		// Obs: caso digite mais de uma letra ele irá pegar sempre a primeira
		char letraDaTurma = entrada.next().charAt(0); 
		System.out.printf("A letra da turma informada é %s", letraDaTurma);
		
		
		/* 
		
		Para pegar o nome do tipo de dado que está na variável, apesar de estar escrito ao declararmos
		a variável em nosso programa podemos utilizar 		
		
		*/
		
//		String nomeDoTipoDeDado = nome.getClass().getSimpleName();
//		
//		System.out.printf("O tipo de dado contido na variável 'nome' é %s", nome.getClass().getSimpleName());
//		System.out.println(nome.getClass().getSimpleName());
		
		/*
		 
		 Outra coisa é quando queremos por exemplo ler um número decimal e em seguida ler uma frase
		 neste caso dará erro, e será necessário ter mais um nextLine para funcionar, por exemplo:
		  
		 */
		
		System.out.println("Informe sua altura e em seguida informe ");
		
		
		
		entrada.close();
	}
	
}
