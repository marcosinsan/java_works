package teste;

import com.bytebank.Cliente;
import com.bytebank.Conta;

public class TestaClient {

	public static void main(String[] args) {
		
		Cliente marco = new Cliente();
		
		marco.nome = "Marcos Santana";
		marco.cpf = "222.333.444.55";
		marco.profissao = "Programador";
		
		Conta contaDoMarco = new Conta();
		
		
		
		System.out.println("Nome do titular da conta: " + contaDoMarco.titular.nome);
		
		System.out.println("Cpf do titular da conta: " + contaDoMarco.numero);

		
	}
}
