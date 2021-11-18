package br.com.demo.forum.config.validacao;

public class ErroDeFormularioDto {
	
	private String campo;
	private String erro;
	
	// contrutor
	
	public ErroDeFormularioDto(String campo, String erro) {
		super();
		this.campo = campo;
		this.erro = erro;
	}

	// Métodos gets
	
	public String getCampo() {
		return campo;
	}

	public String getErro() {
		return erro;
	}
	
	
	
	
}
