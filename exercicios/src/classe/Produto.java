package classe;

public class Produto {
    String nome;
    double preco;
    double desconto;

    Produto () {

    }

    Produto (String nomeInicial, double precoInicial, double descontoInicial) {
        nome = nomeInicial;
        preco = precoInicial;
        desconto = descontoInicial;
    }


    double precoComDesconto(){
        return preco -= preco * desconto;
    }

    double precoComDesconto(double descontoGerente){
        return preco -= preco * (desconto + descontoGerente);
    }

}
