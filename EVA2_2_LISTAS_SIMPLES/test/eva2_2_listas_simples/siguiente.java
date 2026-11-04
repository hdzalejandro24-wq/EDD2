/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eva2_2_listas_simples;

/**
 *
 * @author carpi
 */
public class siguiente {
class ListasSimples {

    private Nodo inicio;
    private int cantidad;

    public ListasSimples() {
        inicio = null;
        cantidad = 0;
    }

    // AGREGAR UN NODO AL FINAL
    public void agregar(int valor) {
        Nodo nuevo = new Nodo(valor);

        if (inicio == null) {
            inicio = nuevo;
        } else {
            Nodo nodoActual = inicio;

            while (nodoActual.siguiente != null) {
                nodoActual = nodoActual.siguiente;
            }

            nodoActual.siguiente = nuevo;
        }
        cantidad++;
    }

    // IMPRIMIR LA LISTA
    public void imprimir() {
        Nodo nodoActual = inicio;
        System.out.print("Lista: ");

        while (nodoActual != null) {
            System.out.print(nodoActual.dato + " -> ");
            nodoActual = nodoActual.siguiente;
        }

        System.out.println("null");
    }

    // CONTAR LOS NODOS
    public int longitud() {
        return cantidad;
    }

    // ENCONTRAR UN VALOR POR SU POSICION
    public int encontrarEN(int posicion) {
        if (posicion < 0 || posicion >= cantidad) {
            return -1;
        }

        Nodo nodoActual = inicio;

        for (int i = 0; i < posicion; i++) {
            nodoActual = nodoActual.siguiente;
        }

        return nodoActual.dato;
    }

    // CAMBIAR EL VALOR DE UN NODO
    public int cambiarValor(int posicion, int nuevoValor) {
    if (posicion < 0 || posicion >= cantidad) {
        return -1;
    }

    Nodo nodoActual = inicio;

    for (int i = 0; i < posicion; i++) {
        nodoActual = nodoActual.siguiente;
    }

    nodoActual.dato = nuevoValor;
    return 1;
}

    // INSERTAR UN NODO EN UNA POSICION
    public void insert(int posicion, int valor) {
        if (posicion < 0 || posicion > cantidad) {
            System.out.println("Posicion fuera de rango");
            return;
        }

        Nodo nuevo = new Nodo(valor);

        if (posicion == 0) {
            nuevo.siguiente = inicio;
            inicio = nuevo;
        } else {
            Nodo nodoActual = inicio;

            for (int i = 0; i < posicion - 1; i++) {
                nodoActual = nodoActual.siguiente;
            }

            nuevo.siguiente = nodoActual.siguiente;
            nodoActual.siguiente = nuevo;
        }

        cantidad++;
    }
}
}