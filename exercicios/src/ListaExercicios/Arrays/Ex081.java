package ListaExercicios.Arrays;

import java.util.ArrayList;
import java.util.Scanner;

public class Ex081 {
    /*Crie um programa que leia a idade de 8 pessoas e guarde-as em um vetor. No final, mostre:
    a) Qual é a média de idade das pessoas cadastradas
    b) Em quais posições temos pessoas com mais de 25 anos
    c) Qual foi a maior idade digitada (podem haver repetições)
    d) Em que posições digitamos a maior idade */

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        int idade, maiorIdade = 0, posicaoMaiorIdade = 0, media, somaidades = 0;

        int[] vetor = new int[8];

        ArrayList<Integer> guardarPosicao = new ArrayList<>();

        for (int i = 0; i < vetor.length; i++) {
            System.out.print("Digite sua idade: ");
            idade = leitor.nextInt();
            somaidades += idade;
            vetor[i] = idade;
        }

        media = somaidades / vetor.length;

        for (int j = 0; j < vetor.length; j++) {
            if (vetor[j] > 25) guardarPosicao.add(j);

            if (maiorIdade < vetor[j]) {
                maiorIdade = vetor[j];
                posicaoMaiorIdade = j;
            }
        }

        System.out.println("a) Qual é a média de idade das pessoas cadastradas: " + media);
        System.out.println("b) Em quais posições temos pessoas com mais de 25 anos: " + guardarPosicao);
        System.out.println("c) Qual foi a maior idade digitada (podem haver repetições): " + maiorIdade);
        System.out.println("d) Em que posições digitamos a maior idade: " + posicaoMaiorIdade);

        leitor.close();
    }

}
