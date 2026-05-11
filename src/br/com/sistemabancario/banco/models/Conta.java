package br.com.sistemabancario.banco.models;

public class Conta {
    private double saldo;
    private String dados;
    public Conta(String dados, double saldo) {
        this.dados = dados;
        this.saldo = saldo;
    }


    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public String getDados() {
        return dados;
    }

    public void setDados(String dados) {
        this.dados = dados;
    }

   public void depositar(double valor) {
        this.saldo += valor;

    }

   public void transferir(double valor) {
        if (valor > saldo) {
            System.out.println("Saldo insuficiente. Digite um valor válido.");
        } else {
            this.saldo -= valor;
        }

    }


    public void exibirDados()
    {
        System.out.println("Nome: " + dados);
        System.out.println("Saldo: R$ " + saldo);


    }
}
