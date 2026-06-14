package Package2;

import java.util.Scanner;

public class Exercício05 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Digite um número: ");
		int num = sc.nextInt();

		if (num >= 10 && num <= 50) {
		    System.out.println("Está entre 10 e 50 (inclusive)");
		} else {
		    System.out.println("Está fora desse intervalo");
		}

	}

}
