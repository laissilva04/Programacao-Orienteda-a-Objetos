package Loja;

public class Main {
    //psvm metodo main
    public static void main(String[] args)throws Exception{

        Produto produto1 = new Produto ("mouse", 4, 48);
        Produto produto2 = new Produto("teclado", 12, 700);
        Produto produto3 = new Produto("tela", 11, 400);

        Loja l1 = new Loja();
        l1.adicionarProduto(produto1);
        l1.adicionarProduto(produto2);
        l1.adicionarProduto(produto3);

        l1.mostrarMedia();
        l1.capturamaisleve(produto1);
        l1.calcularvalor(produto1);
        l1.capturamaiorvalor();
        produto1.valorMenor();
        produto1.calculadora();
        produto1.mostrar();

    }
}
