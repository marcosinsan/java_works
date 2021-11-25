package teste;

import com.bytebank.Conta;

public class TestaValores {
	
	public static void main(String[] args) {
		
		Conta conta = new Conta(100, 12345);
		
		System.out.println("Agencia: " + conta.getAgencia() + "\n" + "Número da conta: " + conta.getNumero());
		
		Conta conta2 = new Conta(101, 1002);
		Conta conta3 = new Conta(102, 1003);
		
		System.out.println("Agencia: " + conta2.getAgencia() + "\n" + "Número da conta: " + conta2.getNumero());
		System.out.println("Agencia: " + conta3.getAgencia() + "\n" + "Número da conta: " + conta3.getNumero());
		
		System.out.println("Total de contas criadas: " + Conta.getTotal());
		
	}
}
