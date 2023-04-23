package clinicapet;

import java.util.Scanner;

public class Sistema {

	public static void main(String[] args) {
		
		Cachorro c1 = new Cachorro(null, null, 0, 0);
		
		c1.nome = "Qualquer";
		c1.sexo = "M";
		c1.idade = 7;
		c1.raca = "Yorkshire";
		
		Cachorro c2 = new Cachorro(null, null, 0, 0);
		
		c2.nome = "Spike";
		c2.idade = 5;
		c2.raca = "Pincher";
		c2.sexo = "M";
		
		System.out.println(
		  "O nome é " + c1.nome + " a raça é " + c1.raca + " a idade " + c1.idade + " o sexo " + c1.sexo);
		
		//c1.latir("Thor");
		c1.latir("Qualquer", 12);
		
		c1.mostrarDadoCachorro("Max", "Pastor Alemão", 4, "M");
		
		// A melhor forma seria esta, pois garante que os dados são do mesmo cachorro
		c2.mostrarDadoCachorro(c2.nome, c2.raca, c2.idade, c2.sexo);
		
		Veterinario vet1 = new Veterinario();
		vet1.nome = "Ana";
		vet1.CFMV = "A1B1C1";
		
		
		// Quando eu quero pegar a informação do animal eu dou um GET
		// Quando eu quero passar uma informação para o animal eu dou um SET
		
		// Aniversariantes do mês 
		// Ariel - 01/01/1999 -> 01/01 - LGPD
		
		// Nome do cachorro: c1.nome
		// Idade do cachorro: c1.idade
		
		// Isso é culpa do Richard
		
		Scanner entrada = new Scanner(System.in);
		
		
		entrada.close();
		
	}
	
}
