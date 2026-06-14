package Package5;

import java.util.Scanner;

public class Exercício15 {
	
	private static String jogador;
    private static int pontos = 0;

	public static void main(String[] args) {
		
Scanner sc = new Scanner(System.in);
        
        iniciarJogo();
        mostrarMenu();
        criarJogador(sc);
        executarTurno(sc, "O que a sigla 'JDK' gerencia? (Java/Python)", "Java");
        executarTurno(sc, "O main deve ser gigante? (sim/nao)", "nao");
        verificarVitoria();
        encerrarJogo();
    }
    public static void iniciarJogo() {
        System.out.println("--- JOGO INICIADO ---");
    }
    public static void mostrarMenu() {
        System.out.println("Regra: Acerte as perguntas para pontuar.");
    }
    public static void criarJogador(Scanner sc) {
        System.out.print("Nome do Player: ");
        jogador = sc.nextLine();
    }
    public static void executarTurno(Scanner sc, String pergunta, String respostaCorreta) {
        System.out.println("\n" + pergunta);
        System.out.print("Sua resposta: ");
        if (sc.nextLine().equalsIgnoreCase(respostaCorreta)) {
            System.out.println("Acertou!");
            pontos += 10;
        } else {
            System.out.println("Errou!");
        }
    }
    public static void verificarVitoria() {
        System.out.println("\nFim de jogo, " + jogador + "! Pontos: " + pontos);
        System.out.println(pontos >= 20 ? "Você Venceu!" : "Você Perdeu!");
    }
    public static void encerrarJogo() {
        System.out.println("--- SISTEMA FECHADO ---");
    }
	}


