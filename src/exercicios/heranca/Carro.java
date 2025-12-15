package exercicios;

public class Carro {
    protected String nome;
    protected double preco1;
    protected double preco2;
    protected double preco3;

    public void definirModelo(String nome) {
        this.nome = nome;
    }

    public void definirPrecos(double preco1, double preco2, double preco3) {
        this.preco1 = preco1;
        this.preco2 = preco2;
        this.preco3 = preco3;
    }

    public double calcularMenorPreco() {
        if (preco1 < preco2 && preco1 < preco3) {
            return preco1;
        } else if (preco2 < preco3) {
            return preco2;
        } else {
            return preco3;
        }
    }

    public double calcularMaiorPreco() {
        if (preco1 > preco2 && preco1 > preco3) {
            return preco1;
        } else if (preco2 > preco3) {
            return preco2;
        } else {
            return preco3;
        }
    }

    public void exibirInfo() {
        System.out.printf("Nome do carro: %s  | preços: %.2f, %.2f e %.2f",
                          nome, preco1, preco2, preco3);
    }
}

