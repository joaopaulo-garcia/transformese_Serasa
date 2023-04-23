package banco;

public class ContaPessoaJuridica extends Conta {
    protected String cnpj;
    protected String razaoSocial;

    public ContaPessoaJuridica(String nome, String cpf, String endereco, double saldo, String cnpj, String razaoSocial) {
        super(nome, cpf, endereco, saldo);
        this.cnpj = cnpj;
        this.razaoSocial = razaoSocial;
    }

    public void exibeDados() {
        super.exibeDados();
        System.out.println("CNPJ: " + this.cnpj);
        System.out.println("Razão Social: " + this.razaoSocial);
    }
}
