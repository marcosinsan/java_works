package bytebank.conta;

public class Conta {
	
	// Atributos 
	
	private double saldo;
	private int agencia;
	private int numero;
	private String titular;
	
	
	// Acessores
	
	public double getSaldo() {
		return saldo;
	}
	
	public int getAgencia() {
		return agencia;
	}
	
	public int getNumero() {
		return numero;
	}
	
	public String getTitular() {
		return titular;
	}
	
	// Alteradores
	
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}
	
	public void setNumero(int numero) {
		this.numero = numero;
	}
	
	public void setTitular(String titular) {
		this.titular = titular;
	}
	
	// Métodos conta
	
	public void deposita(double valor) {
		this.saldo += valor;
	}
	
	
	
	
	
	
	
}
