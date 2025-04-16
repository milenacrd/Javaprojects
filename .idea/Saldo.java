import java.util.Scanner;
import java.util.Locale;

public class Saldo {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        System.out.println("***********************");
        System.out.println("Dados iniciais do cliente:");
        String nome = "Milena Cardoso";
        String tipo = "Corrente";
        double saldoInicial = 2500;
        System.out.println(nome);
        System.out.println(tipo);
        System.out.printf("%.0f%n", saldoInicial);
        System.out.println("************************");

        String menu = """
                1 - Consultar Saldo;
                2 - Sacar Valor;
                3 - Depositar Valor;
                4 - Sair; 
                
                """;
        System.out.println(menu);
        System.out.println("Escolha a opção desejada");
        Scanner scanner = new Scanner(System.in);
        int op = scanner.nextInt();

        switch (op) {
            case 1:
                System.out.println(saldoInicial);
                break;
            case 2:
                System.out.println("Qual valor deseja sacar?");
                double valorSaque = scanner.nextDouble();
                saldoInicial -= valorSaque;
                System.out.printf("O seu novo saldo é: R$%.2f%n", saldoInicial);
                break;
            case 3:
                System.out.println("Qual valor deseja depositar?");
                double valorDeposito = scanner.nextDouble();
                saldoInicial += valorDeposito;
                System.out.printf("O seu novo saldo com deposito é: R$%.2f%n", saldoInicial);
                break;
            case 4:
                System.out.println("Sessão encerrada!");
                break;
            default:
                System.out.println("Numero digitado inválido!");
        }
        scanner.close();


    }
}