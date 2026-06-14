package Package2;

import java.util.Scanner;

public class Exercício15 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Peso (kg): ");
		double peso = sc.nextDouble();
		System.out.print("Altura (m): ");
		double altura = sc.nextDouble();

		double imc = peso / (altura * altura);
		System.out.printf("Seu IMC é: %.2f\n", imc);

		if (imc < 18.5) {
		    System.out.println("Abaixo do peso");
		} else if (imc >= 18.5 && imc <= 24.9) {
		    System.out.println("Normal");
		} else if (imc >= 25 && imc <= 29.9) {
		    System.out.println("Sobrepeso");
		} else {
		    System.out.println("Obesidade");
		}
		

	}

}
