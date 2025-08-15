package ListaExercicios.Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Ex077 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        String[] vetor = new String[7];

        for (int i = 6; i >= 0; i--){
            System.out.print("Digite o nome de uma pessoa: ");
            String nome = leitor.nextLine();
            vetor[i] = nome;
        }

        System.out.println(Arrays.toString(vetor));

        leitor.close();
    }
}
