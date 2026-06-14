package Package4;

import java.util.Scanner;
public class Exercício07 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        int[] numeros = new int[10];

        System.out.println("Digite 10 números:");
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = scanner.nextInt();
        }

        System.out.print("Digite o valor X a ser buscado: ");
        int x = scanner.nextInt();

        boolean encontrado = false;
        for (int num : numeros) {
            if (num == x) {
                encontrado = true;
                break;
            }
        }

        if (encontrado) {
            System.out.println("O valor " + x + " está presente no array.");
        } else {
            System.out.println("O valor " + x + " NOT está presente no array.");
        }
        scanner.close();
    }


	}


