/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_6_factorial;

public class EVA2_6_FACTORIAL {

   public static void main(String[] args) {
     
     int resultadoFinal = factorialCiclo(6);
    System.out.println("El factorial de 6 es: " + resultadoFinal);
      
   }
   public static int factorialCiclo (int valor){
   int resu = 1;
   
   for (int i = valor; i >= 1; i--) {
        resu *= i;
    }
   
   return resu;
   
   
   }
   public int factorialRecu(int valor){
       //lo que resuelve del problema 
       //la llamada recursiva
        if (valor == 0 || valor == 1) {
            return 1;
        }
        return valor * factorialRecu(valor - 1);
   }  
}