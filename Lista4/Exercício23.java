package Package4;

import java.util.Scanner;

public class Exercício23 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
        int[][] matriz = new int[3][3];
        int[][] rotacionada = new int[3][3];

        System.out.println("Digite os elementos da matriz 3x3:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matriz[i][j] = scanner.nextInt();
            }
        }

        // Fazendo o giro de 90 graus no sentido horário
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                rotacionada[j][2 - i] = matriz[i][j];
            }
        }

        System.out.println("Matriz rotacionada em 90 graus:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(rotacionada[i][j] + "\t");
            }
            System.out.println();
        }
        scanner.close();
    }

		
		

	}


