package if_2;

import java.util.Scanner;

public class exemplo_1 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int numero = entrada.nextInt();

        if (numero > 0) {
            System.out.println("numero positivo");
        } else {
            System.out.println("numero negativo");
        }

        entrada.close();
    }
}

