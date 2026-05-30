package if_2;

import java.util.Scanner;

public class exercicio_4 {

	public static void main(String[] args) {
		
	Scanner entrada = new Scanner(System.in);
	
	System.out.println("digite uum numero: ");
	
	int numero = entrada.nextInt();
	
	if (numero >=10 && numero <=100) {
	
	System.out.println("esse numero está dentro do 10 a 100");
		
	} else {
		System.out.println("o numero esta fora do intervalo");
	}
	
  }
}
