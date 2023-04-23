package controle;

import java.util.Scanner;

public class CorrecaoAtividadeCinco {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		//Declaração das variáveis
		int hora;
		String pessoa;
				
		// IF para verificar o tipo de pessoa
		
		System.out.println("Informe o seu tipo de pessoa: ");
		pessoa = entrada.next(); 
		
		if (pessoa.equals("fisica")) {
			
			System.out.println("Você é uma pessoa física");
		} else if (pessoa.equals("juridica")) {
			
			System.out.println("Você é uma pessoa jurídica");
		} else {
			System.out.println("Favor informar um valor válido");
		}
		
		// IF para verificar a hora do dia
		
		System.out.println("Informe a hora do dia: ");
		hora = entrada.nextInt();
		
		if(hora >= 0 && hora <= 12) {
			System.out.println("Bom dia!");
			
		} else if (hora >= 13 && hora <= 18) {
			System.out.println("Boa tarde!");
			
		} else if (hora >= 19 && hora <= 23) {
			System.out.println("Boa noite!");
			
		} else {
			System.out.println("Hora inválida");
		}
		
		// Switch para verificar a hora do dia
		
		switch (hora) {
			case 1, 2, 3, 4, 5, 6 -> System.out.println("Bom dia!");
			case 13, 14, 15, 16, 17 -> System.out.println("Boa tarde!");
			default -> System.out.println("Valor inválido!");
		} 
		
		// Switch para verificar o tipo de pessoa
		
		switch (pessoa) {
		case "fisica": case "física": 
			System.out.println("Você é uma pessoa física");
			break;
		case "juridica": case "jurídica": 
			System.out.println("Você é uma pessoa jurídica");
			break;
		default:
			System.out.println("A pessoa informada é inválida");
			break;
		}
		
		// Validar CPF e CNPJ
		
		System.out.println("Informe o seu cpf ou cnpj");
		String documento = entrada.next();
		
		if(documento.length() == 14) {
			System.out.println("O seu cpf é válido");
			
		} else if (documento.contains("/")) {
			System.out.println("Esse documento é um cnpj");
			
		} else if (documento.length() == 18){
			System.out.println("O seu cnpj é valido");
		}
		
		entrada.close();
	}
}
