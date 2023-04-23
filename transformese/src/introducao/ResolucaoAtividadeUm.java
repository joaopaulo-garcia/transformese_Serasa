package introducao;

public class ResolucaoAtividadeUm {

	public static void main(String[] args) {
		
		// Declaração das variáveis
		int numero1 = 40;
		int numeroDois = 30;
		int numero_tres = 70;
		
		// Guardando a soma na variável soma
		double soma = numero1 + 
				numeroDois + numero_tres;
		
		// Calculando a média
		double resultado = soma / 3;
		
		// Mostrando resultado no console
		System.out.println(resultado);
				
		
		int teste1 = 10;
		//double teste2 = 2.3;
		//double teste2 = (int) 2.9999999;
		double teste2 = 2.5;
		System.out.println(teste2);
		
		// Cast
		// Cast é a conversão de um valor
		
		System.out.println(teste1 * teste2);
		
		
		// Forma mais elegante
		
		int mesUm = 40;
		int mesDois = 30;
		int mesTres = 70;
		
		int qtdeDeMeses = 3;
		
		double soma2 = mesUm + mesDois + mesTres;
		
		double resultado2 = soma2 / qtdeDeMeses;
		
		System.out.println(resultado2);
		
		
		
	}
	
}
