package Package3;

import java.util.Scanner;

public class Exercício11 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
        int numero;
        
        do {
            System.out.print("Por favor, informe um número entre 1 e 10: ");
            numero = scanner.nextInt();
            
            if (numero < 1 || numero > 10) {
                System.out.println("Valor inválido! Tente novamente.");
            }
        } while (numero < 1 || numero > 10);
        
        System.out.println("Número válido recebido: " + numero);
        scanner.close();
    }

		
		

	}


