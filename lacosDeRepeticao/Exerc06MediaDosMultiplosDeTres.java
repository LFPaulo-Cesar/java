/*6- Escrever um programa que receba v�rios n�meros inteiros no teclado. E no
final imprimir a m�dia dos n�meros m�ltiplos de 3. Para sair digitar
0(zero).(DO...WHILE)*/

package lacosDeRepeticao;

import java.util.Scanner;

public class Exerc06MediaDosMultiplosDeTres {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);		
		int numero, somaMultiplos = 0, contador = 0, mediaMultiplosDe3;
		
		do {
			System.out.println("Digite um n�mero: ");
			numero = input.nextInt();
			if(numero %3 == 0) {
				somaMultiplos += numero;
				contador++;
			}
		}while(numero != 0);
		
		mediaMultiplosDe3 = somaMultiplos / contador;
		System.out.println("A m�dia dos n�meros digitados que s�o m�ltiplos de tr�s s�o: "+mediaMultiplosDe3);
		
		input.close();
	}
}
