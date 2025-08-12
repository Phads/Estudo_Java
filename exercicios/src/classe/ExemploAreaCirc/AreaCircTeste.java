package classe.ExemploAreaCirc;

public class AreaCircTeste {
    public static void main(String[] args) {
        AreaCirc a = new AreaCirc(5);
        System.out.println(a.area());

        AreaCirc a1 = new AreaCirc(10);
        AreaCirc.pi = 3.1415;
        System.out.println(a1.area());
    }
}
