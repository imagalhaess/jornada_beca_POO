package exercicios;

public class ContaBancaria {
    protected double saldo = 0;

    public void depositar(double valorDeposito){
        saldo = saldo + valorDeposito;
        System.out.println("Seu novo saldo é de: R$" + saldo);
    }

    public void sacar(double valorSaque){
        if (saldo >= valorSaque){
            saldo = saldo - valorSaque;
            System.out.println("Seu novo saldo é de: R$" + saldo);
        } else {
            System.out.println("Você não possui saldo o suficiente!");
        }
    }
    public void consultarSaldo(){
        System.out.println("Seu saldo atual é de: R$" + saldo);
    }

}
