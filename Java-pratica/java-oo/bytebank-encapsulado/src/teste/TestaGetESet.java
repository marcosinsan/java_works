package teste;

import com.bytebank.Cliente;
import com.bytebank.Conta;

public class TestaGetESet {
	
	public static void main(String[] args) {
		
		Conta conta = new Conta(1234, 123456);
		System.out.println("Número da agencia: " + conta.getAgencia());
		
		// Instanciando uma novo Cliente
		Cliente marco = new Cliente();
		
		// setando o nome do cliente atraves de um metodo
		marco.setNome("Marcos Santana");
		
		// Referenciando uma conta a uma cliente
		conta.setTitular(marco);
		
		System.out.println("Nome do [Titular]: " + conta.getTitular().getNome());
		
	}
}
