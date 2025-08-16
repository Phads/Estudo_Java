package ListaExercicios.Arrays;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Ex080 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        Random random = new Random();

        int[] vetor = new int[30];

        int contador = 0;

        for (int i = 0; i < vetor.length; i++) {
            int numerosAleatorios = random.nextInt(1, 15);
            vetor[i] = numerosAleatorios;
        }

        System.out.print("Digite um número de 1 a 15: ");
        int numeroChave = leitor.nextInt();

        for (int j = 0; j < vetor.length; j++) {
            if (vetor[j] == numeroChave) {
                contador++;
                System.out.println("Chave " + contador + ": Na posição: "+ j);
            }
        }

        System.out.println(Arrays.toString(vetor));

        leitor.close();
    }
}
