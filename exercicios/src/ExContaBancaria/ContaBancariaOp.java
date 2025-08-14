package ExContaBancaria;

public class ContaBancariaOp {
    public static void main(String[] args) {
        ContaBancaria Conta1 = new ContaBancaria("1234", "Pedro Alves", 1200.87);

        Conta1.depositar(500);
        Conta1.sacar(200);
        System.out.println("Valor atual: R$" + Conta1.exibirSaldo());


    }
}
