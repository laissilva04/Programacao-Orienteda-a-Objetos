package Pessoa;

public class Pessoa {
    //Atributos
    public String nome;
    public int anodenascimento;
    public double peso;
    public double altura;

         
        //Metodo construtor
        public Pessoa(String nome, int anodenascimento, double peso, double altura){
            this.nome = nome;
            this.anodenascimento = anodenascimento;
            this.peso = peso;
            this.altura = altura;
        }

            //Metodos get e set
                public String getNome(){
                    return nome;
                }
                //Metodos set sempre exigem um parametro
                public void setNome(String nome){
                    this.nome = nome;
                }
                public int getAnodenascimento(){
                    return anodenascimento;
                }
                public void setAnodenascimento(int anodenascimento){
                    this.anodenascimento = anodenascimento;
                }
                public double getPeso(){
                    return peso;
                }
                public void setPeso(double peso){
                    this.peso = peso;
                }
                public double getAltura(){
                    return altura;
                }
                public void setAltura(double altura){
                    this.altura = altura;
                }

     //Metodo imc
    public void imc(){
        double valorimc = peso / (altura * altura);
        System.out.println("Seu valor do IMC é: " + (int) valorimc);
        if (valorimc <= 18.5){
            System.out.println("Abaixo do peso");
        
        }
        else if (valorimc > 18.5 && valorimc < 24.9){
            System.out.println("Seu peso está normal");
        }
        else if (valorimc > 25 && valorimc < 29.99){
            System.out.println("Voce está sobrepeso");
        }
            else if (valorimc >= 30){
                System.out.println("Obesidade");
            }
    }
    //Metodo mostrar idade
    public void mostraridade(){
        int idade = 2024 - anodenascimento;
        System.out.println("Sua idade é " + idade);
    }
    //Metodo quantidade de agua
    public void quantidadeagua(){
        double ml = 35.0 * peso;
        double litro = ml * 0.001;
        System.out.printf("Voce deve beber %.1f litros de agua%n", litro );
    }
    //Metodo mostrar
    public void mostrar() {
        System.out.println("Nome: " + nome);
        System.out.println("Ano de nascimento: " + anodenascimento);
        System.out.println("Peso: " + peso);
        System.out.println("Altura: " + altura);
    }
}   


    