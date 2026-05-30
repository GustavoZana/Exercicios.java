package if_2;

import java.util.Scanner;

public class exercicio_8 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner("System.in");
		System.out.println("Digite a primeira nota: ");
		
		double nota1 = entrada.nextDouble();
		System.out.println("digite a segunda nota: ");
		
		double nota2 = entrada.nextDouble();
			
		double media = (nota1 + nota2) / 2;
			
		if ( media >=7) {
				
				System.out.println("Aprovado com media");
				
		}else if (media >=5 ) {
				
			System.out.println("recuperação com media" + media);
		}
		entrada.close();	
	}		
	
			
}		
		