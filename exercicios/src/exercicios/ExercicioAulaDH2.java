/*2.Um dado é lançado 10 vezes e o valor correspondente é anotado.
 *  Faça um programa que gere um vetor com os lançamentos, escreva esse vetor.
 A seguir determine e imprima a média aritmética dos lançamentos, contabilize e apresente também quantas foram as ocorrências da maior pontuação.
*/

package exercicios;

import java.util.Scanner;

public class ExercicioAulaDH2 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Quantidade de jogadas: ");
		int entrada = sc.nextInt();
		int[] numerosDado = new int[entrada];
		int valor = 0;
		int media = 0;
		int soma = 0;
		int maior = 0;
		int repeticao = 0;
		
		for(int i = 0; i < numerosDado.length; i++) {
			System.out.println("Digite o número que saiu no dado: ");
			valor = sc.nextInt();
			soma += valor;
			
			if (valor > maior) {
				maior = valor;
				repeticao = 1;
		} else if (valor == maior) {
			repeticao++;
		}
	} 	
		media = soma/entrada; 
		
		System.out.println("O "+ maior + " é repetido: " + repeticao);
		System.out.println("A média é: " + media);
			
	}

}
	