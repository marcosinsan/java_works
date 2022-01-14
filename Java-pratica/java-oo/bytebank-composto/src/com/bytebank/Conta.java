package com.bytebank;


public class Conta {
	
	// Atributos 
	
	public double saldo;
	public int agencia;
	public int numero;
	public Cliente titular = new Cliente();
	
	
	// ============ Métodos conta ================//
	
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
	
	
	
	
	
	
	
}
