
public class TestaWhile {
	
	public static void main(String[] args) {
		
		// Laço While
		
		int contador = 0;
		
		while (contador <= 10) {
			System.out.println(contador);
			// contador = contador + 1;			opção 1 de incremento de um contador
			// contador += 1; 					opção 2 de incremento de um contador
			contador++;
		}
		
		System.out.println("Ultimo valor do contador: " + contador);
	}
}
