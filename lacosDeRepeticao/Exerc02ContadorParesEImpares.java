/*2- Ler 10 n�meros e imprimir quantos s�o pares e quantos s�o �mpares.*/

package lacosDeRepeticao;

import java.util.Scanner;

public class Exerc02ContadorParesEImpares {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int numero, contadorPares = 0, contadorImpares = 0;
		
		for(int i = 0; i < 10; i++) {
			System.out.println("Digite um n�mero: ");
			numero = input.nextInt();
			if(numero %2 == 0) {
				contadorPares++;
			}else {
				contadorImpares++;
			}
		}
		System.out.println("A quantidade de n�meros pares digitados foi: "+contadorPares);
		System.out.println("A quantidade de n�meros �mpares digitados foi: "+contadorImpares);
		
		input.close();
	}
}
