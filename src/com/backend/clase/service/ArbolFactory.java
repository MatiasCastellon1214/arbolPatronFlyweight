package com.backend.clase.service;

import com.backend.clase.model.Arbol;

import java.util.HashMap;
import java.util.Map;

public class ArbolFactory {
    private static Map<String, Arbol> arbolesFlyweight = new HashMap<>();

    public static Arbol obtenerArbol(int alto, int ancho, String color, String tipo){
        String key = tipo+color;
        if(!arbolesFlyweight.containsKey(key)){
            Arbol arbol = new Arbol(alto, ancho, color, tipo);
            arbolesFlyweight.put(key, arbol);
            System.out.println("Árbol de tipo: "+ tipo+ ", y de color: " +color+", creado");
        } else System.out.println("Árbol de tipo: "+tipo+", y de color: "+color+", encontrado");

        return arbolesFlyweight.get(key);
    }

}
