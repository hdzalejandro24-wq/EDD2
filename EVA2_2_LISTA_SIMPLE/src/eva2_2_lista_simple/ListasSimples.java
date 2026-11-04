package eva2_2_lista_simple;

/**
 *
 * @author carpi
 */

//public class EVA2_2_LISTA_SIMPLE {

    // ListaSimple lista = new ListaSimple();
    // int[] arreglo = new int[100000];

    // long ini, fin, tiempo;

    // ARREGLO
    // ini = System.nanoTime();

    // for (int i = 0; i < arreglo.length; i++) {
    //     arreglo[i] = (int)(Math.random() * 100);
    // }

    // fin = System.nanoTime();
    // tiempo = fin - ini;

    // System.out.println("Tiempo arreglo = " + tiempo);


    // LISTA SIMPLE
    // ini = System.nanoTime();

    // for (int i = 0; i < arreglo.length; i++) {
    //     lista.add((int)(Math.random() * 100));
    // }

    // fin = System.nanoTime();
    // tiempo = fin - ini;

    // System.out.println("Tiempo Lista = " + tiempo);


public class ListasSimples  {

    public static void main(String[] args) {

       ListasSimples lista = new ListasSimples();
       int[] arreglo = new int[1000000];

        long ini, fin, tiempo;

        ini = System.nanoTime();

        // O(N)
        for (int i = 0; i < 100000; i++) {
            lista.agregar((int)(Math.random() * 100));
        }

        fin = System.nanoTime();
        tiempo = fin - ini;

        System.out.println("TIEMPO LISTA = " + tiempo);

        System.out.println("Longitud de la lista = " + lista.longitud());

        lista.agregar(100);
        lista.agregar(200);
        lista.agregar(300);
        lista.agregar(400);
        lista.agregar(500);

        lista.imprimir();

        System.out.println("Longitud de la lista = " + lista.longitud());
    }

    private String longitud() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    private void agregar(int i) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    private void imprimir() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}
