package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class DesafioMediaNotasComArray {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.print("Quantas notas você quer informar? ");
        int quantidadeNotas = leitor.nextInt();

        double[] listaNotas = new double[quantidadeNotas];

        for (int i = 0; i < listaNotas.length; i++) {
            System.out.printf("Digite a nota %d: ",  i + 1);
            double notasInformadas = leitor.nextDouble();

            listaNotas[i] = notasInformadas;
        }

        System.out.println("Lista das notas: " + Arrays.toString(listaNotas));

        double somarNotas = 0;
        for (double notas: listaNotas) {
            somarNotas += notas;
        }

        double media = somarNotas / listaNotas.length;
        System.out.printf("Média das %d notas informadas pelo aluno: %.2f", listaNotas.length, media);

        leitor.close();
    }
}
