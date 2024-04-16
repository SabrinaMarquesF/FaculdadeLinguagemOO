import java.util.Scanner;

public class Banco {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite seu nome:");
        String nome = scanner.nextLine();

        System.out.println("Digite seu sobrenome:");
        String sobrenome = scanner.nextLine();

        System.out.println("Digite seu CPF:");
        String cpf = scanner.nextLine();

        Cliente cliente = new Cliente(nome, sobrenome, cpf);
        Conta conta = new Conta(cliente);

        int opcao;
        do {
            System.out.println("\nEscolha uma opção:");
            System.out.println("1 - Consultar saldo");
            System.out.println("2 - Realizar depósito");
            System.out.println("3 - Realizar saque");
            System.out.println("4 - Encerrar");

            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    conta.consultarSaldo();
                    break;
                case 2:
                    System.out.println("Digite o valor do depósito:");
                    double valorDeposito = scanner.nextDouble();
                    conta.depositar(valorDeposito);
                    break;
                case 3:
                    System.out.println("Digite o valor do saque:");
                    double valorSaque = scanner.nextDouble();
                    conta.sacar(valorSaque);
                    break;
                case 4:
                    System.out.println("Encerrando a aplicação...");
                    break;
                default:
                    System.out.println("Opção inválida.");
            }
        } while (opcao != 4);

        scanner.close();
    }
}

