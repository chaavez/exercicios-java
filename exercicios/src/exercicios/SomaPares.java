/*Faça um programa que calcule a soma dos primeiros 50 números pares. Esse
programa não recebe valor. Os primeiros números pares são 2, 4, 6, ...*/

package exercicios;

public class SomaPares {

	public static void main (String[] args) {
		
		int soma = 0;
		int[] num = new int[100];
		int n = 0;
		int par = 0;
		
		for (int i = 0; i < num.length; i++) {
			n++;
			par = n%2;
			if (par == 0) {
				soma += n;
				System.out.println(soma);
			}		
		}
	}	
}