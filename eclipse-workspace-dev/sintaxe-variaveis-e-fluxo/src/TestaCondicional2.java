
public class TestaCondicional2 {
	
public static void main(String[] args) {
		
		System.out.println("Testando condicionais");
		
		
		// Trabalhando com expressões booleanas e condicionais.
		
		int idade = 18;
		int quantidadePessoa = 3;
		boolean acompanhado = quantidadePessoa >= 2;	// Expressão booleanas
		
		// Boolean Condicionais
		
		if (idade >= 18 && acompanhado) {
			
			System.out.println("Seja Bem vindo");
			
		} else {
			
			System.out.println("Infelizmente você não pode entra.");
		}
	}
}
