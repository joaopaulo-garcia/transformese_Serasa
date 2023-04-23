package transformese;

import java.util.Scanner;

public class CorrecaoAtividade {

	public static void main(String[] args) {
	/*	
//     Tipo       Nome 	  Valor
		int       caneta    = 2;
		String    nome      = "Tati";
		double 	  salario   = 250.25;
		boolean   usaOculos = true;			
		Scanner   entrada   = new Scanner(System.in);
		
		entrada.nextInt();
		
//      Superman  Nazare = new Superman();		
//      Nazare.voar();
		
		
		Exemplo tabela Verdade
		
		// Tabela do E  &&
			SOL    DINHEIRO   PADARIA
			VERD   VERD        VERD
			FALSO  VERD        FALSO
			VERD   FALSO       FALSO 
			FALSO  FALSO       FALSO 
			
			// Tabela do OU  ||
			
			Bici azul Bici Vermelha  Padaria
			VERD       VERD          VERD
			FALSO      VERD          VERD
			VERD       FALSO         VERD
			FALSO      FALSO         FALSO
			
			// Tabela no Java
			
			true false 
		
		
		*/
		
		// Aqui receberemos os dados do cliente
		Scanner entrada = new Scanner(System.in);
		
		double juros;
		
		// Aqui estou pegando o valor do boleto
		System.out.println("Informe o valor do boleto: ");
		double valorBoleto = entrada.nextDouble();
		
		System.out.println("Informe o dia do vencimento: ");
		int diaVencimento = entrada.nextInt();
		
		System.out.println("Informe a data de pagamento: ");
		int diaPagamento = entrada.nextInt();
				
		// Aqui vou verificar a quantidade de dias 
		int diasEmAtraso = diaPagamento - diaVencimento;
		
		//      10        >      9
		if (diaVencimento >= diaPagamento) {
			System.out.println("Obrigado, o seu boleto foi pago sem juros.");
		
		// Aqui estou verificando se o dia de pagamento é válido
		} else if (diaPagamento < 1 || diaPagamento > 31) {
			System.out.println("O dia de pagamento informado é inválido");
		
		// Aqui estou verificando se o dia de vencimento é válido	
		} else if (diaVencimento < 1 || diaVencimento > 31) {
			System.out.println("O dia de vencimento informado é inválido");
			
			
//      Aqui estou verificando se o boleto esta em atraso			
		} else if (diaVencimento < diaPagamento && diasEmAtraso <= 10) {
			
			// Aqui estou calculando os juros
			juros = diasEmAtraso * 1.00;
			
			// Aqui estou somando o juros ao valor do boleto
			double valorCorrigido = valorBoleto + juros;
			
			System.out.println("O valor do boleto corrigido, para 10 dias é " + valorCorrigido);
			
		} else if (diaVencimento < diaPagamento && diasEmAtraso > 10) {
			
			juros = diasEmAtraso * 1.50;
			double valorCorrigido = valorBoleto + juros;
			System.out.println("O valor do boleto corrigido, para 15 dias é " + valorCorrigido);
			
		} 
				
		entrada.close();
	}
}
