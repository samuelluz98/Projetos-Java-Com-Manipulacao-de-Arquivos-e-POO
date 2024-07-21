package dobackaofront;

import java.util.ArrayList;

public class Venda {

    Carrinho carrinho;

    public Venda(Carrinho carrinho){
        this.carrinho = carrinho;
    }

    public void precoTotal(){

        ArrayList<Produto> produtos = carrinho.getProdutos();
        Double total = 0.0;

        for (int i = 0; i < produtos.size(); i++){
            total += produtos.get(i).getPreco();
        }

        System.out.println("O valor total da compra é R$: " + total);
    }

}
