package atividade_veterinario_aula10;

public class Cachorro {
	private String nome;
    private String raca;
    private char sexo;
    private int idade;

    public Cachorro(String nome, String raca, char sexo, int idade) {
        this.nome = nome;
        this.raca = raca;
        this.sexo = sexo;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public String getRaca() {
        return raca;
    }

    public char getSexo() {
        return sexo;
    }

    public int getIdade() {
        return idade;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void latir() {
        System.out.println(this.nome + " está latindo!");
    }

    public void falarNome() {
        System.out.println("Meu nome é " + this.nome);
    }
}

