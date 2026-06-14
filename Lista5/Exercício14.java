package Package5;

import java.util.Scanner;

public class Exercício14 {
	private static double saldo = 1000.0;

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
        boolean rodando = true;

        while (rodando) {
            mostrarMenu();
            System.out.print("Opção: ");
            switch (scanner.nextInt()) {
                case 1 -> depositar(scanner);
                case 2 -> sacar(scanner);
                case 3 -> consultarSaldo();
                case 4 -> rodando = !encerrarSistema();
                default -> System.out.println("Opção inválida.");
            }
        }
    }
    public static void mostrarMenu() {
        System.out.println("\n1.Depositar | 2.Sacar | 3.Saldo | 4.Sair");
    }
    public static void depositar(Scanner sc) {
        System.out.print("Valor do depósito: ");
        saldo += sc.nextDouble();
        System.out.println("Depósito realizado!");
    }
    public static void sacar(Scanner sc) {
        System.out.print("Valor do saque: ");
        double valor = sc.nextDouble();
        if (valor <= saldo) {
            saldo -= valor;
            System.out.println("Saque realizado!");
        } else {
            System.out.println("Saldo insuficiente.");
        }
    }
    public static void consultarSaldo() {
        System.out.println("Saldo atual: R$ " + saldo);
    }
    public static boolean encerrarSistema() {
        System.out.println("Sistema encerrado. Até logo!");
        return true;
    }
	
}
