package Package4;

import java.util.Scanner;

public class Exercício24 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
        int[][] matriz = new int[5][5];

        System.out.println("Digite os elementos da matriz 5x5:");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                matriz[i][j] = scanner.nextInt();
            }
        }

        System.out.print("Digite o número a buscar: ");
        int alvo = scanner.nextInt();
        boolean achou = false;

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if (matriz[i][j] == alvo) {
                    System.out.println("Número encontrado na Posição: Linha " + i + ", Coluna " + j);
                    achou = true;
                }
            }
        }

        if (!achou) {
            System.out.println("O número não foi encontrado na matriz.");
        }
        scanner.close();
    }

		

	}


