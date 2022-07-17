package exercicios;

import java.util.Scanner;

/* Fazer um programa para ler as medidas da largura e comprimento de um terreno retangular com uma 
casa decimal, bem como o valor do metro quadrado do terreno com duas casas decimais. Em seguida, 
o programa deve mostrar o valor da área do terreno, bem como o valor do preço do terreno, ambos com 
duas casas decimais, conforme exemplo. */

public class Terreno {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		double largura, comprimento, valorArea, valorTerreno, valorMetro;
		
		System.out.println("Digite a largura do terreno: ");
		largura = sc.nextDouble();
		System.out.println("Digite o comprimento do terreno: ");
		comprimento = sc.nextDouble();
		System.out.println("Digite o valor do metro quadrado do terreno: ");
		valorMetro = sc.nextDouble();
		
		valorArea = largura * comprimento;
		valorTerreno = valorArea * valorMetro;
		
		System.out.printf("Area do terreno: %3.2f metros\n" , valorArea);
		System.out.printf("Preco do terreno: %3.2f R$\n" , valorTerreno);

	}

}
