package com.backend.clase.model;

import java.util.ArrayList;

public class Bosque {
    private ArrayList<Arbol> arboles = new ArrayList<>();

    public void plantarArbol(Arbol arbol){
        System.out.println("Plantando árbol");
        arboles.add(arbol);


    }
}
