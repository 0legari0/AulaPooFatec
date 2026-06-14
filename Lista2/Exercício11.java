package Package2;

import java.util.Scanner;

public class Exercício11 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Digite o primeiro número: ");
		double num1 = sc.nextDouble();
		System.out.print("Digite o segundo número: ");
		double num2 = sc.nextDouble();
		System.out.print("Operação (+, -, *, /): ");
		char operacao = sc.next().charAt(0);

		switch (operacao) {
		    case '+':
		        System.out.println("Resultado: " + (num1 + num2));
		        break;
		    case '-':
		        System.out.println("Resultado: " + (num1 - num2));
		        break;
		    case '*':
		        System.out.println("Resultado: " + (num1 * num2));
		        break;
		    case '/':
		        if (num2 != 0) {
		            System.out.println("Resultado: " + (num1 / num2));
		        } else {
		            System.out.println("Erro: Divisão por zero não permitida!");
		        }
		        break;
		    default:
		        System.out.println("Operação inválida.");
		}
		

	}

}
