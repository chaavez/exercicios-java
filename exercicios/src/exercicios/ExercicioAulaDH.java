/*/Faça um programa que crie um vetor por leitura com 5 valores de pontuação de uma atividade e o escreva em seguida.
 *  Encontre após a maior pontuação e a apresente.
*/

package exercicios;

import java.util.Scanner;

public class ExercicioAulaDH {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		double[] pontuacao = new double[5];
		double maior = 0;
		
		for (int i = 0; i < pontuacao.length; i++) {
			System.out.println("Digite a nota ");
			pontuacao[i] = sc.nextDouble();
			if (pontuacao[i] > maior) {
				maior = pontuacao[i];
			}
		}
		System.out.println(maior);
	}
}
