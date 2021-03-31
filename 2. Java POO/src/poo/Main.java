package poo;

public class Main {

	private String nome = "Yan";
	public static final int vidaMaxima = 100;
	
	// Método construtor
	public Main() {
		System.out.println(this.nome);
	}
	
	public String getName() {
		return nome;
	}
	
	public static void main(String[] args) {
		Main m = new Main();
		System.out.println(m.getName());
		System.out.println(Main.vidaMaxima);
	}
	
}
