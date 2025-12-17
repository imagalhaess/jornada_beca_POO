package desafio_listas;

public class Compra implements Comparable <Compra> {
    private String descricao;
    private double valor;

    public Compra(String descricao, double valor) {
        this.descricao = descricao;
        this.valor = valor;
    }

    public String getDescricao() {
        return descricao;
    }

    public double getValor() {
        return valor;
    }

    @Override
    public int compareTo(Compra outrasCompras) {
        if (this.getValor() < outrasCompras.getValor()){
            return -1;
        } else if (this.getValor() > outrasCompras.getValor()) {
            return 1;
        } else{
            return 0;
        }
    }

    @Override
    public String toString() {
        return descricao + " - R$" + valor;
    }
}
