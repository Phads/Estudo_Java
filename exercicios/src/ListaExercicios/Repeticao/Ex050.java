package ListaExercicios.Repeticao;

import java.util.Random;

public class Ex050 {
    public static void main(String[] args) {
        Random gerador = new Random();

        int maiorQue5 = 0, divisivelPor3 = 0;

        System.out.println("Números sorteados: ");

        for (int i = 1; i <= 20; i++) {
            int numeroAletorio = gerador.nextInt(10);
            System.out.printf("%d ", numeroAletorio);

            if (numeroAletorio > 5)
                maiorQue5++;

            if (numeroAletorio % 3 == 0 && numeroAletorio != 0)
                divisivelPor3++;
        }
        System.out.println("\nQuantos números estão acima de 5? " + maiorQue5);
        System.out.println("Quantos números esão são divisíveis por 3? " + divisivelPor3);
    }
}
