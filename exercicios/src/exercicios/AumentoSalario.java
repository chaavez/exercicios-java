/*Um funcionário de uma empresa recebe aumento salarial anualmente. Sabe-se que:
a) Esse funcionário foi contratado em 1995, com o salário inicial de R$1000,00;
b) Em 1996 recebeu um aumento de 1,5% sobre o seu salário inicial;
c) A partir de 1997, os aumentos salariais sempre corresponderam ao
dobro do percentual do ano anterior.
Faça um programa que determine o salário atual desse funcionário.*/

package exercicios;

public class AumentoSalario {
	
	public static void main (String[] args) {
		
		double salario = 1000, aumentSal = 1.5, salAtualizado = 0, ano = 1995;
		
		do {
			salAtualizado = salario + (aumentSal * salario / 100);
			aumentSal = aumentSal * 2;
			ano++;
		} while (ano < 1999); {
			System.out.println(salAtualizado);
		}
	}
}
