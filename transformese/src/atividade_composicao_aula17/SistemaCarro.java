package atividade_composicao_aula17;

public class SistemaCarro {
    public static void main(String[] args) {
    	Placa placa = new Placa("1A2B3C");
    	Carro carro = new Carro("Fusca", placa);
    	System.out.println("Modelo: " + carro.getModelo() + ", Placa: " + carro.getPlaca().getNome());
    }
}
