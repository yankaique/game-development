package poo;

public class Main {
	
	private static int soma(int n1, int n2) {
		return n1+n2;
	}
	
	private static String nome(String n1) {
		String frase = "Olá querido "+n1;
		return frase;
	}
	
	public static void main(String[] args) {
		Player2 player2 = new Player2();
		player2.outroMetodo();
		System.out.println(soma(10,20));
		System.out.println(nome("Yan"));
	}
	
}
