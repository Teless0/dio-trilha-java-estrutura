package com.teles;


import java.util.*;

public class Main {

    public static void main(String[] args) {
        Set<Carro> hasSetCarros = new HashSet<>();

        hasSetCarros.add(new Carro("Ford"));
        hasSetCarros.add(new Carro("chevrolet"));
        hasSetCarros.add(new Carro("Fiat"));
        hasSetCarros.add(new Carro("Renault"));
        hasSetCarros.add(new Carro("Zip"));
        hasSetCarros.add(new Carro("Alfa Roemo"));

        System.out.println(hasSetCarros);

        Set<Carro> treeSetCarros = new TreeSet<>();

        treeSetCarros.add(new Carro("Ford"));
        treeSetCarros.add(new Carro("chevrolet"));
        treeSetCarros.add(new Carro("Fiat"));
        treeSetCarros.add(new Carro("Renault"));
        treeSetCarros.add(new Carro("Zip"));
        treeSetCarros.add(new Carro("Alfa Roemo"));

        System.out.println(treeSetCarros);



    }
}
