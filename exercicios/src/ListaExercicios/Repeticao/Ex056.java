package ListaExercicios.Repeticao;

import java.util.Scanner;

public class Ex056 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int soma = 0, num;

        do {

            System.out.print("Digite um número: ");
            num = entrada.nextInt();

            soma += num;

        } while (num != 1111);

        System.out.println(soma);

        entrada.close();
    }
}
