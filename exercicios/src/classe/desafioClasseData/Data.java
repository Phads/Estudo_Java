package classe.desafioClasseData;

public class Data {
    int dia;
    String mes;
    int ano;

    Data () {
        //dia = 01;
        //mes = "Janeiro";
        //ano = 1975;
        this(1, "Janeiro", 1970);
    }

    Data (int dia, String mes, int ano) {
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
    }

   String obterDataFormatada () {
        final String formato = " %d / %s / %d ";
        return String.format(formato, dia, mes, ano);
    }

    void imprimirDataFormatada() {
        System.out.println(obterDataFormatada());
    }
}
