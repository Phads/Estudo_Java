package ListaExercicios.Repeticao;

import java.util.Scanner;

public class Ex057 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        double somaSalarioH = 0, somaSalarioM = 0;
        String escolha;

        do {

            System.out.print("Digite o seu salário: ");
            double salario = entrada.nextDouble();
            System.out.print("Digite o seu sexo(homem ou mulher): ");
            String sexo = entrada.next();

            if (sexo.equalsIgnoreCase("homem")) {
                somaSalarioH += salario;
            }else {
                somaSalarioM += salario;
            }

            System.out.println("Continuar? S ou N");
            escolha = entrada.next();

        }while (!escolha.equalsIgnoreCase("N"));

        System.out.println(somaSalarioH);
        System.out.println(somaSalarioM);
        entrada.close();
    }
}
