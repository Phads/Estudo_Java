package controle;

import java.util.Scanner;

public class DoWhile {
    public static void main(String[] args) {
        //estruturas de repeticao e suas estruturas
        //if(...) sentenca; ou {}
        //while(...) sentenca; ou {}
        //for(...; ...; ...;) sentenca; ou {}

        //do sentenca; ou {}
        Scanner entrada = new Scanner(System.in);
        String texto = "";

        do {
            System.out.println("Você precisa falar as palavras mágicas...");
            System.out.print("Você quer sair? ");
            texto = entrada.nextLine();
        }while(!texto.equalsIgnoreCase("Por favor"));

        System.out.println("Obrigado");

        entrada.close();
    }
}
