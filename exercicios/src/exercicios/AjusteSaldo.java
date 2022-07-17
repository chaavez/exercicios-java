package exercicios;

import java.util.Scanner;

//Informar um saldo e imprimir o saldo com reajuste de 1%.

public class AjusteSaldo {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o saldo: ");
		double saldo = sc.nextDouble();
		double reajuste = saldo + (saldo * 1 / 100);
		
		System.out.println("Seu reajuste de 1% no saldo vai para: " + reajuste);

	}

}
