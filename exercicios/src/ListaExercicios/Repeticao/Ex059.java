package ListaExercicios.Repeticao;

import java.util.Scanner;

public class Ex059 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        int idade, contador = 0, soma = 0, media, maior = 0;

        int maiorIdadeM = 0, menorIdadeM = 0;

        String sexo, escolha;

        do {
            System.out.print("Digite seu sexo (M ou F): ");
            sexo = leitor.next();

            System.out.print("Digite sua idade: ");
            idade = leitor.nextInt();

            if(idade > maior) maior = idade;

            if (sexo.equalsIgnoreCase("M")) {
                contador++;
                soma += idade;

            } else if (sexo.equalsIgnoreCase("F")) {
                if(idade > maiorIdadeM) {
                    maiorIdadeM = idade;

                } else {
                    menorIdadeM = idade;

                }
            }

            System.out.print("Continuar (S) ou (N)? ");
            escolha = leitor.next();

        } while (!escolha.equalsIgnoreCase("N"));

        media = soma / contador;

        System.out.printf("Qual é a maior idade lida? %d anos\n", maior);
        System.out.printf("Quantos homens foram cadastrados? %d homens\n", contador);
        System.out.printf("Qual é a idade da mulher mais jovem? %d anos\n", menorIdadeM);
        System.out.printf("Qual é a média de idade entre os homens? %d anos\n", media);

        leitor.close();
    }
}
