package ListaExercicios.Repeticao;

import java.util.Scanner;

public class Ex042 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int num = entrada.nextInt();

        for (int i = 0; i <= num; i++) {
            System.out.printf("%d ", i);
        }
        System.out.print("Acabou!");
        entrada.close();
    }
}
