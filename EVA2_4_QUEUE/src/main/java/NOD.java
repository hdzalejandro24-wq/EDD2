/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author carpi
 */
public class NOD {
    
public class Nodo {
    
    private int valor;
    private Nodo siguente;
    private Nodo previo;
    

    public Nodo() {
        siguente = null;
        previo = null;
    }
    
    public Nodo(int dato) {
        this.valor = dato;
        siguente = null;
    }

    public Nodo getPrevio() {
        return previo;
    }
    
   
    public int getDato() {
        return valor;
    }

    public Nodo getSiguente() {
        return siguente;
    }

    public void setDato(int dato) {
        this.valor = dato;
    }

    public void setSiguente(Nodo siguente) {
        this.siguente = siguente;
    }

    public void setPrevio(Nodo previo) {
        this.previo = previo;
    }
    
    
    
    
}

}
