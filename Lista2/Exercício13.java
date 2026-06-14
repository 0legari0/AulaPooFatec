package Package2;

import java.util.Scanner;

public class Exercício13 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Digite o ano: ");
		int ano = sc.nextInt();

		if ((ano % 4 == 0 && ano % 100 != 0) || (ano % 400 == 0)) {
		    System.out.println("O ano é Bissexto");
		} else {
		    System.out.println("Não é Bissexto");
		}

	}

}
