package if_2;

import java.util.Scanner;

public class exercicio_9 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite apenas uma letra");

		char letra = entrada.next().toLowerCase().charAt(0);
		
		if (letra == 'a'|| letra == 'e' || letra == 'o' || letra == 'u') {
		
		System.out.println("é uma vogal");
		
	
		}else {
	}
		
		System.out.println("é uma consoante");
		
	}
		
		
}
		
		