public class Livro_ implements Calculavel {
    protected double preco;
    protected double taxa;
    protected double novoPreco;
    public Livro_ (double preco, double taxa){
        this.preco = preco;
        this.taxa = taxa;
    }

    @Override
    public double calcularPrecoFinal() {
        novoPreco = preco + (preco * (taxa / 100));
        return novoPreco;
    }
}
