package classe;

public class Produto {
    String nome;
    double preco;
    double desconto;

    double precoComDesconto(){
        return preco -= preco * desconto;
    }

    double precoComDesconto(double descontoGerente){
        return preco -= preco * (desconto + descontoGerente);
    }

}
