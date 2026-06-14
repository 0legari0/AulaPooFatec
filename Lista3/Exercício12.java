package Package3;

import java.util.Scanner;

public class Exercício12 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
        int opcao;
        
        do {
            System.out.println("\n--- MENU INTERATIVO ---");
            System.out.println("1 - Somar");
            System.out.println("2 - Subtrair");
            System.out.println("3 - Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();
            
            switch (opcao) {
                case 1:
                    System.out.print("Digite o primeiro número: ");
                    double n1_soma = scanner.nextDouble();
                    System.out.print("Digite o segundo número: ");
                    double n2_soma = scanner.nextDouble();
                    System.out.println("Resultado da Soma: " + (n1_soma + n2_soma));
                    break;
                case 2:
                    System.out.print("Digite o primeiro número: ");
                    double n1_sub = scanner.nextDouble();
                    System.out.print("Digite o segundo número: ");
                    double n2_sub = scanner.nextDouble();
                    System.out.println("Resultado da Subtração: " + (n1_sub - n2_sub));
                    break;
                case 3:
                    System.out.println("Saindo do sistema... Até logo!");
                    break;
                default:
                    System.out.println("Opção inválida! Selecione uma opção válida do menu.");
            }
        } while (opcao != 3);
        
        scanner.close();
    }


	}


