package br.com.sistemabancario.banco.models;

import java.util.Scanner;

public class Login {
    private String nome = "";
    private String email = "";
    private String dataNascimento;
    private String numeroCelular;
    private int anoNascimento = 0;

    public String getNome() {
        return nome;
    }

    public String getEmail() {
        return email;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public String getNumeroCelular() {
        return numeroCelular;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public void setNumeroCelular(String numeroCelular) {
        this.numeroCelular = numeroCelular;
    }

    public int getAnoNascimento() {
        return anoNascimento;
    }

    public void setAnoNascimento(int anoNascimento) {
        this.anoNascimento = anoNascimento;
    }

    public void coletaDados() {
        Scanner registro = new Scanner(System.in);

                System.out.println("Digite o seu nome: ");
                this.nome = registro.nextLine();



    System.out.println("Digite o seu ano de nascimento: ");
    this.anoNascimento = registro.nextInt();
    registro.nextLine();

    if (anoNascimento > 2008) {
        System.out.println("Idade inválida, você precisa ser maior de idade para abrir uma conta.");
        System.exit(0);
    }



    System.out.println("Digite sua data de nascimento: ");
    this.dataNascimento = registro.nextLine();
    }

    public void coletaDetalhes() {
        Scanner detalhes = new Scanner(System.in);


                System.out.println("Digite seu endereço de email: ");
                this.email = detalhes.nextLine();
                System.out.println("Digite seu número do celular: ");
            this.numeroCelular = detalhes.nextLine();


        }
    }
