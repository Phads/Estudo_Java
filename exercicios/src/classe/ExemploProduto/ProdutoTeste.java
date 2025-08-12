package classe.ExemploProduto;

public class ProdutoTeste {
    public static void main(String[] args) {

        Produto p1 = new Produto("Notebook", 4000.00);

        var p2 = new Produto();
        p2.nome = "Caneta Preta";
        p2.preco = 100;

        Produto.desconto = 0.50;

        System.out.println(p1.nome);
        System.out.println(p2.nome);
        System.out.println(p2.preco);

        double precoFinal1 = p1.precoComDesconto();
        double precoFinal3 = p2.precoComDesconto();
        double precoFinal2 = p2.precoComDesconto(0.1);
        double mediaCarrinho = (precoFinal1 + precoFinal2) / 2;

        System.out.printf("Média do carrinho = R$%.2f.", mediaCarrinho);
        System.out.printf("\n%.2f", precoFinal3);
        System.out.printf("\n%.2f", precoFinal1);

    }
}

