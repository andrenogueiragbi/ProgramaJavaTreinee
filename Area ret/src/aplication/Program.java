package aplication;

import java.util.Locale;
import java.util.Scanner;

import javax.swing.JOptionPane;

import entidade.Calculation;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner tc = new Scanner(System.in);
		Calculation calculation = new Calculation();
		
		
		//JOptionPane.showMessageDialog(null, “alerta”, “alerta”, JOptionPane.ERROR_MESSAGE);
		
		System.out.println("Digite a area X do retangulo");
		calculation.direito = tc.nextInt();

		System.out.println("Digite a area Y do retangulo");
		calculation.esquerdo = tc.nextInt();
		
		System.out.println("AREA= "+calculation.area());
		System.out.println("PERIMETRO= "+calculation.perimetro());
		System.out.println("DIAGONAL= "+calculation.diagonal());
	}

}
