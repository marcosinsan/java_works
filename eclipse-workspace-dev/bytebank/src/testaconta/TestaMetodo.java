package testaconta;

import bytebank.conta.Conta;

public class TestaMetodo {
	
	public static void main(String[] args) {
		
		Conta conta = new Conta();
		
		conta.deposita(200);
		System.out.println("Saldo atual da conta: " + conta.getSaldo());
	}
}
