package teste;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		double x = 2,y = 9, z = 25;
		
		System.out.println("RAIZ QUADRADA");
		x = Math.sqrt(x);
		y = Math.sqrt(y);
		z = Math.sqrt(z);	
		System.out.println(x);
		System.out.println(y);
		System.out.println(z);		
		
		

		Aluno aluno1 = new Aluno();
		Endereco endereco1 = new Endereco();
		aluno1.nome = "Andre";
		aluno1.sobrenome = "Nogueira";
		aluno1.cpf = "041248";
		aluno1.idade = 30;
		aluno1.telefone = "3451-3838";
		aluno1.endereco = endereco1;

		endereco1.bairro = "Alvorada";
		endereco1.cidade = "Guanambi";
		endereco1.estado = "BA";
		endereco1.numero = 61;
		endereco1.pais = "Brasil";
		endereco1.rua = "Alcebiades Pererira Costa";

		// System.out.println(aluno1.endereco.tudoEndereco());

	}

}
