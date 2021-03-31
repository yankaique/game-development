package poo;

public class Main extends Player {

	private String nome = "Yan";
	public static final int vidaMaxima = 100;
	
	// Método construtor
	public Main(int n1, int n2) {
		super(n1, n2);
		System.out.println(this.nome);
	}
	
	public String getName() {
		return nome;
	}
	
	public static void main(String[] args) {
		Main m = new Main(100, 200);
		System.out.println(m.getName());
		System.out.println(Main.vidaMaxima);
	}
	
}
