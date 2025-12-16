package exercicios.listas;

import java.time.LocalDate;

public class ProdutoPerecivel extends Produto {
    private LocalDate dataValidade;

    public ProdutoPerecivel(String nome, double preco, LocalDate dataValidade) {
        super(nome, preco);
        this.dataValidade = dataValidade;
    }

    @Override
    public String toString() {
        return "Produto: " + nome + " | Preço: " +
                preco + " | Data de validade: "
                + dataValidade;
    }
}
