/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.grafos;

/**
 *
 * @author Ignacio Gaynor
 */
public class Vertice {
     String nombre;
    int numVertice;

    public Vertice(String x) {
        nombre = x;
        numVertice = -1; // -1 porque ese vertice todavia no está en la matriz
    }

    // devuelve identificador del vértice
    public String nomVertice() {
        return nombre;
    }

    // true, si dos vértices son iguales
    public boolean equals(Vertice n) {
        return nombre.equals(n.nombre);
    }

    // establece el número de vértices
    public void asigVert(int n) { 
        numVertice = n;
    }

    @Override
    public String toString() { // características del vértice
        return nombre + " (" + numVertice + ")";
    }
}
