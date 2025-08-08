package ListaExercicios.Repeticao;

import java.util.Scanner;

public class Ex054 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double soma = 0, media;
        int i, contador = 0, contadorMenos50 = 0, contadorMais190 = 0;
        for (i = 1; i <= 7; i++) {
            System.out.printf("\nPessoa: %d", i);
            System.out.print("\nDigiete o seu peso: ");
            double peso = entrada.nextDouble();
            System.out.print("Ditite sua altura: ");
            double altura = entrada.nextDouble();
            soma += altura;

            if (peso > 90)
                contador++;

            if (peso < 50 && altura < 1.60)
                contadorMenos50++;

            if (altura > 1.90 && peso > 100)
                contadorMais190++;
        }

        media = soma / i;

        System.out.printf("\nQual foi a média da altura do grupo? %.2f", media);
        System.out.printf("\nQuantas pessoas pesam mais de 90Kg?  %d", contador);
        System.out.printf("\nQuentas pessoas pesam menos de 50Kg e tem menos de 1.60m? %d", contadorMenos50);
        System.out.printf("\nQuantas pessoas que medem mais de 1.90m pesam mais de 100Kg? %d", contadorMais190);

        entrada.close();
    }
}
