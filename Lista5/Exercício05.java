package Package5;

import java.util.Scanner;

public class Exercício05 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
        mostrarMenu();
        System.out.print("Escolha a opção: ");
        int opcao = scanner.nextInt();
        
        if (opcao >= 1 && opcao <= 4) {
            double num1 = lerNumero(scanner, "primeiro");
            double num2 = lerNumero(scanner, "segundo");
            
            switch (opcao) {
                case 1 -> System.out.println("Resultado: " + somar(num1, num2));
                case 2 -> System.out.println("Resultado: " + subtrair(num1, num2));
                case 3 -> System.out.println("Resultado: " + multiplicar(num1, num2));
                case 4 -> System.out.println("Resultado: " + dividir(num1, num2));
            }
        } else {
            System.out.println("Opção inválida ou saindo.");
        }
    }

    public static void mostrarMenu() {
        System.out.println("--- CALCULADORA ---");
        System.out.println("1. Somar\n2. Subtrair\n3. Multiplicar\n4. Dividir");
    }

    public static double lerNumero(Scanner scanner, String posicao) {
        System.out.print("Digite o " + posicao + " número: ");
        return scanner.nextDouble();
    }

    public static double somar(double a, double b) { return a + b; }
    public static double subtrair(double a, double b) { return a - b; }
    public static double multiplicar(double a, double b) { return a * b; }
    public static double dividir(double a, double b) {
        if (b == 0) {
            System.out.println("Erro: Divisão por zero!");
            return 0;
        }
        return a / b;
    }

		

	}


