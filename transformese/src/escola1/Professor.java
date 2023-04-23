package escola1;

public class Professor {

    String nome;
    private String sobrenome;
    private String materia;
    private String cpf;
    
    public Professor(String nome, String sobrenome, String materia, String cpf) {
        this.nome = nome;
        this.setSobrenome(sobrenome);
        this.setMateria(materia);
        this.setCpf(cpf);
    }

	public String getSobrenome() {
		return sobrenome;
	}

	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}

	public String getMateria() {
		return materia;
	}

	public void setMateria(String materia) {
		this.materia = materia;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
}
