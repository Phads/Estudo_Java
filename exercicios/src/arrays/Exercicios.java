package arrays;

import java.util.Arrays;

public class Exercicios {
    public static void main(String[] args) {

        double[] notasAlunoA = new double[3];
        notasAlunoA[0] = 7.9;
        notasAlunoA[1] = 8;
        notasAlunoA[2] = 6.7;

        System.out.println(Arrays.toString(notasAlunoA));
        System.out.println(notasAlunoA[0]);
        System.out.println(notasAlunoA[2]);
        System.out.println(notasAlunoA[notasAlunoA.length - 1]);

        double tatalAlunoA = 0;

        for (int i = 0; i < notasAlunoA.length; i++) {
            tatalAlunoA += notasAlunoA[i];
        }

        System.out.println(tatalAlunoA / notasAlunoA.length);

        final double notaArmazenadaB = 5.55;

        double[] notasAlunoB = { 6.9, 8.9, 5.5, notaArmazenadaB, 10}; //outra forma de instanciar um array

        double totalAlunosB = 0;

        for (int i = 0; i < notasAlunoA.length; i++) {
            totalAlunosB += notasAlunoB[i];
        }

        System.out.println(Arrays.toString(notasAlunoB));
        System.out.println(totalAlunosB / notasAlunoA.length);
        System.out.println();
    }
}
