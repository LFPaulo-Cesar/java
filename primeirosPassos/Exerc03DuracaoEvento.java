package primeirosPassos;
/*3. Fa�a um sistema que leia o tempo de dura��o de um evento em uma f�brica
expressa em segundos e mostre-o expresso em horas, minutos e segundos.*/

import java.util.Scanner;

public class Exerc03DuracaoEvento {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int segundos, minutos, horas;
		
		System.out.println("Digite quantos segundos durou o evento: ");
		segundos = input.nextInt();
		
		horas = segundos / 3600;
		minutos = (segundos%3600)/60;
		segundos = (segundos%3600)%60;
					
		System.out.println("\nA dura��o total do evento foi de: "+horas+" horas, "+minutos+" minutos e "
				+segundos+" segundos.");	
		input.close();
	}
}
