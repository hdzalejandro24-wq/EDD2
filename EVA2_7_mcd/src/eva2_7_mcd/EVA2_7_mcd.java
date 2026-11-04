/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_7_mcd;

/**
 *
 * @author carpi
 */
public class EVA2_7_mcd {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int dividendo = 120;
        int divisor = 5;
        int resu = mcd (dividendo, divisor);
        
        
        System.out.println("El mcd de " + dividendo + "Y" + divisor + "es:" + resu);
    }
    public static int mcd (int dividendo, int divisor){
        if (divisor == 0){
            return dividendo;
        }
        int residuo = dividendo % divisor;
        return mcd (divisor, residuo);
    }
}
