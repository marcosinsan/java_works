package Testa;

import com.bytebank.Funcionario;

public class TestaFuncionario {
	
	public static void main(String[] args) {
		
		Funcionario funcionario = new Funcionario();
		
		funcionario.setNome("Marcos Santana");
		funcionario.setCpf("111.222.333.44");
		funcionario.setSalario(2600.0);
		
		
		System.out.println("Nome do funcionario: " + funcionario.getNome());
		System.out.println("Bonificação: " + funcionario.getBonificacao());
	}

}
