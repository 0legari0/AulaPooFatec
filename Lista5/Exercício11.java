package Package5;

import java.util.Scanner;
import java.util.Random;

public class Exercício11 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
        int numeroSecreto = sortearNumero();
        boolean acertou = false;

        System.out.println("Tente adivinhar o número entre 1 e 50!");
        while (!acertou) {
            int palpite = lerPalpite(scanner);
            acertou = verificarAcerto(palpite, numeroSecreto);
            if (!acertou) {
                mostrarDica(palpite, numeroSecreto);
            }
        }
        mostrarVitoria();
    }
    public static int sortearNumero() {
        return new Random().nextInt(50) + 1;
    }
    public static int lerPalpite(Scanner scanner) {
        System.out.print("Seu palpite: ");
        return scanner.nextInt();
    }
    public static boolean verificarAcerto(int palpite, int numeroSecreto) {
        return palpite == numeroSecreto;
    }
    public static void mostrarDica(int palpite, int numeroSecreto) {
        if (palpite < numeroSecreto) {
            System.out.println("Muito baixo! Tente um número maior.");
        } else {
            System.out.println("Muito alto! Tente um número menor.");
        }
    }
    public static void mostrarVitoria() {
        System.out.println("Parabéns! Você acertou o número!");
    }
		
	}


