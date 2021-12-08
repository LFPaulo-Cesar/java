package primeirosPassos;

import java.util.Scanner;

public class Exerc06DistanciaEntreDoisPontos {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		double x1, x2, y1, y2, distancia;

		System.out.println("Digite a coordenada x do primeiro ponto: ");
		x1 = input.nextDouble();
		System.out.println("Digite a coordenada y do primeiro ponto: ");
		x2 = input.nextDouble();
		System.out.println("Digite a coordenada x do segundo ponto: ");
		y1 = input.nextDouble();
		System.out.println("Digite a coordenada y do segundo ponto: ");
		y2 = input.nextDouble();

		distancia = Math.sqrt(Math.pow((x2 - x1), 2)) + (Math.pow((y2 - y1), 2));
		
		System.out.println("\nA distância entre dois pontos será: " + distancia);

	}
}
