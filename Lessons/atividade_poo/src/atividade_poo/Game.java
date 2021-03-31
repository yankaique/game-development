package atividade_poo;

public class Game {
	
	private Player player;
	private Enemy enemy;
	
	public Game() {
		player = new Player();
		enemy = new Enemy();
	}
	
	public Player getPlayer() {
		return player;
	}
	
	public Enemy getEnemy() {
		return enemy;
	}
	
	public static void main(String[] args) {
		Game game = new Game();
		Player player =  game.getPlayer();
		player.attackEnemy(game.getEnemy());
		System.out.println(game.getEnemy().life);
	}
}
