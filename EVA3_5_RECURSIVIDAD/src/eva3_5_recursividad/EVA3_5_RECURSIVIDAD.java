/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva3_5_recursividad;

/**
 *
 * @author carpi
 */
public class EVA3_5_RECURSIVIDAD {




   public static void main(String[] args) {
      
   }
   public static void imprimirInvCiclo(int valor){
      for (int i = valor; i >= 1; i--){
         System.out.println(i + " - ");
      }
      System.out.println("");
   
   }
   public static void imprimirInvRec(int valor){
      if(valor >= 1){
      System.out.println(valor + " - ");
      imprimirInvRec(valor - 1 );
      }   
   }
}

   

   

