package ListaExercicios.Repeticao;

import java.util.Scanner;

public class Ex060 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        String nome,
                sexo, escolha,
                pessoaMaisVelha = "",
                mulherMaisNova = "";

        int idade,
                maiorIdade = 0,
                menorIdade = Integer.MAX_VALUE,
                contador = 0,
                soma = 0, media,
                homensMaior30 = 0,
                mulherMenor18 = 0;

        do {
            System.out.print("\nDigite seu nome: ");
            nome = leitor.nextLine();

            System.out.print("Digite seu sexo (M ou F): ");
            sexo = leitor.nextLine();
            leitor.nextLine();

            System.out.print("Digite sua idade: ");
            idade = leitor.nextInt();
            leitor.nextLine();

            System.out.print("\nContinuar (s ou n)? ");
            escolha = leitor.next();
            leitor.nextLine();

            soma += idade;
            contador++;

            if (idade > maiorIdade) {
                maiorIdade = idade;
                pessoaMaisVelha = nome;
            }

            if (sexo.equalsIgnoreCase("f")) {
                if (idade < menorIdade) {
                    mulherMaisNova = nome;
                }
            }

            if (sexo.equalsIgnoreCase("M") && idade > 30) homensMaior30++;
            if (sexo.equalsIgnoreCase("F") && idade < 18) mulherMenor18++;

        }
        while (!escolha.equalsIgnoreCase("n"));

        media = soma / contador;
        System.out.printf("\na) O nome da pessoa mais velha? %s\n", pessoaMaisVelha);
        System.out.printf("b) O nome da mulher mais jovem? %s\n", mulherMaisNova);
        System.out.printf("c) A média de idade do grupo? %d\n", media);
        System.out.printf("d) Quantos homens tem mais de 30 anos? %d\n", homensMaior30);
        System.out.printf("e) Quantas mulheres tem menos de 18 anos? %d\n", mulherMenor18);

        leitor.close();
    }
}
