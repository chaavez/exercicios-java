package exercicios;

/*Fazer um programa que imprima a média aritmética dos números 8,9 e 7. A média dos 
números 4, 5 e 6. A soma das duas médias. A média das médias.*/

public class MediaAritmetica {

	public static void main(String[] args) {
		
		double mediaMaior, mediaMenor, somaMedias, mediaDasMedias;
		
		mediaMaior = (8 + 9 + 7) / 3;
		mediaMenor = (4 + 5 + 6) / 3;
		somaMedias = mediaMaior + mediaMenor;
		mediaDasMedias = somaMedias / 2;
		
		System.out.println("Média dos numeros 8, 9, 7: " + mediaMaior);
		System.out.println("Média dos numeros 4, 5 , 6: " + mediaMenor);
		System.out.println("Soma das duas médias: " + somaMedias);
		System.out.println("Média das duas médias: " + mediaDasMedias);
		
	}

}
