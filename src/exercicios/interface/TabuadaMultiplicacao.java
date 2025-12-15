public class TabuadaMultiplicacao implements Tabuada {
    protected int numero;
    public TabuadaMultiplicacao (int numero){
        this.numero = numero;
    }

    @Override
    public void mostrarTabuada() {
        for (int i = 1; i <= 10; i++){
            System.out.println(numero + " x " + i + " = " + (numero * i));
        }
    }
}
