package poo;

public class Main extends TesteAbstract {
	
	public static void main(String[] args) {
		Player player = new Player();
		
		player.IniciarJogador();
		
		Enemy enemy = new Enemy();
		enemy.IniciarInimigo();
		
		new Player().IniciarJogador();
		
	}
	
	public void chamarMetodoAbstract() {
		iniciarJogo();
	}
	
	public void InstancheMain2() {
		new Main2().print1();
	}
	
	private class Main2 {
		
		public void print1() {
			System.out.println("Chamando método");
		}
		
	}
}
