/*4- Uma empresa desenvolveu uma pesquisa para saber as características
psicológicas dos indivíduos de uma região. Para tanto, a cada uma das pessoas
era perguntado: idade, sexo (1-feminino / 2-masculino / 3-Outros), e as opções
(1, se a pessoa era calma; 2, se a pessoa era nervosa e 3, se a pessoa era
agressiva). Pede-se para elaborar um sistema que permita ler os dados de 150
pessoas, calcule e mostre:
 o número de pessoas calmas;
 o número de mulheres nervosas;
 o número de homens agressivos;
 o número de outros calmos;
 o número de pessoas nervosas com mais de 40 anos;
 o número de pessoas calmas com menos de 18 anos.*/

package lacosDeRepeticao;

import java.util.Scanner;

public class Exerc04SensoSaudeMental {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int idade, sexo, humor, contadorNumeroDePessoas = 0, contadorPessoasCalmas = 0,
				contadorMulheresNervosas = 0, contadorHomensAgressivos = 0,
				contadorOutrosCalmos = 0, ContadorPessoasMaisQuarentaNervosas = 0, ContadorPessoasMenosDezoitoCalmas = 0; 
		
		while(contadorNumeroDePessoas < 5) {//coloquei <5 para teste, o valor que o enunciado pede é 150.
		System.out.println("Digite a sua idade: ");
		idade = input.nextInt();
		
		System.out.println("\nInforme o seu sexo: ");
		System.out.println("1.Feminino.");
		System.out.println("2.Masculino.");
		System.out.println("3.Outro.");
		sexo = input.nextInt();
		
		System.out.println("\nDe acordo com a sua personaldade responda: ");
		System.out.println("Você se considera uma pessoa: ");
		System.out.println("1. Calma;");
		System.out.println("2. Nervosa;");
		System.out.println("3. Agressiva.");
		humor = input.nextInt();
		System.out.println();
		
		if(humor == 1) {
			contadorPessoasCalmas++;
		}else if(sexo == 1 && humor == 2) {
			contadorMulheresNervosas++;
		}else if(sexo == 2 && humor == 3) {
			contadorHomensAgressivos++;
		}else if(sexo == 3 && humor == 1) {
			contadorOutrosCalmos++;
		}else if(idade > 40 && humor == 2) {
			ContadorPessoasMaisQuarentaNervosas++;
		}else if(idade < 18 && humor == 1) {
			ContadorPessoasMenosDezoitoCalmas++;
		}
		contadorNumeroDePessoas++;
		}
		System.out.println("Número de pessoas calmas: "+contadorPessoasCalmas);
		System.out.println("Número de pessoas do sexo feminino nervosas: "+contadorMulheresNervosas);
		System.out.println("Número de pessoas do sexo masculino agressivos: "+contadorHomensAgressivos);
		System.out.println("Número de pessoas do sexo outros calmos: "+contadorOutrosCalmos);
		System.out.println("Número de pessoas nervosas com mais de 40 anos: "+ContadorPessoasMaisQuarentaNervosas);
		System.out.println("Número de pessoas calmas com menos de 18 anos: "+ContadorPessoasMenosDezoitoCalmas);
		
		
		input.close();
	}
}