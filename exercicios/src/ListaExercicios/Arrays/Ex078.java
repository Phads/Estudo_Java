package ListaExercicios.Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Ex078 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        int[] vetor = new int[15];

        int numero;

        for (int i = 0; i < vetor.length; i++) {
            numero = leitor.nextInt();
            vetor[i] = numero;
        }
        System.out.println(Arrays.toString(vetor));

        System.out.print("Posições que o número é multiplo de 10: ");

        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] % 10 == 0) {
                System.out.print(i + " ");
            }
        }

        leitor.close();
    }
}
