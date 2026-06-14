package Package4;

import java.util.Scanner;
public class Exercício02 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
        int[] numeros = new int[10];
        int soma = 0;

        System.out.println("Digite 10 números:");
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = scanner.nextInt();
            soma += numeros[i];
        }

        System.out.println("Soma de todos os elementos: " + soma);
        scanner.close();
    }

		

	}


