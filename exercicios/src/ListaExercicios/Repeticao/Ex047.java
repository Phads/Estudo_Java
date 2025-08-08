package ListaExercicios.Repeticao;

public class Ex047 {
    public static void main(String[] args) {
        int soma = 0;
        for (int i = 500; i >= 0; i -= 50){
            soma += i;
            System.out.printf("%d", i);
            if(i == 0) break;
            System.out.print("+");
        }
        System.out.printf(" = %d Acabou!", soma);
    }
}
