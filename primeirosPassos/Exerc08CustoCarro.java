/*8. O custo ao consumidor de um carro novo � a soma do custo de f�brica com a
percentagem do distribuidor e dos impostos (aplicados ao custo de f�brica).
Supondo que a percentagem do distribuidor seja de 28% e os impostos de 45%,
escrever um sistema que leia o custo de f�brica de um carro e escreva o custo ao
consumidor.*/

package primeirosPassos;

import java.util.Scanner;

public class Exerc08CustoCarro {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		double custoFabrica, porcentagemDistribuidor = 0.28, impostos = 0.45, custoFinal;
		
		System.out.println("Digite o custo de f�brica do carro: ");
		custoFabrica = input.nextDouble();
		
		custoFinal = (custoFabrica * porcentagemDistribuidor) + (custoFabrica * impostos) + custoFabrica;
		
		System.out.println("\nO custo final do carro que o consumidor ir� pagar ser� de: "+custoFinal+" reais.");
		
	}
}
