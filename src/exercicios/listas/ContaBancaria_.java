package exercicios.listas;

public class ContaBancaria_ {
    private int numeroConta;
    private double saldo;

    public ContaBancaria_(int numeroConta, double saldo) {
        this.numeroConta = numeroConta;
        this.saldo = saldo;
    }

    public int getNumeroConta() {
        return numeroConta;
    }

    public double getSaldo() {
        return saldo;
    }
}
