package ContaBanco;

import java.util.Scanner;

public class ContaTerminal {

    public static void main(String[] args) {
        
        try (Scanner scanner = new Scanner(System.in)) {
            
            System.out.print("Seu Nome: ");
            String nomeCliente = scanner.nextLine();
            
            System.out.print("Sua Agência: ");
            String agenciaCliente = scanner.nextLine();
            
            System.out.print("Número da conta: ");
            int numeroConta = scanner.nextInt();
            
            System.out.print("Saldo: ");
            double saldoCliente = scanner.nextDouble();
            
            System.out.println("\nOlá, " + nomeCliente + "! Obrigado por criar uma conta em nosso banco. " +
                    "Sua agência é " + agenciaCliente + ", conta " + numeroConta +
                    " e seu saldo é de R$ " + String.format("%.2f", saldoCliente) +
                    " já está disponível para saque ou transferência.");
        }
    }
}