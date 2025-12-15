public class ConversorMoeda implements ConversaoFinanceira {
    private final double COTACAO = 5;
    @Override
    public double converterDolarParaReal(double valorDolar) {
        return COTACAO * valorDolar;
    }
}
