package dobackaofront;

import java.util.ArrayList;

public class Carrinho {

    ArrayList<Produto> produtos;

    public Carrinho(){
        this.produtos = new ArrayList<>();
    }

    public void adicionarProdutosAoCarrinho(Produto produto){
        produtos.add(produto);
        System.out.println(produto.getNome() + " adicionado com sucesso ao carrinho!");
    }

    public void removerProdutosDoCarrinho(String nome){
        int codigo = -1;

        for (int i = 0; i < produtos.size(); i++){

            if (produtos.get(i).getNome().equals(nome)){

                codigo = i;
                produtos.remove(codigo);
                break;

            } else {
                continue;
            }

        }

        if (codigo == -1){
            System.out.println("O produto não foi encontrado!");
        } else {
            System.out.println("O produto " + nome + " foi removido do seu carrinho!");
        }

    }

    public ArrayList<Produto> getProdutos(){
        return produtos;
    }

}
