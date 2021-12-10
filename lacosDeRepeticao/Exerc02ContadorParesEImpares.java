/*2- Ler 10 números e imprimir quantos são pares e quantos são ímpares.*/

package lacosDeRepeticao;

import java.util.Scanner;

public class Exerc02ContadorParesEImpares {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int numero, contadorPares = 0, contadorImpares = 0;
		
		for(int i = 0; i < 10; i++) {
			System.out.println("Digite um número: ");
			numero = input.nextInt();
			if(numero %2 == 0) {
				contadorPares++;
			}else {
				contadorImpares++;
			}
		}
		System.out.println("A quantidade de números pares digitados foi: "+contadorPares);
		System.out.println("A quantidade de números ímpares digitados foi: "+contadorImpares);
		
		input.close();
	}
}
