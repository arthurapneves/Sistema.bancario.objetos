package br.com.sistemabancario.banco;

public class Base {
    private int opcao = 0;
    private double saldo;
    private String dados;

    public Base(String dados, double saldo) {
        this.dados = dados;
        this.saldo = saldo;
    }

    public int getOpcao() {
        return opcao;
    }

    public void setOpcao(int opcao) {
        this.opcao = opcao;
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

   public void tranferir(double valor) {
        if (valor > saldo) {
            System.out.println("Saldo insuficiente. Digite um valor válido.");
        } else {
            this.saldo -= valor;
        }

    }


    public void exibirDados()
    {
        System.out.println(dados);

    }
}
