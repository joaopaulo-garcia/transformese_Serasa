package controle;

import java.util.Scanner;

public class SistemaPosto {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		// Declaração das vriáveis

		double valorAbastecer = 0;
		final double precoGasolina = 4.75;
		final double precoAlcool = 3.85;
		final double precoDiesel = 4.15;
		int formaPagamento;
		int tipoServico;
		int tipoCombustivel;
		double qtdeLitros;
		double quantiaEmDinheiro;
		int tipoLavagem;
		int resposta;
		int totalAbastecidoDia = 0;
		int relatorio;
		double totalVendido = 0;

		// Recebendo o pedido do cliente

		System.out.println("Olá seja bem-vindo(a), ao posto Transforme-se!");

		// Preferi o Switch por conta do if que teria que ter uma expressao por exemplo
		// tipoServico == 1

		do {

			System.out.println("Gostaria de realizar qual serviço? 1-Abastecer 2-Lavar carro 3-Trocar óleo");
			tipoServico = entrada.nextInt();

			switch (tipoServico) {
			case 1:

				System.out.println(
						"O preço dos combustíveis: \n Gasolina - R$ 4.75 \n Álcool - R$ 3.85 \n Diesel - R$ 4.15 \n");
				System.out.println("Qual o combustível que gostaria de abastecer? \n1-Gasolina 2-Álcool 3-Diesel");
				tipoCombustivel = entrada.nextInt();

				System.out.println("Quanto gostaria de abastecer? ");
				valorAbastecer = entrada.nextDouble();

				if (tipoCombustivel == 1) {

					// Quantos litros será abastecido
					qtdeLitros = valorAbastecer / precoGasolina;
					System.out.printf("Abasteceu gasolina com %.3f litros.", qtdeLitros);
					qtdeLitros = valorAbastecer / precoAlcool;
					System.out.printf("Abasteceu Alcool com %.3f litros.", qtdeLitros);
					qtdeLitros = valorAbastecer / precoDiesel;
					System.out.printf("Abasteceu Diesel com %.3f litros.", qtdeLitros);
					

				} else if (tipoCombustivel == 2) {
					System.out.println("Abasteceu álcool");
				} else if (tipoCombustivel == 3) {
					System.out.println("Abasteceu diesel");
				} else {
					System.out.println("");
				}

				break;
			case 2:

				System.out.println(
						"Os preços para lavar o carro são os seguintes: \n Pequeno - R$ 20,00 \n Médio - R$ 30,00 \n Grande - R$ 40,00 \n");
				System.out.println("Qual lavagem gostaria de fazer? \n1-Pequeno 2-Médio 3-Grande");
				tipoLavagem = entrada.nextInt();

				if (tipoLavagem == 1) {
					System.out.println("");
				}

			case 3:

			default:
				System.out.println("Serviço inválido");
				break;

			}

			System.out.println("Qual a forma de pagamento? 1-Dinheiro 2-Pix 3-Crédito");
			formaPagamento = entrada.nextInt();

			if (formaPagamento == 1) {
				System.out.println("Qual a quantia em dinheiro paga? ");
				quantiaEmDinheiro = entrada.nextDouble();

				if (quantiaEmDinheiro < valorAbastecer) {
					System.out.println("Que me dar um calote doidão/doidona? Pica a mula!");

				} else if (quantiaEmDinheiro == valorAbastecer) {
					System.out.println("Obrigado, tenha um ótimo dia!");

					totalAbastecidoDia++;
					totalVendido += valorAbastecer;
				} else if (quantiaEmDinheiro > valorAbastecer) {

					double troco = quantiaEmDinheiro - valorAbastecer;

					System.out.printf("O posto transforme-se agradece, aqui está o seu troco de R$ %.2f ", troco);

					totalAbastecidoDia++;
					totalVendido += valorAbastecer;
				}
			} else if (formaPagamento == 2) {

				// pode completar aqui caso queira
			}

			System.out.println("Gostaria de realizar mais algum serviço? 1-Sim 2-Não");
			resposta = entrada.nextInt();

		} while (resposta != 2);

		System.out.println("O posto Transforme-se agradece a preferência!");

		System.out.println("Gostaria de ver o relatório do dia?");
		System.out.println("1- Sim 2- Não");
		relatorio = entrada.nextInt();

		if (relatorio == 1) {
			System.out.println("A quantidade de carros abastecidos foram: " + totalAbastecidoDia);
			System.out.println("A quantidade em dinheiro vendido hoje foi: " + totalVendido);
		}

		entrada.close();

	}

}
