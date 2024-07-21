package dobackaofront;

public class Main {

    public static void main(String[] args) {

        System.out.println("Loja Java");

        Produto p1 = new Produto("Chaveiro", "Madeira", 2.25);
        Produto p2 = new Produto("Livro", "Livro de romance", 22.50);

        Carrinho carrinho = new Carrinho();
        carrinho.adicionarProdutosAoCarrinho(p1);
        carrinho.adicionarProdutosAoCarrinho(p2);

        carrinho.removerProdutosDoCarrinho("Chaveiro");

        Venda venda = new Venda(carrinho);
        venda.precoTotal();

    }
}