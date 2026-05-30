package if_2;

import java.util.Scanner;

public class if_exemplo3 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
				
		System.out.println("Digite a nota do aluno: ");
		
		double nota = entrada.nextDouble();
		
		if(nota>= 7 ) {
			
			System.out.println("Aluno aprovado");
			
		}
		else if (nota >=5) {
			
			System.out.println("Aluno em recuperação");
						
		}
		
		else {
			
			System.out.println("Aluno reprovado");
		}
		entrada.close();

	}

}
