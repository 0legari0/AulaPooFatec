package Package4;

import java.util.Scanner;

public class Exercício18 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
        int[][] m1 = new int[3][3];
        int[][] m2 = new int[3][3];
        int[][] mSoma = new int[3][3];

        System.out.println("Digite os elementos da primeira matriz 3x3:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) m1[i][j] = scanner.nextInt();
        }

        System.out.println("Digite os elementos da segunda matriz 3x3:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) m2[i][j] = scanner.nextInt();
        }

        System.out.println("Matriz resultante da soma:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                mSoma[i][j] = m1[i][j] + m2[i][j];
                System.out.print(mSoma[i][j] + "\t");
            }
            System.out.println();
        }
        scanner.close();
    }

		

	}


