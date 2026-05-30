package if_2;

import java.util.Scanner;

public class exercicio_7 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("digite um ano: ");
		
	 int ano = entrada.nextInt();
	 
	 if ((ano % 4 == 0 && ano % 100 != 0) || ano % 400 == 0 ){
		 
		 System.out.println("Possivel ano bissexto."); 
		 
	 }else {
	  
		  System.out.println("O ano não é bissexto.");
	  }
	  
	  
	 entrada.close();
	}
     
}
