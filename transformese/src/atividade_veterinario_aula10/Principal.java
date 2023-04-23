package atividade_veterinario_aula10;

public class Principal {
	
	    public static void main(String[] args) {
	       
	        Cachorro cachorro1 = new Cachorro("Toby", "Poodle", 'M', 3);
	        Cachorro cachorro2 = new Cachorro("Luna", "Golden Retriever", 'F', 5);

	        cachorro1.setNome("Bob");
	        cachorro1.setRaca("Labrador");

	        cachorro2.setIdade(6);
	        
	        System.out.println("Cachorro 1: " + cachorro1.getNome() + " " + cachorro1.getRaca() +
	                " " + cachorro1.getSexo() + " " + cachorro1.getIdade() + " anos");

	        System.out.println("Cachorro 2: " + cachorro2.getNome() + " " + cachorro2.getRaca() +
	                " " + cachorro2.getSexo() + " " + cachorro2.getIdade() + " anos");

	        cachorro1.latir();
	        cachorro2.falarNome();
	    }
	}
