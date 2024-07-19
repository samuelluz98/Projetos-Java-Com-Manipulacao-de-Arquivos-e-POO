package dobackaofront;

import dobackaofront.controller.BancoDeDados;
import dobackaofront.model.Item;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        System.out.println("Sistema de Almoxarifado");

        BancoDeDados banco = new BancoDeDados();

        ArrayList<Item> itens = banco.getItens();

        for (int i = 0; i < itens.size(); i++){

            System.out.println("Nome do item: " + itens.get(i).getNome());
            System.out.println("Código: " + itens.get(i).getCodigo());

        }

    }
}