package caneta;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		TipoCaneta caneta1 = new TipoCaneta();
		TipoCaneta caneta2 = new TipoCaneta();
		
		System.out.println("COR1");
		caneta1.cor = sc.next();
		System.out.println("PONTA1");
		caneta1.ponta = sc.nextDouble();
		System.out.println("PREÇO1");
		caneta1.preco = sc.nextDouble();
		System.out.println("FABRICANTE1");
		caneta1.fabricante = sc.next();
		System.out.println("MODELO1");
		caneta1.modelo = sc.next();		
		System.out.println("ESTOQUE");
		caneta1.estoque = sc.nextInt();		
		System.out.println("COR2");
		caneta2.cor = sc.next();
		System.out.println("PONTA2");
		caneta2.ponta = sc.nextDouble();
		System.out.println("PREÇO2");
		caneta2.preco = sc.nextDouble();
		System.out.println("FABRICANTE2");
		caneta2.fabricante = sc.next();
		System.out.println("MODELO2");
		caneta2.modelo = sc.next();		
		System.out.println("ESTOUQE2");
		caneta2.estoque = sc.nextInt();
		
		
		System.out.println(caneta1.formulario());
		if(caneta1.podeVender()==true) {
			System.out.println("PODE VENDER");
		}else {
			System.out.println("NÃO PODE VENDER");
		}
		System.out.println(caneta2.formulario());
		if(caneta2.podeVender()==true) {
			System.out.println("PODE VENDER");
		}else {
			System.out.println("NÃO PODE VENDER");
		}
			

	}

}
