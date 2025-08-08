package ListaExercicios.Repeticao_LacoFor;

import java.util.Scanner;

public class Ex063 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        int i, num, soma = 0, media, contador = 0, valoresPares = 0, maiorValor = Integer.MAX_VALUE, menorValor = 0;
        String escolha;



        for (i = 0; i != -1; i++) {
            System.out.print("Digite vários números: ");
            num = leitor.nextInt();
            leitor.nextLine();

            System.out.print("Quer continuar (S ou N)? ");
            escolha = leitor.nextLine();

            contador++;

            soma += num;

            if (num % 2 == 0) valoresPares++;

            if (num < maiorValor)  menorValor = num;

            if (!escolha.equalsIgnoreCase("S")) break;
        }
        media = soma / contador;

        System.out.println("a) O somatório entre todos os valores " + soma);
        System.out.println("b) Qual foi o menor valor digitado " + menorValor);
        System.out.println("c) A média entre todos os valores " + media);
        System.out.println("d) Quantos valores são pares " + valoresPares);

        leitor.close();
    }
}
