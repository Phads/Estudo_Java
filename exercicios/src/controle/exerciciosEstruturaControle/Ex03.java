package controle.exerciciosEstruturaControle;

import java.util.Scanner;

//Criar um programa que receba um número e diga se ele é um número primo.
public class Ex03 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite um número: ");
        int num = entrada.nextInt();

        if (num % num == 0) {
            System.out.printf("%d é primo", num);
        } else {
            System.out.printf("%d não é primo", num);
        }


        entrada.close();
    }
}
