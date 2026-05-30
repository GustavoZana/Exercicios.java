package if_2;

import java.util.Scanner;

public class if_exemplo5 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Digite sua idade: ");
		
		int idade = entrada.nextInt();
		
		entrada.nextLine();
		
		
		System.out.println("Voce é estudande? (sim/não): ");
		
		String estudante = entrada.nextLine().toLowerCase();
		
		if(idade < 18 || estudante.equals("sim")) {
			System.out.println("Voce tem direito a meia entrada");
			
	    
			
		}else {
			
			System.out.println("Voce NÃO tem direito a meia entrada");
				
		}
		
		entrada.close();
		
		
	}

}
