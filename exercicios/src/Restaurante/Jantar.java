package Restaurante;

import java.util.Scanner;

public class Jantar {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        Pessoa pessoa1 = new Pessoa("Pedro", 110.4);

        Comida comida1 = new Comida("Coxinha", 0.223);
        Comida comida2 = new Comida("Bolo ", 0.348);

        System.out.println(pessoa1.apresentar());
        pessoa1.ComerComida(comida1);

        System.out.println(pessoa1.apresentar());
        pessoa1.ComerComida(comida2);

        System.out.println(pessoa1.apresentar());

        leitor.close();
    }
}
