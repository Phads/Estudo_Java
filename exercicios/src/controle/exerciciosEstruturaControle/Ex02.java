package controle.exerciciosEstruturaControle;

import java.util.Scanner;

public class Ex02 {
    public static void main(String[] args) {
        //Criar um programa informa se o ano atual é um ano bissexto;
        
        Scanner entrada = new Scanner(System.in);
        int ano = entrada.nextInt();
        if (ano % 4 == 0 && ano % 100 != 0) {
            System.out.printf("%d é bissexto", ano);
        } else if (ano % 4 != 0 && ano % 400 == 0) {
            System.out.printf("%d é bissexto", ano);
        } else if (ano % 4 != 0 && ano % 400 != 0 ) {
            System.out.printf("%d não é bissexto", ano);
        } else{
            System.out.println("Valor invalido");
        }
        entrada.close();
    }
}
