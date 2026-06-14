package Package4;

import java.util.Scanner;

public class Exercício16 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
        int[][] matriz = new int[3][3];

        System.out.println("Digite os elementos da matriz 3x3:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matriz[i][j] = scanner.nextInt();
            }
        }

        System.out.println("Matriz Transposta:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                // Inverte as linhas pelas colunas ao exibir
                System.out.print(matriz[j][i] + "\t");
            }
            System.out.println();
        }
        scanner.close();
    }

		

	}


