package banco;

public class Main {
    public static void main(String[] args) {
    	
        ContaPessoaFisica contaFisica = new ContaPessoaFisica("João Paulo", "888.333.666-23", "Rua Serasa, 564", 1000, "675848");
        ContaPessoaJuridica contaJuridica = new ContaPessoaJuridica("Rogerio", "999.777.555/0003-11", "Rua Java, 456", 5000, "909893", "Empresa Serasa LTDA");

        System.out.println("Dados da conta pessoa física:");
        contaFisica.exibeDados();
        System.out.println();

        System.out.println("Dados da conta pessoa jurídica:");
        contaJuridica.exibeDados();
        System.out.println();

        // Alterando informações das contas
        contaFisica.saldo += 500;
        contaJuridica.saldo -= 1000;

        System.out.println("Dados da conta pessoa física após alteração:");
        contaFisica.exibeDados();
        System.out.println();

        System.out.println("Dados da conta pessoa jurídica após alteração:");
        contaJuridica.exibeDados();
        System.out.println();
    }
}
