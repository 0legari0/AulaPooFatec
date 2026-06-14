package Package5;

public class Exercício13 {
	
	private static int vida;
    private static String nome;

	public static void main(String[] args) {
		criarPersonagem("Aragorn", 100);
        mostrarStatus();
        
        atacar();
        receberDano(30);
        mostrarStatus();
        
        curar(15);
        mostrarStatus();
    }
    public static void criarPersonagem(String nomePersonagem, int vidaInicial) {
        nome = nomePersonagem;
        vida = vidaInicial;
        System.out.println(nome + " entrou no mundo!");
    }
    public static void mostrarStatus() {
        System.out.println("[Status] " + nome + " | Vida: " + vida);
    }
    public static void atacar() {
        System.out.println(nome + " desfere um ataque com sua espada!");
    }
    public static void receberDano(int dano) {
        vida -= dano;
        System.out.println(nome + " recebeu " + dano + " de dano!");
        if (vida <= 0) {
            vida = 0;
            System.out.println(nome + " caiu em batalha!");
        }
    }
    public static void curar(int cura) {
        vida += cura;
        System.out.println(nome + " foi curado em " + cura + " pontos de vida!");
    }
	}


