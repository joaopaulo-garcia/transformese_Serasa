package clinicapet;

public class Cachorro {

	String nome;
	String raca; 
	int idade;
	String sexo;
	
	public Cachorro(String string, String string2, int j, int i) {
		// TODO Auto-generated constructor stub
	}

	public Cachorro(Object string, Object string2, int j, int i) {
		// TODO Auto-generated constructor stub
	}

	void mostrarDadoCachorro(String nomeCachorro, String racaCachorro, int idadeCachorro, String sexoCachorro) {
		System.out.println("O nome é: " + nomeCachorro + "\nA raça é: " + racaCachorro + "\nA idade é: " + idadeCachorro + "\nO sexo é: " + sexoCachorro);
	}
	
	void latir(String nomeCachorro, int idadeCachorro) {
		//Formatado
		System.out.printf("O cachorro %s está latindo! A idade é %d ! \n", nomeCachorro, idadeCachorro);
		
	}
	
}
