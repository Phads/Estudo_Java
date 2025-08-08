package ListaExercicios.Repeticao;

import java.util.Scanner;

public class Ex053 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String sexo;
        int idade, idadeMais20 = 0, qntdH = 0, qntdM = 0, soma = 0, media, mediaH;

        for (int i = 0; i < 5; i++) {
            System.out.print("Digite seu sexo (Homem ou Mulher): ");
            sexo = entrada.next();

            System.out.print("Digite sua idade:  ");
            idade = entrada.nextInt();

            if (sexo.equalsIgnoreCase("Homem")){
                //conta quatidade de homens
                qntdH++;
            } else if (sexo.equalsIgnoreCase("Mulher")) {
                qntdM++;
                if (idade > 20){
                    idadeMais20++;
                }
            } else {
                System.out.println("Sexo INVÁLIDO");
            }
            // soma recebe a soma de todas as idades
            soma += idade;
        }
        media = soma / (qntdH + qntdM);
        mediaH = soma / qntdH;

        System.out.println("Quantos homens foram cadastrados? " + qntdH);
        System.out.println("Quantas mulheres foram acastradas? " + qntdM);
        System.out.println("A média de idade do grupo: " + media);
        System.out.println("A média de idade dos homens: " + mediaH);
        System.out.println("Quantas mulheres tem mais de 20 anos? " + idadeMais20);
        entrada.close();
    }
}
