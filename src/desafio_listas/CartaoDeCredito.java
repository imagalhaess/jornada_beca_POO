package desafio_listas;

import java.util.ArrayList;
import java.util.List;

public class CartaoDeCredito {
    private double limite;
    private double saldo;
    private List<Compra> compras;

    public CartaoDeCredito(double limite) {
        this.limite = limite;
        this.saldo = getLimite();
        this.compras = new ArrayList<>();
    }

    public double getLimite() {
        return limite;
    }

    public double getSaldo() {
        return saldo;
    }

    public boolean lancaCompra(Compra compra) {
        if (saldo >= compra.getValor()) {
            System.out.println("Compra aprovada!");
            compras.add(compra);
            this.saldo = saldo - compra.getValor();
            return true;
        }
        return false;
    }

    public List<Compra> getCompras() {
        return compras;
    }
}

