package testaconta;

import bytebank.conta.Conta;

public class TestaMetodo {
	
	public static void main(String[] args) {
		
		Conta contaDoMarco = new Conta();
		Conta contaDaAnne = new Conta();
		
		contaDoMarco.deposita(200);
		System.out.println("Saldo atual da conta: R$ " + contaDoMarco.getSaldo());
		
		contaDoMarco.saca(50);
		System.out.println("Saque efetuado com sucesso!\nSaldo atual: " + contaDoMarco.getSaldo());
		
		contaDaAnne.setSaldo(1000);
		System.out.println("Saldo em conta [ANNE]: R$ " + contaDaAnne.getSaldo());
		
		
		boolean sucessoTransferencia = contaDaAnne.transfere(300, contaDoMarco);
		
		if(sucessoTransferencia) {
			System.out.println("Transferência realizada com sucesso!!");
		} else {
			System.out.println("Transferência Fallhou!");
		}
		
		System.out.println("Saldo em conta [ANNE]: R$ " + contaDaAnne.getSaldo());
		System.out.println("Saldo em conta [MARCO]: R$ " + contaDoMarco.getSaldo());
		
	}
}
