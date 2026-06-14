package Package2;

import java.util.Scanner;

public class Exercício14 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Lado A: ");
		double a = sc.nextDouble();
		System.out.print("Lado B: ");
		double b = sc.nextDouble();
		System.out.print("Lado C: ");
		double c = sc.nextDouble();

		
		if ((a + b > c) && (a + c > b) && (b + c > a)) {
		    if (a == b && b == c) {
		        System.out.println("Equilátero");
		    } else if (a == b || a == c || b == c) {
		        System.out.println("Isósceles");
		    } else {
		        System.out.println("Escaleno");
		    }
		} else {
		    System.out.println("Os lados informados não formam um triângulo.");
		}
		

	}

}
