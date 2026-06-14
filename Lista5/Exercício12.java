package Package5;

import java.util.Scanner;
import java.util.Random;

public class Exercício12 {

	public static void main(String[] args) {	
Scanner scanner = new Scanner(System.in);
        
        mostrarMenu();
        int jogador = jogadaJogador(scanner);
        int computador = jogadaComputador();
        
        String resultado = verificarVencedor(jogador, computador);
        mostrarResultado(jogador, computador, resultado);
    }
    public static void mostrarMenu() {
        System.out.println("--- JOKENPÔ ---");
        System.out.println("1. Pedra\n2. Papel\n3. Tesoura");
    }
    public static int jogadaJogador(Scanner scanner) {
        System.out.print("Escolha sua jogada (1-3): ");
        return scanner.nextInt();
    }
    public static int jogadaComputador() {
        return new Random().nextInt(3) + 1;
    }
    public static String verificarVencedor(int jogador, int computador) {
        if (jogador == computador) return "Empate";
        
        if ((jogador == 1 && computador == 3) || 
            (jogador == 2 && computador == 1) || 
            (jogador == 3 && computador == 2)) {
            return "Jogador";
        }
        return "Computador";
    }
    public static void mostrarResultado(int j, int c, String vencedor) {
        String[] opcoes = {"", "Pedra", "Papel", "Tesoura"};
        System.out.println("Você escolheu: " + opcoes[j]);
        System.out.println("Computador escolheu: " + opcoes[c]);
        if (vencedor.equals("Empate")) {
            System.out.println("Resultado: Deu Empate!");
        } else {
            System.out.println("Resultado: O " + vencedor + " venceu!");
        }
    }
	}


