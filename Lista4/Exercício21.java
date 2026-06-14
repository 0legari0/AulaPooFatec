package Package4;

import java.util.Scanner;

public class Exercício21 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
        char[][] tabuleiro = {
            {'_', '_', '_'},
            {'_', '_', '_'},
            {'_', '_', '_'}
        };
        char jogadorAtual = 'X';
        boolean jogoAtivo = true;
        int jogadas = 0;

        while (jogoAtivo) {
            // Imprime tabuleiro
            System.out.println("\nTabuleiro atual:");
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    System.out.print(tabuleiro[i][j] + " ");
                }
                System.out.println();
            }

            System.out.println("\nJogador " + jogadorAtual + ", escolha sua posição.");
            System.out.print("Linha (0-2): ");
            int linha = scanner.nextInt();
            System.out.print("Coluna (0-2): ");
            int coluna = scanner.nextInt();

            if (linha < 0 || linha > 2 || coluna < 0 || coluna > 2 || tabuleiro[linha][coluna] != '_') {
                System.out.println("Movimento inválido! Tente novamente.");
                continue;
            }

            tabuleiro[linha][coluna] = jogadorAtual;
            jogadas++;

            // Validação de vitória (linhas, colunas e diagonais)
            boolean vitoria = false;
            for (int i = 0; i < 3; i++) {
                if (tabuleiro[i][0] == jogadorAtual && tabuleiro[i][1] == jogadorAtual && tabuleiro[i][2] == jogadorAtual) vitoria = true;
                if (tabuleiro[0][i] == jogadorAtual && tabuleiro[1][i] == jogadorAtual && tabuleiro[2][i] == jogadorAtual) vitoria = true;
            }
            if (tabuleiro[0][0] == jogadorAtual && tabuleiro[1][1] == jogadorAtual && tabuleiro[2][2] == jogadorAtual) vitoria = true;
            if (tabuleiro[0][2] == jogadorAtual && tabuleiro[1][1] == jogadorAtual && tabuleiro[2][0] == jogadorAtual) vitoria = true;

            if (vitoria) {
                System.out.println("\nParabéns! O jogador " + jogadorAtual + " venceu!");
                jogoAtivo = false;
            } else if (jogadas == 9) {
                System.out.println("\nDeu velha! O jogo empatou.");
                jogoAtivo = false;
            } else {
                jogadorAtual = (jogadorAtual == 'X') ? 'O' : 'X';
            }
        }
        scanner.close();
    }

		

	}


