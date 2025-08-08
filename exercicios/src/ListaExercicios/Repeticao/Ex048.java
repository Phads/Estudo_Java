package ListaExercicios.Repeticao;

import java.util.Scanner;

public class Ex048 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int soma = 0;
        for (int i = 1; i <= 7; i++) {
            System.out.print("Digite um número inteiro: ");
            int num = entrada.nextInt();
            soma += num;
        }
        System.out.println("A soma dos sete números é = " + soma);
        entrada.close();
    }
}
