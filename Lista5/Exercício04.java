package Package5;

import java.util.Scanner;
public class Exercício04 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		double n1 = lerNota(sc, 1);
        double n2 = lerNota(sc, 2);
        double n3 = lerNota(sc, 3);
        
        double media = calcularMedia(n1, n2, n3);
        String situacao = verificarSituacao(media); 
        mostrarResultado(media, situacao);
    }
    public static double lerNota(Scanner scanner, int ordem) {
        System.out.print("Digite a nota " + ordem + ": ");
        return scanner.nextDouble();
    }
    public static double calcularMedia(double a, double b, double c) {
        return (a + b + c) / 3.0;
    }
    public static String verificarSituacao(double media) {
        if (media >= 7.0) {
            return "Aprovado";
        } else if (media >= 5.0) {
            return "Recuperação";
        } else {
            return "Reprovado";
        }
    }
    public static void mostrarResultado(double media, String situacao) {
        System.out.printf("Média final: %.2f\n", media);
        System.out.println("Situação do aluno: " + situacao);
    }

		
		

	}


