package banco;

public class Conta {
    protected String nome;
    protected String cpf;
    protected String endereco;
    protected double saldo;

    public Conta(String nome, String cpf, String endereco, double saldo) {
        this.nome = nome;
        this.cpf = cpf;
        this.endereco = endereco;
        this.saldo = saldo;
    }

    public void exibeDados() {
        System.out.println("Nome: " + this.nome);
        System.out.println("CPF: " + this.cpf);
        System.out.println("Endereço: " + this.endereco);
        System.out.println("Saldo: " + this.saldo);
    }
}
