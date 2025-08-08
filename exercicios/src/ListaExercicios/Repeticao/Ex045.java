package ListaExercicios.Repeticao;

import java.util.Scanner;

public class Ex045 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int valorMaior, valorMenor;
        System.out.println("Digite o primeiro valor: ");
        int valor1 = entrada.nextInt();

        System.out.println("Digite o segundo valor: ");
        int valor2 = entrada.nextInt();

        System.out.println("Digite o incremento: ");
        int incremento = entrada.nextInt();

        if (valor1 > valor2) {
            valorMaior = valor1;
            valorMenor = valor2;
            for (int i = valorMenor; i <= valorMaior; i += incremento) {
                System.out.println(i);
            }
        } else if (valor1 < valor2) {
            valorMaior = valor2;
            valorMenor = valor1;
            for (int i = valorMenor; i <= valorMaior; i += incremento) {
                System.out.println(i);
            }
        } else {

        }

        System.out.println("Acabou!");

        entrada.close();
    }
}
