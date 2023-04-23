package introducao;

public class PrimeiraClasse {
	
	public static void main(String[] args) {
		
		// Comentários
		
		// Este é um comentário de uma linha.
		
		/* 
		   Este é um comentário 
		   de múltiplas linhas.
		 */
		
		// Variáveis
		
		// Declaração de variáveis
		int idade = 10;
		double altura = 1.70;
		String nome = "Gabriel";
		boolean estaCalor = true;
		
		System.out.println("Idade: " + idade);
		System.out.println("Altura: " + altura);
		System.out.println("Nome: " + nome);
		System.out.println("Está calor? " + estaCalor);
		
		// Constantes
		
		final int MEDIA = 5;
		
		System.out.println("O valor da média é " + MEDIA);
		
		final int HORA = 24;
		
		System.out.println("O valor da constante HORA é " + HORA);
		
		// Strings
		
		String sobrenome = "Tatiana";
		
		System.out.println("Tamanho do sobrenome: " + sobrenome.length());
		System.out.println("Sobrenome em maiúsculas: " + sobrenome.toUpperCase());
		System.out.println("Sobrenome em minúsculas: " + sobrenome.toLowerCase());
		
		System.out.println("O sobrenome é igual a 'Tatiana'? " + sobrenome.equals("Tatiana"));
		
		// Operadores aritméticos
		
		int a = 5;
		int b = 5;
		
		System.out.println("Operadores Aritméticos:");
		
		System.out.println("Soma: " + (a + b));
		System.out.println("Subtração: " + (a - b));
		System.out.println("Multiplicação: " + (a * b));
		System.out.println("Divisão: " + (a / b));
		
		// Módulo, ou resto de uma divisão
		System.out.println("O resto da divisão é " + (11 % 3));
		
		// Encerramento do programa
		System.out.println("Fim do programa.");
	}
}