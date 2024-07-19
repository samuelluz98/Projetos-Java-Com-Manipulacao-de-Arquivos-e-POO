package dobackaofront.controller;

import dobackaofront.model.Item;

import java.io.*;
import java.util.ArrayList;

public class BancoDeDados {

    private ArrayList <String> linhas;
    private ArrayList <Item> itens;

    public BancoDeDados(){

        linhas = new ArrayList<>();
        ler();
        itens = new ArrayList<>();
        transformarLinhasEmObjetos(linhas);

    }

    public void cadastrar(Item item) {

        String linha = "";

        try {

            OutputStream os = new FileOutputStream("produtos.txt", true);
            OutputStreamWriter osw = new OutputStreamWriter(os);
            BufferedWriter bw = new BufferedWriter(osw);

            linha = item.getNome() + ", " + item.getCodigo();
            bw.write(linha);
            bw.newLine();

            bw.close();
            osw.close();
            os.close();

            System.out.println(linha + " foi cadastrada com sucesso!");
            System.out.println("O arquivo de cadastro foi fechado!");

            atualizar();

        } catch (Exception e){

            System.out.println("Não foi possivel gravar a informação no arquivo de texto.");
            System.out.println(e);

        }

    }

    public void ler(){

        String linha = "";

        try {

            InputStream is = new FileInputStream("produtos.txt");
            InputStreamReader isr = new InputStreamReader(is);
            BufferedReader br = new BufferedReader(isr);

            linha = br.readLine();

            while (linha != null){

                System.out.println(linha);
                linhas.add(linha);
                linha = br.readLine();

            }

            br.close();
            isr.close();
            is.close();

            System.out.println("O arquivo de texto foi lido com sucesso!");

        }catch (Exception e){

            System.out.println("Não foi possível ler o arquivo de texto");
            System.out.println(e);

        }
    }

    public void transformarLinhasEmObjetos(ArrayList <String> linhas){

        String[]  auxiliar = new String[2];
        Item item;

        for (int i = 0; i < linhas.size(); i++){

            auxiliar = linhas.get(i).split(",");
            item = new Item(auxiliar[0], Integer.parseInt(auxiliar[1]));
            itens.add(item);

        }

        System.out.println("Os dados foram transformados em objetos!");

    }

    public ArrayList<Item> getItens(){
        return itens;
    }

    public void atualizar(){

        ler();
        transformarLinhasEmObjetos(linhas);

        System.out.println("Dados atualizados com sucesso!");

    }

}
