package primeirosPassos;
import java.util.Scanner;

public class Exerc04CalculeAExpressao {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		double a, b, c, r, s, d;
		
		System.out.println("Digite o primeiro n�mero: ");
		a = input.nextDouble();
		System.out.println("Digite o segundo n�mero: ");
		b = input.nextDouble();
		System.out.println("Digite o tericeiro n�mero: ");
		c = input.nextDouble();
		
		r = Math.pow((a+b), 2);
		s = Math.pow((b+c), 2);
		
		d = (r + s) / 2;
		
		System.out.println("O valor de D �: "+d);
		input.close();
	}
}
