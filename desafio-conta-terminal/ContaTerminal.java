import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o nome do cliente: ");
        String nomeCliente = scanner.nextLine();

        System.out.print("Digite a agencia: ");
        int agencia = scanner.nextInt();

        System.out.print("Digite o numero: ");
        int numero = scanner.nextInt();

        System.out.print("Digite o saldo:");
        double saldo = scanner.nextDouble();

        Conta conta = new Conta(nomeCliente, agencia, numero, saldo);

        System.out.println("Nome do cliente: " + conta.getNomeCliente());
        System.out.println("Agencia e: " + conta.getAgencia() + "Conta e: " + conta.getNumero());
        System.out.println("Saldo e: " + conta.getSaldo());

        scanner.close();
    }
}
