package if_2;

public class if_exemplo2 {

	public static void main(String[] args) {
		double nota = 6.0;
		
		if ( nota >= 7 ) {
			
			System.out.println("aluno aprovado!!");
			
		} else if(nota>= 5) {
			
			System.out.println("aluno em recuperação!!");
		
			
		}else if(nota>= 0) {
			
			System.out.println("pagar 50 pila");
			
		}else {
		
			
			System.out.println("aluno reprovado!!");
			
		}

	}

}
