package classe.desafioClasseData;

public class Data {
    int dia;
    String mes;
    int ano;

    Data () {
        dia = 01;
        mes = "Janeiro";
        ano = 1975;
    }

    Data (int diaInicial, String mesInicial, int anoIncial) {
        dia = diaInicial;
        mes = mesInicial;
        ano = anoIncial;
    }

   String obterDataFormatada () {
         return String.format(" %d / %s / %d ", dia, mes, ano);
    }
}
