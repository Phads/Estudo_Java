package ListaExercicios.Arrays;

import java.util.Arrays;
import java.util.Random;

public class Ex076 {
    public static void main(String[] args) {
        Random random = new Random();

        int[] vetor = new int[7];

        for (int i = 0; i < vetor.length; i++) {

            int numero = random.nextInt(100);
            vetor[i] = numero;
        }

        System.out.println(Arrays.toString(vetor));

    }
}
