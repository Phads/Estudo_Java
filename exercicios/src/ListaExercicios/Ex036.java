package ListaExercicios;

import java.util.Scanner;

public class Ex036 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        double horaAtvd, pontos = 0, valorTotal;

        System.out.println("Sistema de troca de pontos por atividade física.");

        System.out.println("Digite a quantidade de horas no mês: ");
        horaAtvd = entrada.nextDouble();

        if (horaAtvd <= 10) {
            pontos = horaAtvd * 2;
        } else if (horaAtvd >= 10 && horaAtvd <= 20) {
            pontos = horaAtvd * 5;
        } else if (horaAtvd > 20) {
            pontos = horaAtvd * 10;
        } else {
            System.out.println("Valor invalido!!!");
        }

        valorTotal = pontos * 0.05;

        System.out.println("Quantidades de horas: " + horaAtvd);
        System.out.println("Quantidades de pontos: " + pontos);
        System.out.println("Valor total a ser recebido: " + valorTotal);

        entrada.close();
    }
}
