/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva3_2_busqueda_binaria;
import java.util.Scanner;
/**
 *
 * @author carpi
 */
public class EVA3_2_BUSQUEDA_BINARIA {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        // TODO code application logic here}
        int[] arreglo = new int [10];
        llenar(arreglo);
         System.out.println("********ARREGLO ORIGINAL");
         imprimir(arreglo);
         selectionSort(arreglo);
         System.out.println("********ARREGLO ORDENADO");
         imprimir(arreglo);
         Scanner captu = new Scanner(System.in);
          System.out.println("¿Que valor buscas");
         int valor = captu.nextInt();
         System.out.println("¿Que Valor en la posicion :" + busquedaBinaria(arreglo, valor ));
         
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
    public static void selectionSort(int[] arreglo) {
        for (int i = 0; i < arreglo.length; i++) {
            int min = i;
            for (int j = i + 1; j < arreglo.length; j++) {
                // BUSCO EL MAS PEQUEÑO
                if (arreglo[min] > arreglo[j]) {
                    min = j;
                
                }
            }
        }
    }
    
    
        //BUSQUEDA BINARIA
        public static int busquedaBinaria(int[] arreglo, int valor){
            return busquedaBinariaRecu(arreglo,  valor, 0, arreglo.length -1);
        }
        
        private static int busquedaBinariaRecu(int[] arreglo, int valor, int ini, int fin){
        int mitad = ini +((fin -ini ) /2);
        int posicion = -1; //indica que no se encontro
        if(ini <= fin){//detener recursividad 
            //busqueda binaria
            if (valor > arreglo[mitad]) //NO LO ENCONTRAMOS, BUSCAMOS A LA DERECHA
                posicion = busquedaBinariaRecu(arreglo, valor, mitad + 1, fin);
            else if(valor < arreglo[mitad])//NO LO ENCONTRAMOS BUSCAMOS A LA IZQUIERDA
                posicion = busquedaBinariaRecu(arreglo, valor, mitad - 1, fin);
            else // LO ENCONTRAMOS
                posicion = mitad;
        }
        return posicion;
            
           
        }
    }


        
   
        
        
