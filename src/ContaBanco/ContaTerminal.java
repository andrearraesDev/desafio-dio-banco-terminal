package ContaBanco;

import java.util.Random;
import java.util.Scanner;

public class ContaTerminal {

    public static void main(String[] args) {

        try (Scanner scanner = new Scanner(System.in)) {

            // Entrada do nome do cliente
            System.out.print("Digite seu nome completo: ");
            String nomeCliente = scanner.nextLine();

            // Entrada da data de nascimento
            System.out.print("Informe sua data de nascimento (dd/mm/aaaa): ");
            String dataNascimento = scanner.nextLine();

            // Geração da agência e número da conta
            String agencia = gerarAgencia();
            int numeroConta = gerarNumeroConta();

            // Entrada do saldo
            System.out.print("Depósito inicial: R$ ");
            double saldoCliente = scanner.nextDouble();

            // Resumo da conta
            System.out.println("\nOlá, " + nomeCliente + "!");
            System.out.println("Conta criada com sucesso no nosso banco digital.");
            System.out.println("--------------------------------------------");
            System.out.println("Data de Nascimento: " + dataNascimento);
            System.out.println("Agência: " + agencia);
            System.out.println("Número da Conta: " + numeroConta);
            System.out.printf("Saldo disponível: R$ %.2f%n", saldoCliente);
            System.out.println("--------------------------------------------");
            System.out.println("Obrigado por confiar em nossos serviços! 😊");
        }
    }

    // Método para gerar número da agência
    private static String gerarAgencia() {
        Random random = new Random();
        int numero = random.nextInt(9000) + 1000; 
        int digito = random.nextInt(10);
        return numero + "-" + digito;
    }

    // Método para gerar número de conta
    private static int gerarNumeroConta() {
        Random random = new Random();
        return random.nextInt(900000) + 100000;
    }
}