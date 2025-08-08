package ListaExercicios.Repeticao;

import java.util.Scanner;

public class Ex051 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        double preco, guardarMaior = 0, guardarMenor = 0;
        for (int i = 1; i <= 8; i++) {
            System.out.print("Digite o preço do produto: ");
            preco = entrada.nextDouble();

            if (preco > guardarMaior){
                guardarMaior = preco;
            }
            if (preco < guardarMaior){
                if (guardarMenor <= guardarMenor){
                    guardarMenor = preco;
                }
            }
        }
        System.out.println("Maior preço digitado: "+ guardarMaior);
        System.out.println("Menor preço digitado: "+ guardarMenor);
        entrada.close();
    }
}
