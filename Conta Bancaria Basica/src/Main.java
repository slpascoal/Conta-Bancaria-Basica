import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        double saldoEmConta = 1436.24;
        double transferencias;

        System.out.println("*******************");
        System.out.println();
        System.out.println("Bem vindo de volta Usuário");
        System.out.println("Tipo de Conta: Corrente");
        System.out.println("Saldo Inicial: R$ 1436,24");
        System.out.println("*******************");

        int menu;
        boolean sair = true;

        while (sair) {
            System.out.println();
            System.out.println("Operações");
            System.out.println();

            System.out.println("1- Consultar saldos");
            System.out.println("2- Receber valor");
            System.out.println("3- Transferir valor");
            System.out.println("4- Sair");
            System.out.println();

            System.out.print("Digite a opção desejada: ");
            menu = teclado.nextInt();
            System.out.println();

            switch (menu) {
                case 1:
                    System.out.println("Seu saldo é = R$" + saldoEmConta);
                    System.out.println();

                    break;

                case 2:
                    System.out.print("Insira o valor que deseja receber: ");
                    transferencias = teclado.nextDouble();

                    if (transferencias <= 0.01) {
                        System.out.println("Erro: mínimo valor para receber é de R$0,01");
                        System.out.println();

                        break;
                    }else {
                        saldoEmConta += transferencias;
                        System.out.println();
                        System.out.println("Valor recebido!");
                        System.out.println();

                        break;
                    }

                case 3:
                    System.out.print("Insira o valor que deseja transferir: ");
                    transferencias = teclado.nextDouble();

                    if (transferencias <= 0.01) {
                        System.out.println("Erro: mínimo valor para transferir é de R$0,01");
                        System.out.println();

                        break;
                    }else if (transferencias > saldoEmConta){
                        System.out.println("Erro: você não possui esse valor para transferir.");
                        System.out.println();
                    }else {
                        saldoEmConta -= transferencias;
                        System.out.println();
                        System.out.println("Valor transferido!");
                        System.out.println();

                        break;
                    }

                    break;

                case 4:
                    System.out.println("Conta Bancária encerrada, volte sempre!");
                    sair = false;
                    break;

                default:
                    System.out.println("Erro: insira uma opção válida!");
                    break;
            }
        }

        teclado.close();
    }
}