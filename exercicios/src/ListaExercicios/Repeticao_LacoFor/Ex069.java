package ListaExercicios.Repeticao_LacoFor;

import java.util.Scanner;

public class Ex069 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int termo, pa, razao, soma = 0;
        System.out.print("Progressão aritmética");
        System.out.print("\nDigite o primeiro termo: ");
        termo = leitor.nextInt();
        System.out.print("\nDigite a razão: ");
        razao = leitor.nextInt();

        for (int i = termo; i <= 10; i++) {
            pa = termo + (i - 1) * razao;
            soma += pa;
            System.out.printf("%d, ", pa);
        }

        System.out.printf("\nSoma do PA = " + soma);
        leitor.close();
    }
}
