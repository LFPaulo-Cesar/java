package primeirosPassos;
import java.util.Scanner;

public class Exerc02ConversaoIdadeDias {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int dias, meses, anos, conversaoDias;
		
		System.out.println("Digite a sua idade em anos: ");
		anos = input.nextInt();
		System.out.println("Digite a sua idade em meses: ");
		meses = input.nextInt();
		System.out.println("Digite a sua idade em dias: ");
		dias = input.nextInt();
		
		anos *= 365;
		meses *= 30;
		
		conversaoDias = anos + meses +  dias;
		System.out.println("A sua idade em dias é: "+conversaoDias);
		input.close();
	}

}
