package Conta;
public class Conta {
    private long cpf;
    private int numeroconta;
    private double saldo;
    private boolean correntistapremium;
    //construtor
    public Conta(long cpf, int numeroconta, double saldo, boolean correntistapremium){
        this.cpf = cpf;
        this.numeroconta = numeroconta;
        this.saldo = saldo;
        this.correntistapremium = correntistapremium;
    }

    //get e set
    public long getCpf(){
        return cpf;
    }
    public void setCpf(long cpf){
        this.cpf = cpf;
    }
    public int getNumeroconta(){
        return numeroconta;
    }
    public void setNumeroconta(int numeroconta){
        this.numeroconta = numeroconta;
    }
    public double getSaldo(){
        return saldo;
    }
    public void setSaldo(double saldo){
        this.saldo = saldo;
    }
    public boolean getCorrentistapremium(){
            return correntistapremium;
    }
    public void setCorrentistapremium(boolean correntistapremium){
        this.correntistapremium = correntistapremium;
    }
    //metodo bonificação
    public void bonificacao(){
        if (correntistapremium == true){
        double bonificacao = 0.10 * saldo;
        System.out.printf("Valor bonificação cliente premiun: R$ %.1f %n", bonificacao);
    }
        else if (correntistapremium == false){
            double bonificacao = 0.5 * saldo;
            System.out.printf("Valor bonificação cliente padrão: R$ %.1f %n", bonificacao);
        }
    }
    //metodo saque
    public void saque(double valorsaque){
        if (valorsaque > getSaldo()){
            System.out.println("Saldo insuficiente");
        }
        else if (valorsaque < getSaldo()){
            saldo = getSaldo() - valorsaque;
            System.out.println("Valor retirado! seu saldo atual agora é : R$" + getSaldo());
        }
    }
    //metodo deposito
    public void deposito(double valordeposito){
        saldo = getSaldo() + valordeposito;
        System.out.println("Deposito feito! Seu novo saldo é: " + getSaldo());
    };
    //metodo mostrar
    public void mostrar(){
        System.out.println("Seu cpf é: " + getCpf());
        System.out.println("Numero da conta: " + getNumeroconta());
        System.out.println("Seu saldo atual é: R$" + getSaldo());
        bonificacao();
        System.out.println("--------------------------------------------------");
        saque(200);
        getSaldo();
        deposito(500);
        getSaldo();
        transferencia(500);
        getSaldo();
    }
    //metodo transferencia
    public void transferencia(double valortransferencia){
        System.out.println("Qual valor desejado para transferencia? ");
        if (valortransferencia > getSaldo()){
            System.out.println("Saldo insuficiente para transação");
            } else if(valortransferencia < getSaldo()){
                saldo = getSaldo() - valortransferencia;
                System.out.println("Transferencia concluida! seu saldo atual é: " + getSaldo());
            }
        }
    
     }
    



