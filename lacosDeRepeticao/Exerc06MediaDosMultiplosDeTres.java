/*6- Escrever um programa que receba vários números inteiros no teclado. E no
final imprimir a média dos números múltiplos de 3. Para sair digitar
0(zero).(DO...WHILE)*/

package lacosDeRepeticao;

import java.util.Scanner;

public class Exerc06MediaDosMultiplosDeTres {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);		
		int numero, somaMultiplos = 0, contador = 0, mediaMultiplosDe3;
		
		do {
			System.out.println("Digite um número: ");
			numero = input.nextInt();
			if(numero %3 == 0) {
				somaMultiplos += numero;
				contador++;
			}
		}while(numero != 0);
		
		mediaMultiplosDe3 = somaMultiplos / contador;
		System.out.println("A média dos números digitados que são múltiplos de três são: "+mediaMultiplosDe3);
		
		input.close();
	}
}
