/*4- Fa�a um programa em que permita a entrada de um n�mero qualquer e exiba se este
n�mero � par ou �mpar. Se for par exiba tamb�m a raiz quadrada do mesmo; se for
�mpar exiba o n�mero elevado ao quadrado.*/

package estruturasCondicionais;

import java.util.Scanner;

public class Exerc04ParOuImpar {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		double numero, raizQuadradaDeNumero, quadradoDeNumero;
		
		System.out.println("Digite um n�mero: ");
		numero = input.nextInt();
		
		if(numero %2 == 0) {
			raizQuadradaDeNumero = Math.sqrt(numero);
			System.out.printf("O n�mero "+(int)numero+" � Par!\nE sua ra�z quadrada �: %.2f",raizQuadradaDeNumero);
		}else {
			quadradoDeNumero = Math.pow(numero, 2);
			System.out.println("O n�mero "+(int)numero+" � �mpar!\nE elevado ao quadrado �: "+(int)quadradoDeNumero);
		}
	}
}
