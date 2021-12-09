/*4- Faça um programa em que permita a entrada de um número qualquer e exiba se este
número é par ou ímpar. Se for par exiba também a raiz quadrada do mesmo; se for
ímpar exiba o número elevado ao quadrado.*/

package estruturasCondicionais;

import java.util.Scanner;

public class Exerc04ParOuImpar {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		double numero, raizQuadradaDeNumero, quadradoDeNumero;
		
		System.out.println("Digite um número: ");
		numero = input.nextInt();
		
		if(numero %2 == 0) {
			raizQuadradaDeNumero = Math.sqrt(numero);
			System.out.printf("O número "+(int)numero+" é Par!\nE sua raíz quadrada é: %.2f",raizQuadradaDeNumero);
		}else {
			quadradoDeNumero = Math.pow(numero, 2);
			System.out.println("O número "+(int)numero+" é Ímpar!\nE elevado ao quadrado é: "+(int)quadradoDeNumero);
		}
	}
}
