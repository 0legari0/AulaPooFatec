package Package5;

import java.util.Scanner;

public class Exercício06 {

	public static void main(String[] args) {
		
		int numero = lerNumero();
        exibirTabuada(numero);
    }

    public static int lerNumero() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Quer ver a tabuada de qual número? ");
        return sc.nextInt();
    }

    public static void mostrarLinha(int numero, int multiplicador) {
        System.out.println(numero + " x " + multiplicador + " = " + (numero * multiplicador));
    }

    public static void exibirTabuada(int numero) {
        System.out.println("--- Tabuada do " + numero + " ---");
        for (int i = 1; i <= 10; i++) {
            mostrarLinha(numero, i);
        }
    }

		

	}


