
import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		double preco = 28.0;
		double desconto = (preco>30) ? preco * 0.05: preco * 0.0 ;
		
		System.out.println(preco);
		System.out.println(desconto);
		System.out.println("VALOR A PAGAR "+(preco-desconto));
				
		
	}

}
