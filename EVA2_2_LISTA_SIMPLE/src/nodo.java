/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author carpi
 */
public class nodo {

    // ATRIBUTOS
    private int valor;
    private nodo siguiente;

    // CONSTRUCTORES
    // Es importante que siguiente se inicialice en null

    public nodo() {
        siguiente = null;
    }

    public nodo(int valor) {
        this.valor = valor;
        siguiente = null;
    }

    // GET
    public int getValor() {
        return valor;
    }

    public nodo getSiguiente() {
        return siguiente;
    }

    // SET
    public void setValor(int valor) {
        this.valor = valor;
    }

    public void setSiguiente(nodo siguiente) {
        this.siguiente = siguiente;
    }
}
