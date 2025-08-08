package ListaExercicios;

import java.util.Scanner;

public class Ex034 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite seu peso: ");
        double peso = entrada.nextDouble();
        System.out.print("\nDigite sua altura: ");
        double altura = entrada.nextDouble();

        double imc = peso / (altura * altura);

        if (imc <= 18.5) {
            System.out.println("Abaixo do peso.");
        } else if (imc >= 18.5 && imc < 25) {
            System.out.println("Peso ideal.");
        } else if (imc > 25 && imc < 30) {
            System.out.println("Sobrepeso.");
        } else if (imc > 30 && imc < 40) {
            System.out.println("Obesidade.");
        } else {
            System.out.println("Obesidade Mórbida.");
        }

        entrada.close();
    }
}
