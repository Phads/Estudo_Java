package ListaExercicios.Arrays;

import java.util.Arrays;

public class Ex075 {
    public static void main(String[] args) {
        int[] vetor = new int[16];

        int n1 = 0, n2 = 1, f;

        for (int i = 0; i < vetor.length; i++) {
            f = n1 + n2;
            n1 = n2;
            n2 = f;

            vetor[i] = n1;
        }
        System.out.println(Arrays.toString(vetor));
    }
}
