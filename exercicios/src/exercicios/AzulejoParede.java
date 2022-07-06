package exercicios;

import java.util.Scanner;

public class AzulejoParede {

	public static void main(String[] args) {
		
		double altParede, largParede, altAzulejo, largAzulejo, qtAzulejo;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite as dimensões da parede:");
		System.out.println("Altura: ");
		altParede = sc.nextDouble();
		System.out.println("Largura: ");
		largParede = sc.nextDouble();
		System.out.println("Digite as dimensões do Azulejo que deseja utilizar: ");
		System.out.println("Altura: ");
		altAzulejo = sc.nextDouble();
		System.out.println("Largura: ");
		largAzulejo = sc.nextDouble();
		
		qtAzulejo = (altParede * largParede) / (altAzulejo * largAzulejo);
		
		System.out.println("Você precisa de: " + qtAzulejo + " azulejos");
		sc.close();
	}

}
