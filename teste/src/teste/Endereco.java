package teste;

public class Endereco {
	String pais;
	String estado;
	String cidade;
	String rua;
	String bairro;
	int numero;
	
	public String tudoEndereco() {
		String  endCompleto = rua + " " + bairro + " " + numero;
		endCompleto += " "+cidade + " " + estado + " " + " " + pais;
		
		return endCompleto;
	}
	
}
