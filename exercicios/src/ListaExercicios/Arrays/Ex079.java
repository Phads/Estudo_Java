package ListaExercicios.Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Ex079 {
    public static void main(String[] args) {
        Scanner leito = new Scanner(System.in);

        int[] vetor = new int[3];

        int numero;

        for (int i = 0; i < vetor.length; i++) {
            numero = leito.nextInt();
            vetor[i] = numero;
        }

        System.out.println(Arrays.toString(vetor));

        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] % 2 == 0) {
                int par = vetor[i];
                
                System.out.println("Par: "+ par + " | posição: " + i);
            }
        }
        leito.close();
    }
}
