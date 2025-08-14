package arrays;

import java.util.Arrays;

public class ExForeach {
    public static void main(String[] args) {

        double[] notasAlunoA = new double[3];
        notasAlunoA[0] = 7.9;
        notasAlunoA[1] = 8;
        notasAlunoA[2] = 6.7;

        System.out.println(Arrays.toString(notasAlunoA));
        System.out.println(notasAlunoA[0]);
        System.out.println(notasAlunoA[2]);
        System.out.println(notasAlunoA[notasAlunoA.length - 1]);

        double somaA = 0;
        for (double totalAlunosA: notasAlunoA) {
            somaA += totalAlunosA;
        }

        System.out.println( somaA / notasAlunoA.length);


        final double notaArmazenadaB = 5.55;

        double[] notasAlunoB = { 6.9, 8.9, 5.5, notaArmazenadaB, 10}; //outra forma de instanciar um array

        double somaB = 0;
        for(double totalAlunosB: notasAlunoB) {
            somaB += totalAlunosB;
        }

        System.out.println(Arrays.toString(notasAlunoB));
        System.out.println(somaB / notasAlunoB.length);
        System.out.println();
    }
}
