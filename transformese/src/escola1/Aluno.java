package escola1;

public class Aluno {

    String nome;
    private String sobrenome;
    private int matricula;
    private String serie;
    private String turma;
	public Object sobreNome;
    
    public Aluno(String nome, String sobrenome, int matricula, String serie, String turma) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.setMatricula(matricula);
        this.setSerie(serie);
        this.setTurma(turma);
    }
    
    public double calcularMedia(double nota1, double nota2, double nota3, double nota4) {
        double somaDasNotas = nota1 + nota2 + nota3 + nota4;
        return somaDasNotas / 4;
    }
    
    public String bemVindoAluno(int sexoPessoa) {
        String saudacao = "";
        switch (sexoPessoa) {
            case 1:
                saudacao = "Seja bem-vinda, querida aluna ";
                break;
            case 2:
                saudacao = "Seja bem-vindo, querido aluno ";
                break;
            default:
                saudacao = "Seja bem-vinde, queride alune ";
        }
        return saudacao + nome + " " + sobrenome;
    }

	public int getMatricula() {
		return matricula;
	}

	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}

	public String getSerie() {
		return serie;
	}

	public void setSerie(String serie) {
		this.serie = serie;
	}

	public String getTurma() {
		return turma;
	}

	public void setTurma(String turma) {
		this.turma = turma;
	}

	public String boasVindasAluno(int sexo, String nome2, Object sobreNome2) {
		// TODO Auto-generated method stub
		return null;
	}
}
