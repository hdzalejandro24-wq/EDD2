/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_8_fibonacci;

/**
 *
 * @author carpi
 */
public class EVA2_8_FIBONACCI {

    /**
     /* @param args the command line arguments
     */
    public class Fibonacci {
    }
    public static void main(String[] args) {
        // TODO code application logic here
  
    int posicion = 7;
    int resultado = fibonacci(posicion);

     System.out.println("El valor es:" + resultado);
    }
    
    public static int fibonacci(int posicion){
    if (posicion == 0) {
        return 1;
    }
    if (posicion == 1){
        return 1;
    }
    int resultado = fibonacci(posicion -1) + fibonacci (posicion -2);
    return resultado;
     }
    
}
