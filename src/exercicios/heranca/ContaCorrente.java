package exercicios;

public class ContaCorrente extends ContaBancaria {
    public void cobrarTarifaMensal(double tarifa){
        saldo = saldo - tarifa;
    }
}
