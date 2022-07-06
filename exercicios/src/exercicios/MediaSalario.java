/* Criar um programa que calcule a média de salários de uma empresa,
 *  pedindo ao usuário a grade de funcionários e os salários, e devolvendo a média salarial.
 */

package exercicios;

import java.util.Scanner;

public class MediaSalario {

	public static void main(String[] args) {
		
		int[] gradeFuncionario;
		int qtFuncionarios =0;
		double mediaSalario =0, somaSalarios =0;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite a quantidade de funcionários: ");
		qtFuncionarios = sc.nextInt();
		gradeFuncionario = new int[qtFuncionarios];
		
			for (int i = 0; i < gradeFuncionario.length; i++ ) {
				System.out.println("Digite o salario do funcionario: ");
				somaSalarios = somaSalarios + sc.nextDouble();
		}
			mediaSalario = somaSalarios / qtFuncionarios;
			System.out.println("A média de salario é: " + mediaSalario);
			sc.close();
		}
	}

