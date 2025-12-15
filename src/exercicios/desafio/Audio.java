public class Audio {
    protected String titulo;
    protected int totalDeReproducoes;
    protected double duracao;
    protected int curtidas;
    protected double classificacao;

    public Audio (String titulo, double duracao){
        this.titulo = titulo;
        this.totalDeReproducoes = 0;
        this.duracao = duracao;
        this.curtidas = 0;
        this.classificacao = 0.0;
    }

    public String getTitulo() {
        return titulo;
    }

    public int getTotalDeReproducoes() {
        return totalDeReproducoes;
    }

    public double getDuracao() {
        return duracao;
    }

    public int getCurtidas() {
        return curtidas;
    }

    public double getClassificacao() {
        return classificacao;
    }

    public void curtir(){
        curtidas++;
        System.out.println("Você curtiu " + titulo);
    }
    public void reproduzir(){
        totalDeReproducoes++;
        System.out.println("Você ouviu " + titulo);
    }
    public void Calcularclassificacao(){
        if (totalDeReproducoes > 100){
            classificacao = 5;
            System.out.println("Bem avaliada!");
        } else {
            classificacao = 3;
            System.out.println("Pode melhorar!");
        }
    }
    public void detalhes(){
        System.out.println("Título: " + titulo + " | " + "Duração em minutos: "
                                   + duracao);
    }
}
