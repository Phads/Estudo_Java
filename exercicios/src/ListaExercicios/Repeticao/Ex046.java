package ListaExercicios.Repeticao;

public class Ex046 {
    public static void main(String[] args) {
        int soma = 0;
        for (int i = 6; i <= 100; i += 2){
            soma += i;
            System.out.println(i);
        }
        System.out.printf("%d : Acabou!", soma);

    }
}
