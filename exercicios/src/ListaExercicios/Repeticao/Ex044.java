package ListaExercicios.Repeticao;

import java.util.Scanner;

public class Ex044 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite o primeiro valor: ");
        int valor1 = entrada.nextInt();

        System.out.println("Digite o segundo valor: ");
        int valor2 = entrada.nextInt();

        System.out.println("Digite o incremento: ");
        int incremento = entrada.nextInt();

        for (int i = valor1; i <= valor2; i += incremento) {
            System.out.println(i);
        }
        System.out.println("Acabou!");

        entrada.close();
    }
}
