package caneta;

public class TipoCaneta {
	public String cor;
	public double ponta;
	public double preco;
	public String fabricante;
	public String modelo;	
	public  int estoque;


	public String formulario() {
		String produtoCompleto = cor+" "+ponta+" "+" "+preco+" "+fabricante+" "+ modelo;
		produtoCompleto += " estoque: "+estoque; 
		return produtoCompleto;	
	}
	public boolean podeVender() {
		if(estoque > 0) {
			return true;
		}else {
			return false;
		}
	}
}
