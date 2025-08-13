package ExContaBancaria;

public class ContaBancaria {
    String numeroConta;
    String titular;
    double saldo;

    ContaBancaria(String numeroConta, String titular, double saldo) {
        this.numeroConta = numeroConta;
        this.titular = titular;
        this.saldo = saldo;
    }

    void depositar(double valor) {
        saldo += valor;
    }

    void sacar(double valor) {
        if (valor <= saldo) {
            saldo -= valor;
        } else {
            System.out.println("Saldo insuficiente!");
        }
    }

    double exibirSaldo() {
        return saldo;
    }
}


