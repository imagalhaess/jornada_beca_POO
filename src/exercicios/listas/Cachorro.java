package exercicios.listas;

public class Cachorro extends Animals {

    public Cachorro(String nome) {
        super(nome);
    }

    @Override
    public void emitirSom() {
        System.out.println("Au au!");;
    }
}
