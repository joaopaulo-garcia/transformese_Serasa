package transformese;

import java.util.Scanner;

public class SistemaPessoas {

    public static void main(String[] args) {

        try (Scanner entrada = new Scanner(System.in)) {
			// Aqui estou criando os objetos
			Pessoa tati = new Pessoa("Tatiana", "Martins");
			Pessoa ariel = new Pessoa("Ariel", "Xavier");
			Pessoa cliente = new Pessoa("Nath", "Pereira");

			// Exibindo informações das pessoas
			tati.exibirInformacoes();
			ariel.exibirInformacoes();
			cliente.exibirInformacoes();

			// Alterando nome de cliente
			System.out.print("Digite o novo nome do cliente: ");
			String novoNome = entrada.nextLine();
			cliente.setNome(novoNome);
			System.out.println("Nome do cliente alterado com sucesso!");

			// Exibindo informações do cliente novamente
			cliente.exibirInformacoes();
		}
    }
}

