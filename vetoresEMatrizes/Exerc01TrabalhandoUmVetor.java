package vetoresEMatrizes;

public class Exerc01TrabalhandoUmVetor {
	public static void main(String[] args) {
		int[] arrayA = new int[] { 1, 0, 5, -2, 5, 7 };
		int somaPosicoes;
		somaPosicoes = arrayA[0] + arrayA[1] + arrayA[5];
		System.out.println("A soma dos n�meros que est�o nas posi��es 0, 1 e 5 � igual a: "+somaPosicoes+"\n");
		arrayA[4] = 100;
		for(int i = 0; i < 6; i++) {
			System.out.println("Na posi��o "+(i+1)+" temos o seguinte valor: "+arrayA[i]);
		}
		

	}
}
