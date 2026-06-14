package Package5;

import java.util.Scanner;

public class Exercício09 {
	private static double saldo = 0.0;

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
        int opcao;
        do {
            mostrarMenu();
            System.out.print("Opção: ");
            opcao = sc.nextInt();
            switch (opcao) {
                case 1 -> depositar(sc);
                case 2 -> sacar(sc);
                case 3 -> consultarSaldo();
                case 4 -> System.out.println("Saindo...");
                default -> System.out.println("Opção inválida.");
            }
        } while (opcao != 4);
    }
    public static void mostrarMenu() {
        System.out.println("\n1.Depositar | 2.Sacar | 3.Saldo | 4.Sair");
    }
    public static void depositar(Scanner sc) {
        System.out.print("Valor do depósito: R$ ");
        saldo += sc.nextDouble();
        System.out.println("Depósito realizado com sucesso!");
    }
    public static void sacar(Scanner sc) {
        System.out.print("Valor do saque: R$ ");
        double valor = sc.nextDouble();
        if (valor <= saldo) {
            saldo -= valor;
            System.out.println("Saque realizado com sucesso!");
        } else {
            System.out.println("Saldo insuficiente.");
        }
    }
    public static void consultarSaldo() {
        System.out.println("Saldo atual: R$ " + saldo);
    }
	}


