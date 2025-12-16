package exercicios.listas;

public class Animals {
    private String nome;
    public Animals(String nome){
        this.nome = nome;
    }
    public void emitirSom(){
        System.out.println("Emitiu som.");
    }

    @Override
    public String toString() {
        return "Nome: " + nome;
    }
}
