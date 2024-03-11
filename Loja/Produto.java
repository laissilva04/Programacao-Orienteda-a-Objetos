package Loja;

public class Produto {
    private String nomeProduto;
    private double peso;
    private double valor;


    public Produto( String nomeProduto, double peso, double valor){
        this.nomeProduto = nomeProduto;
        this.peso = peso;
        this.valor = valor;
    }

    //getters

    public String getNomeProduto(){
        return nomeProduto;
    }
    public double getPeso(){
        return peso;
    }
    public double getValor(){
        return valor;
    }

    //setters
    public void setNomeProduto(String nomeProduto){
        this.nomeProduto = nomeProduto;
    }
    public void setPeso(double peso){
        this.peso = peso;
    }
    public void setValor(double valor){
        this.valor = valor;
    }

    //metodo mostrar
    public void mostrar(){
                System.out.println("Nome do produto: " + getNomeProduto());
                System.out.println("Peso do produto: " + getPeso() + "Kg");
                System.out.println("Valor do produto: R$ " + getValor());
        System.out.println("---------------------------------------------------------------");

    }

            //metodo peso maior que 10
            public void calculadora(){
            if (getPeso() >= 10){
                System.out.println("O Produto tem mais de 10Kg");
        }
    }
            //metodo valor menor que 50
            public void valorMenor(){
                    if (getValor() < 50){
                        System.out.println("O Produto custa menos que R$50");
                    }
                }
        }


