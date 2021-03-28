package poo;

public class Main {
	public static void main(String[] args) {
		Player player = new Player();
		
		player.IniciarJogador();
		
		Enemy enemy = new Enemy();
		enemy.IniciarInimigo();
		
		new Player().IniciarJogador();
	}
}
