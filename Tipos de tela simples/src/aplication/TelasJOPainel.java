package aplication;

import javax.swing.JOptionPane;

public class TelasJOPainel {

	public static void main(String[] args) {
		JOptionPane.showMessageDialog(null, "ALGO DEU ERRADO", "PARE", JOptionPane.ERROR_MESSAGE);
		
		int teste = JOptionPane.showConfirmDialog(null, "QUAL A OPÇÂO?");
		
		JOptionPane.showMessageDialog(null, "OPÇÂO DA TELA ANTERIOR "+teste);
		
		System.out.println(teste);
		
		String teste2 = JOptionPane.showInputDialog("TESTE");
		
		System.out.println(teste2);
		
		
		
	}

}
