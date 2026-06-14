package Package4;

import java.util.Scanner;
public class Exercício03 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        int[] numeros = new int[8];

        System.out.println("Digite 8 números:");
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = scanner.nextInt();
        }

        int maior = numeros[0];
        int menor = numeros[0];

        for (int i = 1; i < numeros.length; i++) {
            if (numeros[i] > maior) maior = numeros[i];
            if (numeros[i] < menor) menor = numeros[i];
        }

        System.out.println("Maior valor: " + maior);
        System.out.println("Menor valor: " + menor);
        scanner.close();
    }

	}


