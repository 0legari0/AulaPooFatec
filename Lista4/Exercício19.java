package Package4;

import java.util.Scanner;

public class Exercício19 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
        int[][] matriz = new int[3][3];
        boolean ehIdentidade = true;

        System.out.println("Digite os elementos da matriz 3x3:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matriz[i][j] = scanner.nextInt();
            }
        }

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (i == j && matriz[i][j] != 1) {
                    ehIdentidade = false;
                } else if (i != j && matriz[i][j] != 0) {
                    ehIdentidade = false;
                }
            }
        }

        if (ehIdentidade) {
            System.out.println("A matriz é uma Matriz Identidade.");
        } else {
            System.out.println("A matriz NÃO é uma Matriz Identidade.");
        }
        scanner.close();
    }

	

	}


