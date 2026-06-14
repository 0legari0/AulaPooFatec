package Package5;

import java.util.Scanner;
public class Exercício03 {

	public static void main(String[] args) {		
		int numero = lerNumero();
        boolean par = ehPar(numero);
        mostrarResultado(numero, par);
    }
    public static int lerNumero() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um número: ");
        return scanner.nextInt();
    }
    public static boolean ehPar(int numero) {
        return numero % 2 == 0;
    }
    public static void mostrarResultado(int numero, boolean par) {
        if (par) {
            System.out.println("O número " + numero + " é PAR.");
        } else {
            System.out.println("O número " + numero + " é ÍMPAR.");
        }
    }

		

	}


