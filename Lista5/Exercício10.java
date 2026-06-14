package Package5;

import java.util.Scanner;
public class Exercício10 {

	public static void main(String[] args) {
		
Scanner scanner = new Scanner(System.in);
        
        String usuario = lerUsuario(scanner);
        String senha = lerSenha(scanner);
        
        boolean sucesso = validarLogin(usuario, senha);
        mostrarResultado(sucesso);
    }
    public static String lerUsuario(Scanner scanner) {
        System.out.print("Usuário: ");
        return scanner.nextLine();
    }
    public static String lerSenha(Scanner scanner) {
        System.out.print("Senha: ");
        return scanner.nextLine();
    }
   public static boolean validarLogin(String usuario, String senha) {
        return usuario.equals("admin") && senha.equals("1234");
    }
    public static void mostrarResultado(boolean sucesso) {
        if (sucesso) {
            System.out.println("Login efetuado com sucesso! Bem-vindo.");
        } else {
            System.out.println("Acesso negado. Usuário ou senha incorretos.");
        }
    }

	}


