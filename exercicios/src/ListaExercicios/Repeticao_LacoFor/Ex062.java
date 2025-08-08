package ListaExercicios.Repeticao_LacoFor;

import java.util.Scanner;

public class Ex062 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        int idade, media, i, soma = 0, contador = 0, contadorIdadeMais21 = 0;
        String escolha;

        for (i = 1; i != 0; i++) {
            System.out.print("Digite sua idade: ");
            idade = leitor.nextInt();
            contador++;
            System.out.print("Continuar (s ou n): ");
            escolha = leitor.next();

            soma += idade;

            if (idade > 21) contadorIdadeMais21++;

            if (!escolha.equalsIgnoreCase("S")) break;
        }

        media = soma / contador;

        System.out.println("a) Quantas idades foram digitadas? " + contador);
        System.out.println("b) Qual é a média entre as idades digitadas? " + media);
        System.out.println("c) Quantas pessoas tem 21 anos ou mais? " + contadorIdadeMais21);

        leitor.close();
    }
}
