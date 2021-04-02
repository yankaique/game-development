package atividade_poo;

public class Game {
	
	private Player player;
	private Enemy enemy;
	
	public Game() {
		player = new Player();
		TipoPlayer player2 = new TipoPlayer();
		if(player instanceof Player) {
			System.out.println("É uma instância de player");
		}
		
		if(player2 instanceof Player) {
			System.out.println("Tipo player é uma instância de player");
		}
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
