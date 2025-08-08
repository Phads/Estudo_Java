package controle.exerciciosEstruturaControle;

import java.util.Scanner;

public class Ex01 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite um número de 0 a 10: ");
        int numero = entrada.nextInt();

        if (numero >= 0 && numero <= 10) {
            if (numero % 2 == 0) {
                System.out.println("Numero é par");
            } else {
                System.out.println("Numero é impar");
            }
        }

        entrada.close();

    }
}
