package desafio_listas;

import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        var teclado = new Scanner(System.in);
        System.out.println("Digite o limite do cartão: ");
        double limite1 = teclado.nextDouble();

        CartaoDeCredito cartaoDeCredito = new CartaoDeCredito(limite1);
        int sair = 1;
        while (sair != 0){
            System.out.println("Qual a descrição da compra? ");
            String compra1 = teclado.next();
            System.out.println("Qual o valor da compra? ");
            double valor1 = teclado.nextDouble();
            Compra compra = new Compra(compra1, valor1);
            boolean compraRealizada = cartaoDeCredito.lancaCompra(compra);
            if (compraRealizada){
                System.out.println("Digite 0 para sair ou 1 para continuar: ");
                sair = teclado.nextInt();
            } else {
                System.out.println("Saldo insuficiente.");
                sair = 0;
            }
        }
        System.out.println("COMPRAS REALIZADAS: ");
        System.out.println("********************");
        Collections.sort(cartaoDeCredito.getCompras());
        for (Compra compra : cartaoDeCredito.getCompras()){
            System.out.println(compra.getDescricao() + " - R$" + compra.getValor());
        }
        System.out.println("********************");
        System.out.println("Saldo final do cartão: " + "R$" + cartaoDeCredito.getSaldo());



    }
}
