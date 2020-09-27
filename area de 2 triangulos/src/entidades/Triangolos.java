package entidades;

public class Triangolos {
	public double _1;
	public double _2;
	public double _3;
	
	
	public double area() {
		
	    double p = (_1+_2+_3)/2;
	    
	    return Math.sqrt(p*(p- _1) * (p - _2) * (p - _3));
		
		
	}
}
