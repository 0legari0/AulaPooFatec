package Package4;

import java.util.Scanner;

public class Exercício22 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
        int[][] matriz = new int[3][3];
        boolean repetido = false;

        System.out.println("Digite os elementos da matriz 3x3:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matriz[i][j] = scanner.nextInt();
            }
        }

        // Estrutura para comparar cada elemento com os demais
        for (int i = 0; i < 9; i++) {
            for (int j = i + 1; j < 9; j++) {
                int val1 = matriz[i / 3][i % 3];
                int val2 = matriz[j / 3][j % 3];
                if (val1 == val2) {
                    repetido = true;
                    break;
                }
            }
        }

        if (!repetido) {
            System.out.println("Válido! A matriz não possui números repetidos.");
        } else {
            System.out.println("Inválido! Existem números repetidos na matriz.");
        }
        scanner.close();
    }

		

	}


