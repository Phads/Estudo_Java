package classe.ExemploProduto;
// aplicar desconto para todos os produtos
// desconto padrão 25%
public class Produto {
    String nome;
    double preco;
    static double desconto = 0.25;

    Produto () {

    }

    Produto (String nomeInicial, double precoInicial) {
        nome = nomeInicial;
        preco = precoInicial;
    }


    double precoComDesconto(){
        return preco -= preco * desconto;
    }

    double precoComDesconto(double descontoGerente){
        return preco -= preco * (desconto + descontoGerente);
    }

}
