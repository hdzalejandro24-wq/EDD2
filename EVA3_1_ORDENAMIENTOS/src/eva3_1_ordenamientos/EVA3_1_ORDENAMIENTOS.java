/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva3_1_ordenamientos;

/**
 *
 * @author carpi
 */
public class EVA3_1_ORDENAMIENTOS {

    public static void main(String[] args) {

        int[] original, selection, bubble, quick;
        original = new int[10];
        llenar(original);
        // ARREGLO ORIGINAL
        System.out.println("++++++++ ORIGINAL ++++++++");
        imprimir(original);
        // SELECTION SORT
        System.out.println("++++++++ SELECTION SORT ++++++++");
        selection = copiar(original);
        long ini = System.nanoTime();
        selectionSort(selection);
        long fin = System.nanoTime();
        imprimir(selection);
        long tiempo = fin - ini;
        System.out.println("Selection Sort = " + tiempo);
        
        
        
        
        
        // BUBBLE SORT
        System.out.println("++++++++ BUBBLE SORT ++++++++");
        bubble = copiar(original);
        ini = System.nanoTime();
        bubbleSort(bubble);
        fin = System.nanoTime();
        imprimir(bubble);
        tiempo = fin - ini;
        System.out.println("Bubble Sort = " + tiempo);

        // QUICK SORT
        System.out.println("++++++++ QUICK SORT ++++++++");
        quick = copiar(original);
        ini = System.nanoTime();
        quickSort(quick);
        fin = System.nanoTime();
        imprimir(quick);
        tiempo = fin - ini;
        System.out.println("Quick Sort = " + tiempo);
    }
    public static void llenar(int[] arreglo) {
        for (int i = 0; i < 10; i++) {
            arreglo[i] = (int) (Math.random() * 100);
        }
    }
    public static void imprimir(int[] arreglo) {
        for (int i = 0; i < arreglo.length; i++) {
            System.out.print("[" + arreglo[i] + "]");
        }
        System.out.println("");
    }
    public static int[] copiar(int[] arreglo) {
        int[] resu = new int[arreglo.length];
        for (int i = 0; i < arreglo.length; i++) {
            resu[i] = arreglo[i];
        }
        return resu;
    }

    // SELECTION SORT
    // O(N2)
    public static void selectionSort(int[] arreglo) {
        for (int i = 0; i < arreglo.length; i++) {
            int min = i;
            for (int j = i + 1; j < arreglo.length; j++) {
                // BUSCO EL MAS PEQUEÑO
                if (arreglo[min] > arreglo[j]) {
                    min = j;
                }
            }            // INTERCAMBIO
            int temp = arreglo[min];
            arreglo[min] = arreglo[i];
            arreglo[i] = temp;
        }
    }
    // SWAP
    public static void swap(int[] arreglo, int i, int j) {
        int temp = arreglo[i];
        arreglo[i] = arreglo[j];
        arreglo[j] = temp;
    }// BUBBLE SORT
    public static void bubbleSort(int[] arreglo) {
        for (int i = 0; i < arreglo.length - 1; i++) {
            for (int j = 0; j < arreglo.length - 1 - i; j++) {
                if (arreglo[j] > arreglo[j + 1]) {
                    int temp = arreglo[j];
                    arreglo[j] = arreglo[j + 1];
                    arreglo[j + 1] = temp;
                }
            }
        }
    }
    // QUICK SORT
    public static void quickSort(int[] arreglo) {
        quickSortRec(arreglo, 0, arreglo.length - 1);
    }
    private static void quickSortRec(int[] arreglo, int ini, int fin) {
        if (ini < fin) {
            int pivote = arreglo[fin];
            int i = ini - 1;
            for (int j = ini; j < fin; j++) {
                if (arreglo[j] <= pivote) {
                    i++;
                    swap(arreglo, i, j);
                }
            }

            swap(arreglo, i + 1, fin);
            int pos = i + 1;
            quickSortRec(arreglo, ini, pos - 1);
            quickSortRec(arreglo, pos + 1, fin);
        }
    }
}
//ELEGIR EL PIVOTE (DIAPOSITIVAS --> PRIMER ELEMENTO)
//DOS INDICES
//TOO_BIG --> CICLO QUE VA HACIA ADELANTE
//BUSCA LOS MAS GRANDES DEL PIVOTE


// TOO_SMALL --> CICLO RETROCEDE
//BUSCA LOS MAS PEQUEÑOS DEL PIVOTE

//SI NO SE HAN CRUZADO (TOO_BIG < TOO SMALL) SE INTECAMBIAN 
// SE REPORTE TODO EL PROCESO
// SI SE HAN CRUZADO
//INTERCAMBIAR PIVOTE CON TOO_SMALL
//TOO_SMALL ES EL NUEVOM PIVOTE
//LAMADAS RECURSIVAS A CADA PARTE IZQ Y DER DEL PIVOTE
//quickSortRec(arreglo, ini, pivote-1); //IZQ
//quickSortRec(arreglo, pivote +1, fin); //DER 
        

            
           


                   
    




