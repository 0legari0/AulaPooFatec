package Package4;

import java.util.Scanner;
import java.util.Arrays;

public class Exercício09 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
        int[] numeros = new int[10];

        System.out.println("Digite 10 números:");
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = scanner.nextInt();
        }

       
        Arrays.sort(numeros);

        System.out.println("Array em ordem crescente:");
        for (int num : numeros) {
            System.out.print(num + " ");
        }
        scanner.close();
    }

		

	}


