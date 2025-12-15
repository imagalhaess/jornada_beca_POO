public class Main {
    public static void main(String[] args){
        Musicas musicas = new Musicas("Povoada", 3,
                                      "Maria","Povoada", "MPB");
        musicas.reproduzir();
        musicas.curtir();
        musicas.Calcularclassificacao();
        musicas.detalhes();

        Podcasts podcasts = new Podcasts("Xadrez Verbal", 22, "Filipe Fiqueiredo",
                                         50);
        podcasts.reproduzir();
        podcasts.curtir();
        podcasts.Calcularclassificacao();
        podcasts.detalhes();

    }
}
