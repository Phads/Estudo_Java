package ListaExercicios.Arrays;

import java.util.Arrays;

public class Ex073 {
    public static void main(String[] args) {
        int[] vetor = new int[10];
        int numero = 10;

        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = --numero;
        }
        System.out.println(Arrays.toString(vetor));
    }
}
