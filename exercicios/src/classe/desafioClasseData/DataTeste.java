package classe.desafioClasseData;

public class DataTeste {
    public static void main(String[] args) {

        Data d1 = new Data();
        d1.dia = 19;
        d1.mes = "Maio";
        d1.ano = 2002;

        Data d2 = new Data();
        d2.dia = 15;
        d2.mes = "Julho";
        d2.ano = 2002;

        Data d3 = new Data(23, "Fevereiro", 1975);

        Data d4 = new Data();

        System.out.println(d1.obterDataFormatada());
        System.out.println(d2.obterDataFormatada());
        System.out.println(d3.obterDataFormatada());
        System.out.println(d4.obterDataFormatada());

    }
}
