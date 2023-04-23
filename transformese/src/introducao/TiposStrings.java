package introducao;

public class TiposStrings {

	public static void main(String[] args) {
		
		String nome = "Ariel";
		String sobreNome = "Xavier";
		
		System.out.println("O nome dela é " + nome);
		System.out.println("O nome dela é Ariel");
		System.out.println("A " + nome + " é nota mil.");
		
		System.out.printf("Olá sr(a). %s, viemos informar que o seu sobrenome é %s, muito obrigado. \n" , 
				nome, sobreNome);
		
		System.out.print("Não pula linha \n");
		System.out.print("Não pula linha");
		System.out.print("Não pula linha");
		
		// console.log(`O nome dele é ${nome}`)
		
		// Diferença entre os prints
		/*
		 println - Ele imprime uma sentença por linha
		 print - Ele imprime uma sentença ao lado da outra
		 printf - Ele imprime de forma formatada e inserindo os dados dentro da string
		 */
		
		/*
		 %s - serve para mostrar String no printf
		 %f - serve para mostrar valores decimais 
		 %d - serve para mostrar valores inteiros
		 \n - serve para quebrar linha
		 */
	}
	
}
