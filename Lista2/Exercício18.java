package Package2;

import java.util.Scanner;

public class Exercício18 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		while (true) {
		    System.out.println("\n--- MENU ---");
		    System.out.println("1 - Somar");
		    System.out.println("2 - Subtrair");
		    System.out.println("3 - Sair");
		    System.out.print("Escolha uma opção: ");
		    int opcao = sc.nextInt();

		    if (opcao == 3) {
		        System.out.println("Saindo do programa...");
		        break;
		    }

		    if (opcao == 1 || opcao == 2) {
		        System.out.print("Digite o primeiro número: ");
		        int n1 = sc.nextInt();
		        System.out.print("Digite o segundo número: ");
		        int n2 = sc.nextInt();

		        switch (opcao) {
		            case 1:
		                System.out.println("Resultado da soma: " + (n1 + n2));
		                break;
		            case 2:
		                System.out.println("Resultado da subtração: " + (n1 - n2));
		                break;
		        }
		    } else {
		        System.out.println("Opção inválida! Tente novamente.");
		    }
		}

	}

}
