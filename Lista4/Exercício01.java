package Package4;

import java.util.Scanner;

public class Exercício01 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
        int[] numeros = new int[5];

        System.out.println("Digite 5 números inteiros:");
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = scanner.nextInt();
        }

        System.out.println("Valores armazenados:");
        for (int num : numeros) {
            System.out.print(num + " ");
        }
        scanner.close();
    }

		
		

	}


