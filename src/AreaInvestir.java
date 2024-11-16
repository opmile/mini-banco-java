import java.lang.reflect.AccessFlag;
import java.util.Scanner;

public class AreaInvestir {
    public static void main(String[] args) {
        System.out.println("Essa é sua carteira de investimentos!");

        double saldoConta = 1000;
        double poupancaAcumulado = 500;
        double rendaFixaAcumulado = 1500;
        double acoesAcumulado = 4000;

        double totalAcumulado = poupancaAcumulado + rendaFixaAcumulado + acoesAcumulado;


        System.out.println("Selecione a opção de acesso:");
        String menuInvestir = """
                1 - Carteira
                2 - Em alta
                3 - Comprar
                4 - Resgatar
                5 - Sair
                """;

        Scanner scanner = new Scanner(System.in);
        int respostaCliente = 0;

        do {
            System.out.println(menuInvestir);
            respostaCliente = scanner.nextInt();

            switch (respostaCliente) {
                case 1:
                    System.out.println("Relatório de Investimentos: ");

                    System.out.println("\nPoupança: R$" + poupancaAcumulado);
                    System.out.println("Renda Fixa R$" + rendaFixaAcumulado);
                    System.out.println("Ações: R$" + acoesAcumulado);

                    System.out.println("\nTotal Acumulado R$" + totalAcumulado);
                    break;
                case 2:
                    String menuAlta = """
                            1 - Renda Fixa
                            2 - Renda Variável
                            3 - Voltar
                            """;

                    while (respostaCliente !=  3) {
                        System.out.println(menuAlta);
                        respostaCliente = scanner.nextInt();
                        switch (respostaCliente) {
                            case 1:
                                System.out.println("Poupança Nacional: Rentabilidade de 6% ao ano. Risco baixo, liquidez diária, ideal para investidores conservadores.");
                                System.out.println("CDB: Rentabilidade de 110% do CDI. Risco moderado, liquidez no vencimento (2 anos), recomendado para médio prazo.");
                                System.out.println("LCI:Rentabilidade de 100% do CDI, isento de IR. Risco baixo, liquidez no vencimento (1 ano), indicado para objetivos de curto prazo.");
                                break;

                            case 2:
                                System.out.println("Tech Ltda.: Rentabilidade média de 12% ao ano. Risco alto, liquidez diária, indicado para investidores com perfil agressivo");
                                System.out.println("Eletric: Rentabilidade média de 8% ao ano. Risco médio, liquidez diária, recomendado para diversificação em setor estável");
                                System.out.println("Fintech: Rentabilidade média de 14% ao ano. Risco alto, liquidez diária, perfil de investidor que busca exposição ao setor financeiro");
                                break;
                            case 3:
                                break;
                            default:
                                System.out.println("Insira um número válido!");
                        }
                    }
                    break;
                case 3:
                String menuOpcoes = """
                        1 - Poupança Nacional
                        2 - CDB
                        3 - LCI
                        4 - Tech Ltda.
                        5 - Eletrical
                        6 - Fintech
                        7 - Voltar
                        """;

                while (respostaCliente != 7) {
                    System.out.println("Selecione a opção de investimento ou conheça suas oportunidades em alta");
                    System.out.println(menuOpcoes);
                    respostaCliente = scanner.nextInt();

                    System.out.println("Saldo: R$" + saldoConta);
                    System.out.println("Acumulado: R$" + totalAcumulado);

                    System.out.println("Digite o valor a ser investido: ");
                    double valorInvestido = scanner.nextDouble();

                    if (valorInvestido > saldoConta) {
                        System.out.println("Saldo Insuficiente!");
                        break;
                    }

                    saldoConta -= valorInvestido;

                    
                    if (respostaCliente == 1) {
                        poupancaAcumulado += valorInvestido;
                        System.out.println("\nPoupança Atualizada!");
                        System.out.println("Poupança: R$" + poupancaAcumulado);
                        break;
                    } else if (respostaCliente == 2 || respostaCliente == 3) {
                        rendaFixaAcumulado += valorInvestido;
                        System.out.println("\nRenda Fixa Atualizada!");
                        System.out.println("Renda Fixa: R$" + rendaFixaAcumulado);
                        break;
                    } else if (respostaCliente == 4 || respostaCliente == 5 || respostaCliente == 6) {
                        System.out.println("\nAções Atualizadas!");
                        System.out.println("Ações: R$" + acoesAcumulado);
                    }

                    System.out.println("Total Acumulado: R$" + totalAcumulado);
                    System.out.println("Saldo: R$" + saldoConta);
                }
            }


        } while (respostaCliente != 5);

    }
}
