/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.grafos;

/**
 *
 * @author Ignacio Gaynor
 */
public class ColaLista {
 private Nodo frente;
    private Nodo fin;

    public ColaLista() {
        frente = fin = null;
    }

    public boolean colaVacia() {
        return frente == null;
    }

    public void insertar(Object elemento) {
        Nodo a;
        a = new Nodo(elemento);
        if (colaVacia()) {
            frente = a;
        } else {
            fin.siguiente = a;
        }
        fin = a;
    }

    public Object quitar() throws Exception {
        if (colaVacia()) {
            throw new Exception("Cola vacía");
        }
        Object aux = frente.elemento;
        frente = frente.siguiente;
        if (frente == null) {
            fin = null;
        }
        return aux;
    }
   
}
class Nodo {
    Object elemento;
    Nodo siguiente;

    public Nodo(Object elemento) {
        this.elemento = elemento;
        siguiente = null;
    }
}
