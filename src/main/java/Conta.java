public class Conta {
    private Cliente cliente;
    private double saldo;

    public Conta(Cliente cliente) {
        this.cliente = cliente;
        this.saldo = 0.0;
    }

    public double getSaldo() {
        return saldo;
    }

    public void depositar(double valor) {
        saldo += valor;
        System.out.println("Depósito de R$" + valor + " realizado com sucesso.");
    }

    public void sacar(double valor) {
        if (valor <= saldo) {
            saldo -= valor;
            System.out.println("Saque de R$" + valor + " realizado com sucesso.");
        } else {
            System.out.println("Saldo insuficiente para realizar o saque.");
        }
    }

    public void consultarSaldo() {
        System.out.println("Saldo atual: R$" + saldo);
    }
}

