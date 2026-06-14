package Package3;

import java.util.Scanner;

public class Exercício10 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
        int soma = 0;
        int num;
        
        System.out.println("Digite os números para somar (Digite 0 para sair):");
        
        do {
            System.out.print("Digite um número: ");
            num = scanner.nextInt();
            soma += num;
        } while (num != 0);
        
        System.out.println("A soma total de todos os números é: " + soma);
        scanner.close();
    }

		

	}


