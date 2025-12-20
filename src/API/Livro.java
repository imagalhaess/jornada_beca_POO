package API;

public record Livro(String nome, String autor, Integer ano, Editora editora) {
    @Override
    public String toString() {
        return nome +
                " (" + ano +
                "), Editora: " + editora.nome() +
                " | " + editora.genero() + ", Autor: " + autor;
    }
}
