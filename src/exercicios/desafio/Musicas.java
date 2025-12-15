public class Musicas extends Audio {
    protected String artista;
    protected String album;
    protected String genero;

    public Musicas (String titulo, double duracao, String artista,
                    String album, String genero){
        super(titulo, duracao);
        this.artista = artista;
        this.album = album;
        this.genero = genero;
    }

    public String getArtista() {
        return artista;
    }

    public String getAlbum() {
        return album;
    }

    public String getGenero() {
        return genero;
    }
}
