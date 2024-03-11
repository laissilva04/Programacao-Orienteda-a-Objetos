package Loja;
import java.util.List;

import java.util.ArrayList;

public class Loja {
    public List<Produto> produtos;

    // Construtor para inicializar a lista de produtos
    public Loja() {
        this.produtos = new ArrayList<>();
    }

    // Método para adicionar produto à lista
    public void adicionarProduto(Produto p) {
        produtos.add(p);
    }
    //mostrar media
    public void mostrarMedia() {
        double somaPeso = 0;
        if (!produtos.isEmpty()) {
            for (Produto p : produtos) {
                somaPeso += p.getPeso();
            }
            double media = somaPeso / produtos.size();
            System.out.printf("A media dos pesos dos produtos e: %.2f%n", media);
        } else {
            System.out.println("Nao ha produtos para calcular a media.");
        }
    }
    //metodo capturar mais leve
    public void capturamaisleve(Produto produto){
        Produto maisleve = produtos.get(0);
        for(int i = 0; i < tamanhoLista(); i++){
            if(produto.getPeso() < maisleve.getPeso()){
                maisleve = produto;
            }
        }
        System.out.println("Produto mais leve é: " );
        maisleve.mostrar();
    }
    //metodo capturar maior valor
    public void capturamaiorvalor() {
        if (produtos.isEmpty()) {
            System.out.println("Não há produtos na lista.");
            return;
        }

        Produto maiorvalor = produtos.get(0);
        for (Produto produto : produtos) {
            if (produto.getValor() > maiorvalor.getValor()) {
                maiorvalor = produto;
            }
        }
        System.out.println("Produto mais caro: " );
        maiorvalor.mostrar();
    }
    public int tamanhoLista(){
        return produtos.size();

    }
    //metodo calcular media dos valores cujo peso é maior que 10
    public void calcularvalor(Produto produto) {
        double somaValores = 0;
        int contador = 0;
        for (Produto p : produtos) {
            if (p.getPeso() > 10) {
                somaValores = somaValores + p.getValor();
                contador++;
            }
        }
        if (contador > 0) {
            double media = somaValores / contador;
            System.out.println("A media dos valores dos produtos com peso maior que 10 e: " + media);
        } else {
            System.out.println("Nao ha produtos com peso maior que 10 para calcular a media.");
        }
    }
}
