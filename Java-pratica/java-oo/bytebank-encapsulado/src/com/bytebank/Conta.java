package com.bytebank;


public class Conta {
	
	// Atributos 
	
	private double saldo;
	private int agencia;
	private int numero;
	private Cliente titular;
	private static int total; 
	
	//======= Constructor ===========//
	
	public Conta(int agencia, int numero) {
		Conta.total++;
		System.out.println("Total de Contas: " + Conta.total);
		this.agencia = agencia;
		this.numero = numero;
		System.out.println("Conta criada... " + this.getNumero());
		
	}
	
	
	// ============ M�todos conta ================//
	
	public void deposita(double valor) {
		this.saldo += valor;
	}
	
	public boolean saca(double valor) {
		
		if(saldo >= valor) {
			saldo -= valor;
			return true;
		} else {
			return false;
		}
	}

	public boolean transfere(double valor, Conta destino) {
		
		if(this.saldo >= valor) {
			this.saldo -= valor;
			this.saca(valor);
			destino.deposita(valor);
			return true;	
		}
		
		return false;
	}
	
	
	//======== Gets and Sets ========//
	
	public double getSaldo() {
		return this.saldo;
	}
	
	public int getNumero() {
		return this.numero;
	}
	
	public void setNumero(int numero) {
		this.numero = numero;
	}
	
	public int getAgencia() {
		return this.agencia;
	}
	
	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}
	
	public Cliente getTitular() {
		return titular;
	}
	
	public void setTitular(Cliente titular) {
		this.titular = titular;
	}
	
	public static int getTotal() {
		return Conta.total;
	}
	
	
	
	
	
	
}
