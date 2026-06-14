package Package3;

import java.util.Scanner;

public class Exercício07 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
        int positivos = 0;
        int negativos = 0;
        
        System.out.println("Digite 10 números inteiros:");
        for (int i = 1; i <= 10; i++) {
            System.out.print("Número " + i + ": ");
            int num = scanner.nextInt();
            
            if (num > 0) {
                positivos++;
            } else if (num < 0) {
                negativos++;
            }
          
        }
        
        System.out.println("Quantidade de números positivos: " + positivos);
        System.out.println("Quantidade de números negativos: " + negativos);
        scanner.close();
    }


	}


