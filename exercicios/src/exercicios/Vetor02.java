package exercicios;

import java.util.Scanner;

public class Vetor02 {

	public static void main(String[] args) {
		
		// Declare um vetor de 10 posições e o preencha com os 10 primeiros números impares e o escreva.
		 
		int[] vetor = new int[10];
		Scanner sc = new Scanner(System.in);
		
		for (int i = 0; i < vetor.length; i++) {
			vetor[i] = sc.nextInt();
			System.out.println(vetor[i]);
		}
	}
}