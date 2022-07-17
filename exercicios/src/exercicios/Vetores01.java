package exercicios;

public class Vetores01 {

	public static void main(String[] args) {
		
		/*1. Leia um vetor de 12 posições e em seguida ler também dois valores X e Y quaisquer correspondentes a duas posições no vetor.
		 Ao final seu programa deverá escrever a soma dos valores encontrados nas respectivas posições X e Y
		 */
		
		int[] vetor = {1,2,3,4,5,6,7,8,9,10,11,12};
		int x = vetor[5];
		int y = vetor[8];
		int soma = x + y;
		System.out.println(soma);
		
	}

}
