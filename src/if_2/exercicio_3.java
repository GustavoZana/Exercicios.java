package if_2;

import java.util.Scanner;

public class exercicio_3 {
	
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		System.out.print("digite o primeiro numero aqui: ");
		
		int numero1 = entrada.nextInt();
		
		System.out.print("digite o segundo numero: ");
		
		int numero2 = entrada.nextInt();
		
		if (numero1 > numero2) {
			
			System.out.println("o maior numero é:" + numero1);
			
		}
		
		
		else if(numero2 > numero1){
		System.out.println("o maioe numero é:" + numero2);

	
	

	} else {
		System.out.print("os dois numeros são iguais");
	}
		entrada.close();
	}
		
}
	

