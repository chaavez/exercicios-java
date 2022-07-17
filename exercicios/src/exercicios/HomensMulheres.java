/*
 Tem-se um conjunto de dados contendo a altura e o sexo (masculino, feminino) de 4 pessoas. Fazer um algoritmo que calcule e escreva:
 
	a. a maior e a menor altura do grupo;
	b. média de altura dos homens;
	c. o número de mulheres.
*/
package exercicios;

import java.util.Scanner;

public class HomensMulheres {
	
	public static void main (String[] args) {
		
		int qtHomens = 0, qtMulheres = 0, sexo;
		float altura, mediaH = 0, menor = 3, maior = 0, somaAltura =0;
		Scanner sc = new Scanner(System.in);
		
			for (int i = 0; i < 4; i++) {
			System.out.println("Digite o sexo:\n 1-Homem 2-Mulher");
			sexo = sc.nextInt();
			System.out.println("Digite a altura: ");
			altura = sc.nextFloat();
				if (sexo == 1) {
				qtHomens++;
				somaAltura = somaAltura + altura;
				} else if (sexo == 2) {
				qtMulheres++;
				} else {
				System.out.println("Número inválido");
				}
					if (altura > maior) {
						maior = altura;
					} else if (altura < menor) {
						menor = altura;
					}
					mediaH = somaAltura / qtHomens;
			}
			System.out.println("A menor altura do grupo é: " + menor);
			System.out.println("A maior altura do grupo é: " + maior);
			System.out.println("A média de altura dos homens é: " + mediaH);
			System.out.println("O número de mulheres do grupo é: " + qtMulheres);
			sc.close();
		}
	}