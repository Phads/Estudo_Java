package ListaExercicios.Repeticao;

import java.util.Scanner;

public class Ex058 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int contador = 0;
        double idade, media, soma = 0;

        do {

            System.out.print("Digite sua idade: ");
            idade = entrada.nextDouble();
            contador++;

            soma += idade;

            media = (idade - 999) / contador;

        } while (idade != 999);

        System.out.printf("Quantidade de alunos: %d\n", contador);
        System.out.printf("Media da idade dos alunos: %.2f", media);

        entrada.close();
    }
}
