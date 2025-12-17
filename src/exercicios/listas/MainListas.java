package exercicios.listas;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class MainListas {
    public static void main(String[] args) {
        // Task 1: lista de numeros ordenados por ordem crescente
        List<Integer> numeros = new ArrayList<>(); // Lista de inteiros
        numeros.add(19);
        numeros.add(3);
        numeros.add(7);
        numeros.add(24);
        numeros.add(1);
        System.out.println(numeros);
        Collections.sort(numeros);
        System.out.println(numeros);

    // Task 2: adicionar objetos Titulo a uma lista e ordená-los.
        ArrayList<Titulo> listaTitulo = new ArrayList<>();
        listaTitulo.add(new Titulo("Círculo de Fogo"));
        listaTitulo.add(new Titulo("Jurassic Park"));
        listaTitulo.add(new Titulo("Interestelar"));
        listaTitulo.add(new Titulo("Imagine Eu E Você"));
        // Lista antes de ordenar
        System.out.println(listaTitulo);
        Collections.sort(listaTitulo);
        // Lista após ordenar
        System.out.println(listaTitulo);

        // Task 3: criar variável do tipo List e
        // instanciá-la como ArrayList e LinkedList
        List<String> minhaLista;
        minhaLista = new ArrayList<>();
        minhaLista.add("Item");
        System.out.println(minhaLista);
        minhaLista = new LinkedList<>();
        minhaLista.add("Item 2");
        System.out.println(minhaLista);

    }
}
