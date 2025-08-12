package classe.ExemploAreaCirc;

public class AreaCirc {
    static double pi = 3.14;
    double raio;

    AreaCirc (double raioIncial) {
        raio = raioIncial;
    }

    double area () {
        return pi * Math.pow(raio, 2);
    }
}
