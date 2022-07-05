/* Escreva um programa que, com base em uma temperatura em graus celsius, a converta e exiba em Kelvin (K), Réaumur (Re),
Rankine (Ra) e Fahrenheit (F), seguindo as fórmulas: F = C * 1.8 + 32; K = C + 273.15; Re = C * 0.8; Ra = C * 1.8 + 32 + 459.67
*/

package exercicios;

import java.util.Scanner;

public class Temperaturas {

	public static void main(String[] args) {

		double C, K, Re, Ra, F;
		
			Scanner sc = new Scanner(System.in);
			System.out.println("Digite um valor em Celsius: " );
				C = sc.nextDouble()*1;
			
		System.out.println("A conversão desse número de Celsius para Kelvin é: " + (C + 273.15));
		System.out.println("A conversão desse número de Celsius para Réaumur é: " + (C * 0.8));
		System.out.println("A conversão desse número de Celsius para Rankine é: " + (C * 1.8 + 32 + 459.67 ));
		System.out.println("A conversão desse número de Celsius para Fahrenheit é: " + (C * 1.8 + 32));
		
		
	}

}
