package ListaExercicios.Arrays;

import java.util.Arrays;

public class Ex071 {
    public static void main(String[] args) {
        int[] vetor = new int[8];

        for (int i = 0; i < 8; i++) {
            vetor[i] = 999;
        }
        System.out.print(Arrays.toString(vetor));
    }
}
