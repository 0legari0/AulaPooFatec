package Package3;

import java.util.Scanner;

public class Exercício06 {

	public static void main(String[] args) {
	    
		Scanner scanner = new Scanner(System.in);
        int maior = Integer.MIN_VALUE; 
        System.out.println("Digite 5 números inteiros:");
        for (int i = 1; i <= 5; i++) {
            System.out.print("Número " + i + ": ");
            int num = scanner.nextInt();
            if (num > maior) {
                maior = num;
            }
        }
        
        System.out.println("O maior número digitado foi: " + maior);
        scanner.close();
    }

		

	}


