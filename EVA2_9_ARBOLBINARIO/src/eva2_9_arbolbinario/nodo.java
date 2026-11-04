/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


package eva2_9_arbolbinario;



public class Nodo {
    int valor;
    Nodo izquierda;
    Nodo derecha;

    public Nodo() {
        this.derecha = null;
        this.izquierda = null;
    }

    public Nodo(int valor) {//PONER EL VALOR A GUARDAR
        this.valor = valor;
        this.izquierda = null;
        this.derecha = null;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public Nodo getIzquierda() {
        return izquierda;
    }

    public void setIzquierda(Nodo izquierda) {
        this.izquierda = izquierda;
    }

    public Nodo getDerecha() {
        return derecha;
    }

    public void setDerecha(Nodo derecha) {
        this.derecha = derecha;
    }
}


