package aula;

public class Main {
	public static void main(String[] args) {
		/*
			int idade = 24;
			System.out.println("Minha idade �: "+ idade);
			System.out.println("Hello World");
		*/
		
		// Tipos de v�riaveis
		/*
			int numero = 24;
			String nome = "Yan";
			boolean depende = true;
			char umCaractere = 'a';
			double pontoFlutuante = 2.3;
			
			System.out.println(numero);
			System.out.println(nome);
			System.out.println(depende);
			System.out.println(umCaractere);
			System.out.println(pontoFlutuante);
		*/
		
		// Constantes
		/*
			 * final int vidaMaxia = 100;
				System.out.println(vidaMaxia);
			 * 
		 */
		
		// Array �nico
		String[] nome = new String[5];
		nome[0] = "Yan";
		nome[1] = "Jo�o";
		System.out.println(nome[0]);
		
		//Array Multidimensional
		String[][] sobrenome = new String[5][5];
		sobrenome[0][0] = "Roger";
		System.out.println(sobrenome[0][0]);
		
		
	}
}
