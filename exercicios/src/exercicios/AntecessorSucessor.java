package exercicios;

import java.util.Scanner;

/*Desenvolva um algoritmo em Java que leia um número inteiro e imprima o seu
antecessor e seu sucessor*/

public class AntecessorSucessor {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Escreva um numero: ");
		int numero = sc.nextInt();
		int sucessor = numero + 1;
		int antecessor = numero -1;
		
		System.out.println("O numero sucessor do que foi digitado é: " + sucessor);
		System.out.println("O numero antecessor do que foi digitado é: " +antecessor);
		
	}

}
