package if_2;

import java.util.Scanner;

public class if_exemplo4 {

	public static void main(String[] args) {
		
        Scanner entrada = new Scanner(System.in);
        
        System.out.print("Digite sua idade:  ");
        
        int idade = entrada .nextInt();
        
        entrada.nextLine();
        
        System.out.print("voce é brasileiro ou naturalizado(sim/não):  ");
        
        String nacionalidade = entrada.nextLine().toLowerCase();
        
        if(idade >= 16 && nacionalidade.equals("sim") ) {
        	
        	System.out.println("Voce pode votar!!");
        	
       	
        }else {
        	
        	System.out.println("Voce NÃO pode votar!!");
        	
        }
		entrada.close();
	}

}
