public class ConversorTemperaturaPadrao implements ConversorTemperatura {
    protected double temperatura;
    public ConversorTemperaturaPadrao (double temperatura){
        this.temperatura = temperatura;
    }

    @Override
    public void celsiusParaFahrenheit() {
        System.out.println("\nA temperatura em Fahrenheit é de: " + ((temperatura * 1.8) + 32) + "°F.");
    }

    @Override
    public void fahrenheitParaCelsius() {
        System.out.printf("A temperatura em Celsius é de: %.2f°C", ((temperatura - 32) / 1.8));
    }
}
