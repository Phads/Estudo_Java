package ListaExercicios.Arrays;

import java.util.Scanner;

public class Ex082 {
    public static void main(String[] args) {
        /*82) Faça um algoritmo que leia a nota de 10 alunos de
     uma turma e guarde-as em um vetor. No final, mostre:
    a) Qual é a média da turma
    b) Quantos alunos estão acima da média da turma
    c) Qual foi a maior nota digitada
    d) Em que posições a maior nota aparece
    */
        Scanner leitor = new Scanner(System.in);

        int somarNotas = 0, media = 0, contador = 0, maiorNota = 0, posicao = 0;

        int[] vetor = new int[10];

        for (int i = 0; i < vetor.length; i++) {

            System.out.print("Digite sua nota: ");
            int notas = leitor.nextInt();
            vetor[i] = notas;

            somarNotas += notas;

            media = somarNotas / vetor.length;

            if (vetor[i] >= 7) contador++;

            if (maiorNota < vetor[i]) {

                maiorNota = vetor[i];
                posicao = i;
            }

        }

        System.out.println("a) Qual é a média da turma: " + media);
        System.out.println("b) Quantos alunos estão acima da média da turma: " + contador);
        System.out.println("c) Qual foi a maior nota digitada: " + maiorNota);
        System.out.println("d) Em que posições a maior nota aparece: " + posicao);
        leitor.close();
    }
}
