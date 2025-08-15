package ListaExercicios.Repeticao_LacoFor;

public class Ex070Desafio {
    public static void main(String[] args) {
        //Sequencia de fibonacci
        int n1 = 0, n2 = 1, s;

        for (int i = 0; i < 10; i++) {
            System.out.println(n1 + " ");
            s = n1 + n2;
            n1 = n2;
            n2 = s;
        }
    }
}
