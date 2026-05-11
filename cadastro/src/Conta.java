
    import java.util.Scanner;
    void main() {
        System.out.println("Bem vindo ao seu banco! ");
        int opcao = 0;
        private double saldo = 2500.0;
        double recebido = 0;
        double transferir = 0;
        String dados;
        dados = """
            **********************************
            Nome:  Arthur Augusto
            Tipo de conta: Conta corrente""";
        System.out.println("Dados do cliente: ");
        System.out.println(dados);
        System.out.println("Saldo disponível: " + saldo);
        System.out.println("********************************** \n");


        String menu = """ 
    \n Digite qual operação deseja realizar: 
    1- Consultar saldo
    2- Receber valor 
    3- Transferir valor
    4- Finalizar operação  """;

        Scanner consulta = new Scanner(System.in);


        while (opcao != 4) {
            System.out.println(menu);
            opcao = (int) consulta.nextDouble();

            if (opcao == 1) {
                System.out.println("Seu saldo é: R$ " + saldo);


            } else if (opcao == 2) {
                System.out.println("Qual o valor a ser recebido? ");
                recebido = consulta.nextDouble();
                saldo += recebido;
                System.out.println("Saldo atual: " + saldo);

            } else if (opcao == 3) {
                System.out.println("Qual o valor da transferencia? ");
                transferir = consulta.nextDouble();

                if (transferir > saldo) {
                    System.out.println("Saldo insuficiente...");
                } else {
                    saldo -= transferir;
                    System.out.println("Saldo atual: " + saldo);
                }
            } else if (opcao != 4) {
                System.out.println("Opção inválida!");
            }
        }
    }

