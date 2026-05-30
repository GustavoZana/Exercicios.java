package if_2;

import java.util.Scanner;

public class exercicio_6 {

	public static void main(String[] args) {
		Scanner  entrada = new Scanner(System.in);
	 
		System.out.println("Digite um numero inteiro: ");
		
		int numero = entrada.nextInt();
		
		if (numero > 0 ) {
		System.out.println("esse numero é positivo");
		
			
		} else if (numero < 0) {
		
		System.out.println("esse numero é menor que zero");

	} else {
		System.out.println("O numero é zero.");
	}
		
      entrada.close();
}
}