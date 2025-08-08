package ListaExercicios.Repeticao_LacoFor;

import java.util.Scanner;

public class Ex068 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int qntdMulheres = 0, qntdHomens100Kg = 0;
        double peso, media, soma = 0, maiorPesoHomens = 0;
        String sexo;

        for (int i = 0; i < 8; i++) {
            System.out.print("Digite seu peso: ");
            peso = leitor.nextDouble();
            System.out.print("Digite seu sexo (M ou F): ");
            sexo = leitor.nextLine();
            leitor.nextLine();

            if (sexo.equalsIgnoreCase("F")) {
                qntdMulheres++;
                soma += peso;
            } else if (sexo.equalsIgnoreCase("M") && peso > 100) {
                qntdHomens100Kg++;
                if (peso > maiorPesoHomens) maiorPesoHomens = peso;
            }
        }
        media = soma / qntdMulheres;

        System.out.println("Quantas mulheres foram cadastradas? " + qntdMulheres);
        System.out.println("Quantos homens pesam mais de 100Kg? " + qntdHomens100Kg);
        System.out.println("A média de peso entre mulheres: " +  media);
        System.out.println("Maior peso entre os homens: " + maiorPesoHomens);
        leitor.close();
    }
}
