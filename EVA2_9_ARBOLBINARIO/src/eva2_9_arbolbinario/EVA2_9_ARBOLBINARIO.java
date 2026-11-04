/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_9_arbolbinario;

/**
 *
 * @author carpi
 */
public class EVA2_9_ARBOLBINARIO {

    /**
     * /@param args the command line arguments
     */
    public static void main(String[] args) {

        // Agregamos nodos al arbol
        ArbolBinario arbol = new ArbolBinario();

        arbol.agregarNodo(13);
        arbol.agregarNodo(10);
        arbol.agregarNodo(18);
        arbol.agregarNodo(2);
        arbol.agregarNodo(11);
        arbol.agregarNodo(17);
        arbol.agregarNodo(20);
        arbol.agregarNodo(16);

        // Recorrido en preorden
        System.out.println("Recorrido en preorden:");
        arbol.preOrden();
    }
}