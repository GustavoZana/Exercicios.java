package if_2;

import java.util.Scanner;

public class exercicio_5 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite o seu numero: ");
		
		int numero = entrada.nextInt();
		 
		if(numero %3 == 0 && numero %5 == 0) {
			
			System.out.println("o numero é multiplo de 3 e 5");
		} else {
			System.out.println("O numero não é multiplo de 3 e 5");
		}
			

		entrada.close();
	}

	

}













































