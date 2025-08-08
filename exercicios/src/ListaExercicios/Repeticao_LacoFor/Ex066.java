package ListaExercicios.Repeticao_LacoFor;

import java.util.Scanner;

public class Ex066 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int numero, multiplicacao;

        System.out.print("Taboada! \nDigite um número para calcular a taboada: ");
        numero = leitor.nextInt();

        for (int i = 0; i <= 10; i++) {
            multiplicacao = numero * i;
            System.out.println(numero + " x " + i + " = " + multiplicacao);
        }

        leitor.close();
    }
}
