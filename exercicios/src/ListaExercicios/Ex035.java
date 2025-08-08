package ListaExercicios;

import java.util.Scanner;

public class Ex035 {
    public static void main(String[] args) {
        double carroPopular = 90.0, carroLuxo = 150.0, valorTotal = 0, qntdDias, qntdKm;
        String carro;

        Scanner entrada = new Scanner(System.in);
        System.out.print("\nDigite qual tipo de carro, popular ou luxo?: ");
        carro = entrada.nextLine();

        System.out.print("\nQuantos dias ficou com o carro?: ");
        qntdDias = entrada.nextDouble();

        System.out.print("\nQuantos KMs rodou com o carro?: ");
        qntdKm = entrada.nextDouble();

        if (carro.equalsIgnoreCase("popular")) {
            if (qntdKm < 100) {
                valorTotal = (qntdKm * 0.20) + (qntdDias * carroPopular);
            } else {
                valorTotal = (qntdKm * 0.10) + (qntdDias * carroPopular);
            }
        } else if (carro.equalsIgnoreCase("luxo")) {
            if (qntdKm <= 200) {
                valorTotal = (qntdKm * 0.30) + (qntdDias * carroLuxo);
            } else {
                valorTotal = (qntdKm * 0.25) + (qntdDias * carroLuxo);
            }
        }
        System.out.printf("Tipo do carro: %s \nQuantidade de dias: %.2f \nQuantidade de quilometros(KM): %.2f \nValor Total a pagar: %.2f", carro, qntdDias, qntdKm, valorTotal);

        entrada.close();
    }
}
