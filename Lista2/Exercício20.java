package Package2;

import java.util.Scanner;

public class Exercício20 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Digite o seu salário: R$ ");
		double salario = sc.nextDouble();
		double imposto = 0;

		if (salario <= 2000) {
		    System.out.println("Isento");
		} else if (salario > 2000 && salario <= 5000) {
		    imposto = salario * 0.10;
		    System.out.println("Valor do imposto (10%): R$ " + imposto);
		} else {
		    imposto = salario * 0.20;
		    System.out.println("Valor do imposto (20%): R$ " + imposto);
		}

	}

}
