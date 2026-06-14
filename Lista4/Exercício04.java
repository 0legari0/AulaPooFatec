package Package4;

import java.util.Scanner;

public class Exercício04 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        int[] numeros = new int[6];
        double soma = 0;

        System.out.println("Digite 6 números:");
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = scanner.nextInt();
            soma += numeros[i];
        }

        double media = soma / numeros.length;
        System.out.println("Média dos valores: " + media);
        scanner.close();
    }


	}


