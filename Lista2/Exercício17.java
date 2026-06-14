package Package2;

import java.util.Scanner;

public class Exercício17 {

	public static void main(String[] args) {
	   
		Scanner sc = new Scanner(System.in);
		int tentativas = 3;
		boolean logado = false;

		while (tentativas > 0) {
		    System.out.print("Usuário: ");
		    String usuario = sc.nextLine();
		    System.out.print("Senha: ");
		    String senha = sc.nextLine();

		    if (usuario.equals("admin") && senha.equals("1234")) {
		        System.out.println("Acesso permitido!");
		        logado = true;
		        break;
		    } else {
		        tentativas--;
		        if (tentativas > 0) {
		            System.out.println("Dados incorretos. Você tem mais " + tentativas + " tentativa(s).");
		        }
		    }
		}

		if (!logado) {
		    System.out.println("Conta bloqueada!");
		}

	}

}
