package teste;

import com.bytebank.Cliente;
import com.bytebank.Conta;

public class TestaConta {

	public static void main(String[] args) {
		
		Conta contaDaAnne = new Conta();
		
		contaDaAnne.titular = new Cliente();
		contaDaAnne.titular.nome = "ANNE";
		
		System.out.println(contaDaAnne.titular.nome);
	}
}
