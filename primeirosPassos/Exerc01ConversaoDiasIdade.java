package primeirosPassos;
/*2. Faça um sistema que leia a idade de uma pessoa expressa em dias e mostre-a
expressa em anos, meses e dias.*/

import java.util.Scanner;

public class Exerc01ConversaoDiasIdade {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int dias, meses, anos;

		System.out.println("Digite quantos dias de vida você tem: ");
		dias = input.nextInt();
		
		anos = dias / 365;
		meses = (dias % 365) / 30;
		dias = (dias % 365) % 30;
		
		System.out.println("A sua idade é "+anos+" anos, "+meses+" meses e "+dias+" dias.");
		input.close();		
	}

}
