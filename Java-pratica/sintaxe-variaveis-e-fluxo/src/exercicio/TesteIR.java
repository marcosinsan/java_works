package exercicio;

public class TesteIR {

	public static void main(String[] args) {
		
		double salario = 4000.0;
		
		if (salario >= 1900.0 && salario <= 2800.0) {
			
			System.out.println("Sua al�quota � de 7%");
			System.out.println("Declara��o no valor de R$142.00 reais.");
			
		} else if (salario >= 2800.01 && salario <= 3751.0) {
			
			System.out.println("Sua al�quota � de 15%");
			System.out.println("Declara��o no valor de R$350.00 reais.");
			
		} else if (salario >= 3551.01 && salario <= 4664.00 ) {
			System.out.println("Sua al�quota � de 22.5%");
			System.out.println("Declara��o no valor de R$636.00 reais.");
		}
	}

}
