package controle;

public class For {

	public static void main(String[] args) {

		int numero = 0;

		// Aqui eu vou verificar se o número é menor ou igual a 10
		while(numero <= 10) {
			
			
			//Aqui eu vou mostrar o valor do número no console
			System.out.println("O número é " + numero);
			
			//Aqui eu estou adicionando uma unidade na variável
			
			//Operadores unários
			
			numero++;
		}
		
		System.out.println("A repetição acabou");

		// Estrutura do FOR

		// 1- cria variável
		// 2- verificação
		// 3- incremento ou modificar essa variável

		// 0 0 menor ou igual 10 0 + 1 = 1

		// Para numero1 igual a zero
		for ( int numero1 = 0 ; numero1 <= 10 ; numero1++ ) {
			
			System.out.println("O número é " + numero1);
			
		}

		// For invertido

		for (int quantidade = 20; quantidade >= 0; quantidade -= 2) {

			System.out.println("A quantidade é " + quantidade);
		}

	}

}
