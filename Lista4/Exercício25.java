package Package4;

import java.util.Scanner;

public class Exercício25 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
        int[][] matriz = new int[3][3];
        int somaSecundaria = 0;

        System.out.println("Digite os elementos da matriz 3x3:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matriz[i][j] = scanner.nextInt();
                // A diagonal secundária em matrizes 3x3 atende à condição (i + j == 2)
                if (i + j == 2) {
                    somaSecundaria += matriz[i][j];
                }
            }
        }

        System.out.println("Soma da diagonal secundária: " + somaSecundaria);
        scanner.close();
    }

		

	}


