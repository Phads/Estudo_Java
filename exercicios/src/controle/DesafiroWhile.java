package controle;

import java.util.Scanner;

public class DesafiroWhile {
    public static void main(String[] args) {
        /*
        calcular média de notas de uma turma
        user vai digitar uma nota válida de 0 a 10
        armazenar essa nota em uma variavel chamada total
        total armazena todas as notas e soma
        contar quantas notas válidas foram digitadas
        mostrar total, quatidade de notas digitadas e a média no final
        sair do loop, digitar -1
        digitar nota invalidada, pede para digitar dnv
        */
        Scanner entrada = new Scanner(System.in);
        double media = 0, total = 0, nota;
        int contador = 0;

        do {

            System.out.print("Digite sua nota: ");
            nota = entrada.nextDouble();
            if (nota >= 0 && nota <= 10){

                total += nota;
                contador++;
                media = total / contador;

            }else if (nota == -1) {
                System.out.println("Saindo... Mostrando resultado:");
                System.out.println("Total de nota(s) digita(s): " + contador);
                System.out.printf(total + " / " + contador + " = %.2f", media);

            } else {

                System.out.println("NOTA INVALIDA! Digite novamente.");
            }

            } while (nota != -1);













        entrada.close();
    }
}
