package primeirosPassos;
import java.util.Scanner;

public class Exerc05Medias {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		double nota1, nota2, nota3, peso1 = 2.0, peso2 = 3.0, peso3 = 5.0, mediaPonderada;
		
		System.out.println("Digite a primeira nota: ");
		nota1 = input.nextDouble();
		System.out.println("Digite a segunda nota: ");
		nota2 = input.nextDouble();
		System.out.println("Digite a terceira nota: ");
		nota3 = input.nextDouble();
		
		mediaPonderada = (nota1 * peso1) + (nota2 * peso2) + (nota3 * peso3) / peso1 + peso2 + peso3;
		System.out.println("A média ponderada do aluno é de "+mediaPonderada);
		input.close();
	}
}
