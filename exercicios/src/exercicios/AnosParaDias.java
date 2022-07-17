package exercicios;

import java.util.Scanner;

/*Faça um algoritmo que leia a idade de uma pessoa expressa em anos, meses e dias e 
mostre-a expressa em dias. Leve em consideração o ano com 365 dias e o mês com 30. 
(Ex: 3 anos, 2 meses e 15 dias = 1170 dias.)*/

public class AnosParaDias {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int idade, meses, dias, diasTotal = 0;
		
		System.out.println("Quantidade de dias que você está vivo!!");
		System.out.println("Digite a sua idade: ");
		idade = sc.nextInt();
		System.out.println("Digite quantos meses além da sua idade : ");
		meses = sc.nextInt();
		System.out.println("Digite quantos dias além da sua idade: ");
		dias = sc.nextInt();
		
		diasTotal = (idade * 365) + (meses * 30) + dias;
		System.out.println("Você está vivo a: " + diasTotal + "dias!");
		
	}
}
