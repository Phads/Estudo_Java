package ListaExercicios.Repeticao;

public class Ex043 {
    public static void main(String[] args) {
        for (int i = 30; i >= 1 ; i--) {
            if (i % 4 == 0) {
                System.out.printf("[%d]\n", i);
            }else {
                System.out.printf("%d\n", i);
            }
        }
        System.out.println("Acabou!");
    }
}
