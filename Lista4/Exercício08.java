package Package4;

import java.util.Scanner;

public class Exercício08 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		int[] numeros = new int [10];
		
		System.out.println("Digite 10 números: ");
		for(int i = 0; i < numeros.length; i++) {
			numeros[i] = sc.nextInt();
		}
		
		System.out.print("Digite o valor X: ");
		int X = sc.nextInt();
		
		int contagem = 0;
		for (int num: numeros) {
			if (num == X) {
				contagem++;
			}
		}
		
		System.out.println("O valor " + X + " aparece " + contagem + " vezes no array." );
		
		sc.close();

	}

}
