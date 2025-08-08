package ListaExercicios.Repeticao;

import java.util.Random;
import java.util.Scanner;

public class Ex055Desafio {

    public static void main(String[] args) {
        Random random = new Random();
        Scanner entrada = new Scanner(System.in);

        int numeroJogador, numeroSorteado, i;

        numeroSorteado = random.nextInt(10);

        System.out.println("JOGO: ADIVINHE O NÚMERO SORTEADO");
        System.out.println("Regras: Você tem 4 tentavivas para acertar\no número," +
                "inteiro de 0 a 10, sorteado pelo computador.");
        System.out.println(numeroSorteado);

        for (i = 1; i <= 4; i++) {
            System.out.print("\n\nDigite o número: ");
            numeroJogador = entrada.nextInt();

            if (numeroJogador != numeroSorteado) {
                System.out.printf("Tentativa %d: Errou", i);
                if (i == 4) {
                    System.out.print("\n\nVOCÊ PERDEU, MAQUINAS NO PORDER, HUMANO BURRO!!!!!!! XD");
                    System.out.printf("\n\nO número era: %d", numeroSorteado);
                }
            } else {
                System.out.printf("\nTentativa %d: Acertou!!! HUMANOS NO PODER, HUMANO INTELIGENTE!!! :(", i);
                System.out.printf("\n\nO número era: %d", numeroSorteado);
                break;
            }


        }

        entrada.close();
    }

}

