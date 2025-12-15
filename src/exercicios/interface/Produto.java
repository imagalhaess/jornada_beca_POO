public class Produto {
    private String nome;
    private double preco;

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }
    public void AplicarDesconto(double desconto){
        double valorDesconto = preco * (desconto/100);
        preco = preco - valorDesconto;
        System.out.println("Se o desconto é de: " + desconto + "%" + ", então" +
                                   " o novo preço é: R$" + preco);
    }
}