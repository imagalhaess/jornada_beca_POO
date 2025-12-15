public class Produtos implements Vendavel {
    protected int quantidade;
    protected double desconto;
    protected double valorTotal;
    protected double preco;
    public Produtos (double preco){
        this.preco = preco;
    }
    @Override
    public double calcularPrecoTotal(int quantidade) {
        return valorTotal = quantidade * preco;
    }

    @Override
    public double aplicarDesconto(double desconto) {
        return valorTotal = valorTotal - (valorTotal * (desconto/100));
    }
}
