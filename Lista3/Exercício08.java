package Package3;

import java.util.Scanner;

public class Exercício08 {

	public static void main(String[] args) {
		
Scanner scanner = new Scanner(System.in);
        
        System.out.print("Quantos números você deseja informar? ");
        int quantidade = scanner.nextInt();
        
        if (quantidade <= 0) {
            System.out.println("Quantidade inválida para calcular média.");
        } else {
            double soma = 0;
            for (int i = 1; i <= quantidade; i++) {
                System.out.print("Digite o número " + i + ": ");
                soma += scanner.nextDouble();
            }
            double media = soma / quantidade;
            System.out.println("A média dos valores informados é: " + media);
        }
        
        scanner.close();
    }

		
		

	}


