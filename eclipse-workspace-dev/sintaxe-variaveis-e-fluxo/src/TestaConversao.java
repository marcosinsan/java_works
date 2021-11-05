
public class TestaConversao {
	
	public static void main(String[] args) {
		
		// Conversão entre tipos
		
		double salario = 1270.50;
		int valor = (int) salario;		//criando uma casting
		
		System.out.println(valor);
		
		double valor1 = 0.2;
		double valor2 = 0.1;
		double total = valor1 + valor2;
		
		System.out.println(total);
		
		// Outro tipos primitivos.
		
		long numeroGrande = 324345636728L;
		short valorPequeno = 2131;
		byte b = 127;
		float pi = 3.14f;
	}
}
