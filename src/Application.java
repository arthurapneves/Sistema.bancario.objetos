 import java.util.Scanner;
 import br.com.sistemabancario.banco.models.Conta;
 import br.com.sistemabancario.banco.models.Login;


 public class Application {
    void main() {
        System.out.println("Bem vindo ao menu para abertura de conta!");
        Login login = new Login();
        login.coletaDados();
        login.coletaDetalhes();


        System.out.println("\nBem vindo ao seu banco! ");

        Conta conta = new Conta(login.getNome(), 0.0);
        conta.exibirDados();
        String menu3 = """ 
                \n Digite qual operação deseja realizar: 
                1- Consultar saldo
                2- Receber valor 
                3- Transferir valor
                4- Finalizar operação  """;

        Scanner consulta = new Scanner(System.in);

int opcao = 0;
        while (opcao != 4) {
            System.out.println(menu3);
            opcao = (int) consulta.nextDouble();

            if (opcao == 1) {
                System.out.println("Seu saldo é: R$ " + conta.getSaldo());


            } else if (opcao == 2) {
                System.out.println("Qual o valor a ser recebido? ");
                conta.depositar(consulta.nextDouble());
                System.out.println("Saldo atual: " + conta.getSaldo());

            } else if (opcao == 3) {
                System.out.println("Qual o valor da transferencia? ");
                conta.transferir(consulta.nextDouble());
                System.out.println("Saldo atual: " + conta.getSaldo());

            } else if (opcao != 4) {
                System.out.println("Opção inválida!");
            }
        }
    }
}