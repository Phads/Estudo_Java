package controle;

public class For3 {
    public static void main(String[] args) {
        /* Quando o i é declarado dentro do escopo do laço for,
        ele n pode ser acessado do lado de fora */
//        for (int i = 0; i < 5; i++) {
//            System.out.println(i);
//        }
//        System.out.println("----------------------------------");
//        /* Quando o i é declarado fora do escopo do laço for,
//        ele pode ser acessado do lado de fora */
//        int j = 0;
//        for (; j < 5; j++) {
//            System.out.println(j);
//        }
//        System.out.printf("Saiu do for... %d",j);
//        //um for dentro do outro

        for (int i = 0; i < 10; i++){
            for (int j = 0; j < 10; j++){
                System.out.printf("[%d][%d]\n", i, j);
            }
        }
    }
}
