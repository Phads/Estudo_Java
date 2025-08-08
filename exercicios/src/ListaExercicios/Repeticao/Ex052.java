package ListaExercicios.Repeticao;

import java.util.Scanner;

public class Ex052 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int soma = 0,  media, mais18anos = 0, menos5anos = 0,  i = 0;
        for (i = 0 ; i < 10; i++) {
            System.out.println("Digite sua idade: ");
            int idade = entrada.nextInt();

            soma += idade;

            if (idade > 18)
                mais18anos++;

            if (idade < 5)
                menos5anos++;
        }
        media = soma / i;

        System.out.println(soma);
        System.out.println(media);
        System.out.println(mais18anos);
        System.out.println(menos5anos);
        entrada.close();
    }
}
