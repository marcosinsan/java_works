
public class TestaCondicional {
	
	public static void main(String[] args) {
		
		System.out.println("Testando condicionais");
		
		int idade = 17;
		int quantidadePessoa = 3;
		
		// Se pessoa tem mais de 18 anos?
		
		if (idade >= 18) {
			System.out.println("Voc� tem mais de 18 anos!!");
			System.out.println("Seja Bem vindo");
		} else {
			if (quantidadePessoa >= 2) {
				
				System.out.println("Voc� n�o tem mais de 18 anos, "
						+ " mas est� acompanhado pode entra.");
			} else {
				
				System.out.println("Infelizmente voc� n�o pode entra.");
			}
			
		}
	}
}
