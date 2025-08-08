package ListaExercicios.Repeticao;

import java.util.Scanner;

public class Ex049 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int num, par = 0, impar = 0;
        for (int i = 0; i < 6; i++) {
            System.out.print("Digite um número: ");
            num = entrada.nextInt();
            if (num % 2 == 0) {
                par++;
            } else {
                impar++;
            }
        }
        System.out.println("Pares = " + par + "\nImpares = " + impar);
        entrada.close();
    }
}
