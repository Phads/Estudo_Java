package Restaurante;

public class Pessoa {
    String nomePessoa;
    double pesoPessoa;

    Pessoa (String nomePessoa, double pesoPessoa) {
        this.nomePessoa = nomePessoa;
        this.pesoPessoa = pesoPessoa;
    }

    void ComerComida(Comida comida) {
        if (comida != null){
            this.pesoPessoa += comida.pesoComida;
        }
    }

    String apresentar() {
        return "Olá eu sou o " + nomePessoa + " e tenho " + pesoPessoa + " Kgs.";
    }

}
