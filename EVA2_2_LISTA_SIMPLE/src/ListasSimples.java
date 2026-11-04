/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author carpi
 */
    public class ListasSimples {

    private nodo inicio;
    private nodo fin;

    public ListasSimples() {
        inicio = null;
              fin = null;
    }    // SIEMPRE EL COMPORTAMIENTO POR DEFAULT ES AGREGAR UN NODO
    // AL FINAL DE LA LISTA
    // O(1)
    public void agregar(int valor) {
        nodo nuevo = new nodo(valor);
        if (inicio == null) {
            inicio = nuevo;
            fin = nuevo;
        } else {
            fin.setSiguiente(nuevo);
            fin = nuevo;
        }
    }
    // O(n)
    public void imprimir() {
        nodo temp = inicio;
        while (temp != null) {
            System.out.print("[ " + temp.getValor() + " ] -> ");
            temp = temp.getSiguiente();
        }

        System.out.println("null");
    }

    // O(n)
    public int longitud() {
        int cont = 0;
        nodo temp = inicio;
        while (temp != null) {
            cont++;
            temp = temp.getSiguiente();
        }
        return cont;
    }
    // O(1)
    public boolean listaVacia() {
        if (inicio == null) {
            return true;
        } else {
            return false;
        }
    }

    // O(1)
    public void vaciarLista() {
        inicio = null;
        fin = null;
    }
    // Empieza en posicion 0
    // Ultima es longitud (n) - 1
    // O(n)
      public int encontrarEn(int posicion) {
      nodo temp = inicio;
    for (int i = 0; i < posicion; i++) {
        temp = temp.getSiguiente();
    }
    return temp.getValor();
}

     public void insertar (int x, int posicion);{
    nodo nuevo = new nodo (x);
     if(posicion == 0) {
     nuevo.setSiguiente(inicio);
     inicio = nuevo;
     } else {
     nodo temp = inicio;
     for (int i = 0; i < posicion -1; i++) {
     temp = temp.getSiguiente();
}
     nuevo.setSiguiente(temp.getSiguiente());
     temp.setSiguiente(nuevo);

}
    }
    }

    
    