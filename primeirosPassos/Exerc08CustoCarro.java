/*8. O custo ao consumidor de um carro novo é a soma do custo de fábrica com a
percentagem do distribuidor e dos impostos (aplicados ao custo de fábrica).
Supondo que a percentagem do distribuidor seja de 28% e os impostos de 45%,
escrever um sistema que leia o custo de fábrica de um carro e escreva o custo ao
consumidor.*/

package primeirosPassos;

import java.util.Scanner;

public class Exerc08CustoCarro {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		double custoFabrica, porcentagemDistribuidor = 0.28, impostos = 0.45, custoFinal;
		
		System.out.println("Digite o custo de fábrica do carro: ");
		custoFabrica = input.nextDouble();
		
		custoFinal = (custoFabrica * porcentagemDistribuidor) + (custoFabrica * impostos) + custoFabrica;
		
		System.out.println("\nO custo final do carro que o consumidor irá pagar será de: "+custoFinal+" reais.");
		
	}
}
