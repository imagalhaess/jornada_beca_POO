package exercicios.listas;

import java.time.LocalDate;
import java.util.ArrayList;

public class Main_listas {
    public static void main(String[] args){
        var pessoa = new Pessoa("Isa", 32);
        System.out.println(pessoa);
        var pessoa1 = new Pessoa("Pat", 35);
        var pessoa2 = new Pessoa("Nanda", 40);
        ArrayList<Pessoa>pessoasLista = new ArrayList<>();
        pessoasLista.add(pessoa);
        pessoasLista.add(pessoa1);
        pessoasLista.add(pessoa2);
        System.out.println(pessoasLista);
        System.out.println(pessoasLista.size());
        System.out.println(pessoasLista.get(1));

        Produto produto1 = new Produto("Limao", 2);
        Produto produto2 = new Produto("Laranja", 5);
        Produto produto3 = new Produto("Abacaxi", 10);
        ArrayList<Produto> produtosLista = new ArrayList<>();
        produtosLista.add(produto1);
        produtosLista.add(produto2);
        produtosLista.add(produto3);
        System.out.println(produtosLista);
        System.out.println(produtosLista.get(2));
        ProdutoPerecivel produtoPerecivel = new ProdutoPerecivel("Bolo",
                                                                 25, LocalDate.of(2025, 6, 15));
        produtosLista.add(produtoPerecivel);

        for (Produto item : produtosLista){
            System.out.println(item);
            if (item instanceof ProdutoPerecivel produtos && produtos.preco < 30){
                System.out.println(produtos);
            }
        }

        Cachorro meuCachorro = new Cachorro("Jorge");
        Animals meuAnimal = meuCachorro;
        if (meuAnimal instanceof Cachorro){
            System.out.println("É um cachorro! Posso fazer o casting!");
            Cachorro novoCachorro = (Cachorro) meuAnimal;
            novoCachorro.emitirSom();
        }
        Animals meuAnimal2 = (Animals) meuCachorro;
        meuAnimal2.emitirSom();
        Animals gato = new Animals("Pipa");
        Animals cachorro1 = new Cachorro("José");
        Animals cachorro2 = new Cachorro("Maite");
        ArrayList<Animals> lista = new ArrayList<>();
        lista.add(meuAnimal);
        lista.add(meuAnimal2);
        lista.add(meuCachorro);
        lista.add(gato);
        lista.add(cachorro1);
        lista.add(cachorro2);
        System.out.println(lista);

        Produtto produtto1 = new Produtto("Mouse", 50);
        Produtto produtto2 = new Produtto("Teclado", 120);
        Produtto produtto3 = new Produtto("Monitor", 550);
        ArrayList<Produtto> produtos = new ArrayList<>();
        produtos.add(produtto1);
        produtos.add(produtto2);
        produtos.add(produtto3);
        double soma = 0;
        for (Produtto produtto : produtos){
            soma += produtto.getPreco();
        }
        System.out.println("A média dos preços é: " + soma / produtos.size());

        ArrayList<Forma> listaDeFormas = new ArrayList<>();
        listaDeFormas.add(new Circulo(10));
        listaDeFormas.add(new Circulo(20));
        listaDeFormas.add(new Quadrado(5));
        listaDeFormas.add(new Quadrado(8));
        for (Forma a : listaDeFormas){
            System.out.println("A área é: " + a.calcularArea());
        }

        ArrayList<ContaBancaria_> listaContas = new ArrayList<>();
        listaContas.add(new ContaBancaria_(1, 10));
        listaContas.add(new ContaBancaria_(2, 100));
        listaContas.add(new ContaBancaria_(3, 104));
        listaContas.add(new ContaBancaria_(4, 1000));
        listaContas.add(new ContaBancaria_(5, 105));
        ContaBancaria_ menorSaldo = listaContas.get(0);
        for (ContaBancaria_ conta : listaContas){
            if (conta.getSaldo() < menorSaldo.getSaldo()){
                menorSaldo = conta;
            }
        }
        System.out.printf("Dados da conta de menor saldo: Número: %d | Saldo: %.2f",
                          menorSaldo.getNumeroConta(),
                           menorSaldo.getSaldo());
    }

}
