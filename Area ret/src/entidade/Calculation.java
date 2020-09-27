package entidade;

public class Calculation {
	public double direito;
	public double esquerdo;
	
	public double area() {		
		return direito*esquerdo;
	}
	public double perimetro() {
		return 2*(direito+esquerdo);
	}
	public double diagonal() {		
		return Math.sqrt(Math.pow(direito, 2)+Math.pow(esquerdo, 2)); 
	}
	
}
