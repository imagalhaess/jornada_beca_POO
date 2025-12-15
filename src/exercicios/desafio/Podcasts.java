public class Podcasts extends Audio {
    protected String apresentador;
    protected int episodio;

    public Podcasts (String titulo, double duracao, String apresentador,
                     int episodio){
        super(titulo, duracao);
        this.apresentador = apresentador;
        this.episodio = episodio;
    }

    public String getApresentador() {
        return apresentador;
    }

    public int getEpisodio() {
        return episodio;
    }
}
