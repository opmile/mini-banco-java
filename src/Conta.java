import java.util.Scanner;

public class Conta {
    public static void main(String[] args) {

        // Identificação e inicialização dos dados do cliente
        String nomeCliente = "Milena O. Penhalves";
        String tipoConta = "Corrente";
        double saldoConta = 2500.0;

        System.out.println("Conta XXXXXX");

        System.out.println("\nBem-vindo(a) de volta, " + nomeCliente);
        System.out.println("Tipo de Conta: " + tipoConta);
        System.out.println("Saldo da Conta: R$" + saldoConta);

        // Menu de Inicialização
        System.out.printf("\nComo podemos ajudar?");
        String menuBanco = """ 
                \n
                1 - Consultar saldo atual
                2 - Receber
                3 - Transferir
                4 - Investir
                5 - Sair
                """;

        // Coleta de dados por iteração
        Scanner scanner = new Scanner(System.in);
        int respostaCliente = 0;

        while (respostaCliente != 5) {

            System.out.println(menuBanco);
            respostaCliente = scanner.nextInt();


            switch (respostaCliente) {
                case 1:
                    System.out.println("Saldo Atual: R$ " + saldoConta);
                    break;
                case 2:
                    System.out.println("Digite o valor a ser recebido");
                    double valorRecebido = scanner.nextInt();
                    saldoConta += valorRecebido;
                    System.out.println("Saldo atualizado! Agora você possui R$" + saldoConta);
                    break;
                case 3:
                    System.out.println("Digite o valor a ser transferido");
                    double valorTransferido = scanner.nextInt();
                    if (valorTransferido > saldoConta) {
                        System.out.println("Saldo insuficiente!");
                    } else {
                        saldoConta -= valorTransferido;
                        System.out.println("Saldo atualizado! Agora você possui R$" + saldoConta);
                    }
                    break;
                case 4:
                    System.out.println("comming soon");
                    break;
                case 5:
                    System.out.println("Sessão encerrada.");
                    System.out.println("Obrigado pela preferência!");
                default:
                    System.out.println("Opção inválida");
            }
        }
        scanner.close();
    }
}
