package if_2;

import java.util.Scanner;

public class exercicio_2 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("digite o numero: ");
		
		int numero = entrada.nextInt();
		
		if (numero % 2 == 0 ) {
			
			System.out.println("Numero par");
			
		} else {
			System.out.print("numero é impar");
		}
	}

}
