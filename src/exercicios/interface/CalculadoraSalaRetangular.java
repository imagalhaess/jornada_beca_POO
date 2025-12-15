public class CalculadoraSalaRetangular implements CalculoGeometrico {
    protected double largura;
    protected double comprimento;

    public CalculadoraSalaRetangular (double largura, double comprimento){
        this.largura = largura;
        this.comprimento = comprimento;
    }

    @Override
    public double calcularArea() {
        return (largura * comprimento);
    }
    @Override
    public double calcularPerimetro() {
        return (2 * (largura + comprimento));
    }
}
