public class ProdutoFisico implements Calculavel {
    protected double preco;
    protected double desconto;
    protected double novoPreco;
    public ProdutoFisico(double desconto, double preco) {
        this.desconto = desconto;
        this.preco = preco;
    }

    @Override
    public double calcularPrecoFinal() {
        novoPreco = preco - (preco * (desconto/100));
        return novoPreco;
    }
}
