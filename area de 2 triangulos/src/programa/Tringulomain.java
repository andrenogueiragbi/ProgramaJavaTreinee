package programa;

import java.util.Locale;
import java.util.Scanner;
import entidades.Result;
import entidades.Triangolos;

public class Tringulomain {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner teclado = new Scanner(System.in);
		
		Triangolos x, y;
		x = new Triangolos();
		y = new Triangolos();
	
		System.out.println("Entre os valores do triangulo X");
		x._1 = teclado.nextDouble();
		x._2 = teclado.nextDouble();
		x._3 = teclado.nextDouble();
		System.out.println("Entre com os valore do tringulo Y");
		y._1 = teclado.nextDouble();
		y._2 = teclado.nextDouble();
		y._3 = teclado.nextDouble();
		
		double areaX = x.area();
		double areaY = y.area();

		System.out.printf("%.4f%n",areaX);
		System.out.printf("%.4f%n",areaY);
		
		if(areaX == areaY) {
			System.out.println("deu impate");
	    }else if(areaX>areaY) {
			System.out.println("X é maior");
		}else {
			System.out.println("Y é maior");
		}
		
	
		
		
		teclado.close();
	}

}
