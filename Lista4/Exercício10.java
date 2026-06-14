package Package4;

import java.util.Scanner;

public class Exercício10 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
        int[] numeros = new int[10];

        System.out.println("Digite 10 números:");
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = scanner.nextInt();
        }

        System.out.println("Valores únicos:");
        for (int i = 0; i < numeros.length; i++) {
            boolean duplicado = false;
            
            for (int j = 0; j < i; j++) {
                if (numeros[i] == numeros[j]) {
                    duplicado = true;
                    break;
                }
            }
            if (!duplicado) {
                System.out.print(numeros[i] + " ");
            }
        }
        scanner.close();
    }

		

	}


