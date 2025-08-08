package ListaExercicios;

import java.util.Scanner;

public class Ex037 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        double salario, aumento, qntdaAnos;

        System.out.println("Digite o valor do sue salário atual: ");
        salario = entrada.nextDouble();

        System.out.println("Digite a quantidade de anos trabalhados: ");
        qntdaAnos = entrada.nextDouble();

        System.out.print("Digite o seu gênero (Homem ou Mulher): ");
        String sexo = entrada.next();

        if (sexo.equalsIgnoreCase("Mulher")) {
            if (qntdaAnos < 15) {
                aumento = salario * 0.05;
                salario += aumento;
                System.out.println("Seu novo salário: " + salario);
            } else if (qntdaAnos >= 15 && qntdaAnos <= 20) {
                aumento = salario * 0.12;
                salario += aumento;
                System.out.println("Seu novo salário: " + salario);
            } else {
                aumento = salario * 0.23;
                salario += aumento;
                System.out.println("Seu novo salário: " + salario);
            }
        } else if (sexo.equalsIgnoreCase("Homem")) {
            if (qntdaAnos < 15) {
                aumento = salario * 0.03;
                salario += aumento;
                System.out.println("Seu novo salário: " + salario);
            } else if (qntdaAnos >= 15 && qntdaAnos <= 20) {
                aumento = salario * 0.13;
                salario += aumento;
                System.out.println("Seu novo salário: " + salario);
            } else {
                aumento = salario * 0.25;
                salario += aumento;
                System.out.println("Seu novo salário: " + salario);
            }
        }

        entrada.close();
    }
}
