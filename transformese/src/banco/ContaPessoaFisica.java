package banco;

public class ContaPessoaFisica extends Conta {
    protected String rg;

    public ContaPessoaFisica(String nome, String cpf, String endereco, double saldo, String rg) {
        super(nome, cpf, endereco, saldo);
        this.rg = rg;
    }
}
