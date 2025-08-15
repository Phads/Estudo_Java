package ListaExercicios.Arrays;

import java.util.Arrays;

public class Ex072 {
    public static void main(String[] args) {
        int[] vetor = new int[9];
        int numero = 0;

        for (int i = 0; i < vetor.length; i++) {
            numero += 5;
            vetor[i] = numero;
        }

        System.out.println(Arrays.toString(vetor));
    }
}
