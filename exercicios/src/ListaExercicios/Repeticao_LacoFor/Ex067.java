package ListaExercicios.Repeticao_LacoFor;

import java.util.Scanner;

public class Ex067 {
    public static void main(String[] args) {
        int num;
        Scanner leitor = new Scanner(System.in);
        System.out.print("Digite um número: ");
        num = leitor.nextInt();

        for (int i = 0; i <= num; i++) {
            System.out.print(i + ", ");
        }
        System.out.print("Fim!");
        leitor.close();
    }
}
