package exercicios;

public class GeradorPrimo extends NumerosPrimos {
    public int gerarProximoPrimo (int numero){
        int i = numero + 1;
        while (true){
            if (verificarPrimalidade(i)){
                return i;
            }
            i++;
        }
    }
}
