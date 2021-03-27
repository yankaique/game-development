package aula;

public class Main {
	public static void main(String[] args) {
		/*
			int idade = 24;
			System.out.println("Minha idade é: "+ idade);
			System.out.println("Hello World");
		*/
		
		// Tipos de váriaveis
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
		
		// Array único
		/*
		 * String[] nome = new String[5];
			nome[0] = "Yan";
			nome[1] = "João";
			System.out.println(nome[0]);
		 * 
		 */
		
		
		//Array Multidimensional
		/* 
		 * String[][] sobrenome = new String[5][5];
			sobrenome[0][0] = "Roger";
			System.out.println(sobrenome[0][0]);
		*/
		
		// Condições
		/*
		 *	int vida = 100;
			
			if(vida>100) {
				System.out.println("Vida Extra");
			}else if(vida == 100) {
				System.out.println("Vida cheia");
			}else {
				System.out.println("Vida baixa");
			}
		 */
		
		// Switch Case
		/*
			int vida = 100;
			switch(vida) {
				case 90:
					System.out.println("Vida baixa");
				break;
				case 80:
					System.out.println("Vida muito baixa");
					break;
				default:
					System.out.println("Vida cheia");
			}
		*/
		
		int vida_1 = 100;
		int vida_2 = 200;
		int vida_3 = 300;
		int vidaFinal =  vida_1 +  vida_2 + vida_3;
		System.out.println(vidaFinal);
		
		if(vida_1 < vidaFinal && vida_3 > vida_2) {
			System.out.println("Você morreu");
		}else if(vida_1 < vidaFinal || vida_3 > vida_2) {
			System.out.println("Você está vivão");
		}
		
	}
}
