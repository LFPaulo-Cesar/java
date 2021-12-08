package primeirosPassos;

import java.util.Scanner;

public class Exerc07Equacao {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		double a, b, c, d, e, f, x, y;
		
		System.out.println("Digite o valor de a: ");
		a = input.nextDouble();
		System.out.println("Digite o valor de b: ");
		b = input.nextDouble();
		System.out.println("Digite o valor de c: ");
		c = input.nextDouble();
		System.out.println("Digite o valor de d: ");
		d = input.nextDouble();
		System.out.println("Digite o valor de e: ");
		e = input.nextDouble();
		System.out.println("Digite o valor de f: ");
		f = input.nextDouble();
		
		x = (c*e) - (b*f) / (a*e) - (b*d);
		y = (a*f) - (c*d) / (a*e) - (b*d);
		
		System.out.println("O valor de x é: "+x);
		System.out.println("O valor de y é: "+y);
		
		
		
		
	}
}
