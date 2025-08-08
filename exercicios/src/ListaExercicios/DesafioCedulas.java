package ListaExercicios;

import java.util.Scanner;

//Leia um valor inteiro. A seguir, calcule ○ menor número de notas possíveis
// (cédulas) no qual o valor pode ser decomposto. As notas consideradas são de 100,
//50, 20, 10, 5, 2 e 1. A seguir mostre o valor lido e a relação de notas necessárias.
//Entrada
//○ arquivo de entrada contém um valor inteiro N (0 < N < 1000000).
//Saída
//Imprima o valor lido e, em seguida, a quantidade mínima de notas de cada tipo
//necessárias, conforme o exemplo fornecido. Não esqueça de imprimir o fim de
//linha após cada linha, caso contrário seu programa apresentará a mensagem:
//        "Presentation Error".
public class DesafioCedulas {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int valor, i , soma = 0;
        int nota100 = 0, nota50 = 0, nota20 = 0, nota10 = 0, nota5 = 0, nota2 = 0, nota1 = 0;

        System.out.print("Digite um valor: ");
        valor = entrada.nextInt();

        for (i = 0; soma < valor; i++) {
            if (soma + 100 < valor) {
                do {
                    soma += 100;
                    nota100++;
                    if (soma == valor) {
                        break;
                    }
                } while (soma + 100 < valor);

            } else if (soma + 50 < valor) {
                do {
                    soma += 50;
                    nota50++;
                    if (soma == valor) {
                        break;
                    }
                } while (soma + 50 < valor);

            } else if (soma + 20 <= valor) {
                do {
                    soma += 20;
                    nota20++;
                    if (soma == valor) {
                        break;
                    }
                } while (soma + 20 <= valor);
            }else if (soma + 10 <= valor) {
                do {
                    soma += 10;
                    nota10++;
                    if (soma == valor) {
                        break;
                    }
                } while (soma + 10 <= valor);
            }else if (soma + 5 <= valor) {
                do {
                    soma += 5;
                    nota5++;
                    if (soma == valor) {
                        break;
                    }
                } while (soma + 5 <= valor);
            }else if (soma + 2 <= valor) {
                do {
                    soma += 2;
                    nota2++;
                    if (soma == valor) {
                        break;
                    }
                } while (soma + 2 <= valor);
            }else if (soma + 1 <= valor) {
                do {
                    soma += 1;
                    nota1++;
                    if (soma == valor) {
                        break;
                    }
                } while (soma + 1 <= valor);
            }else break;
        }
        System.out.println("Quantidade de repetições: " + i);
        System.out.println("Valor à ser decomposto, com o menor número de notas possível: " + soma);
        System.out.printf("\n%d nota(s) de R$ 100.00\n", nota100);
        System.out.printf("%d nota(s) de R$ 50.00\n", nota50);
        System.out.printf("%d nota(s) de R$ 20.00\n", nota20);
        System.out.printf("%d nota(s) de R$ 10.00\n", nota10);
        System.out.printf("%d nota(s) de R$ 5.00\n", nota5);
        System.out.printf("%d nota(s) de R$ 2.00\n", nota2);
        System.out.printf("%d nota(s) de R$ 1.00\n", nota1);

        entrada.close();
    }
}
