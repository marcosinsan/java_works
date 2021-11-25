package com.bytebank;

public class Funcionario {
	
	private String nome;
	private String cpf;
	private double salario;
	
	// ==== Methods Create ==== //
	
	public double getBonificacao() {
		return this.salario * 0.1;
	}
	
	// ====== Gets and Sets ======//
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	
}
