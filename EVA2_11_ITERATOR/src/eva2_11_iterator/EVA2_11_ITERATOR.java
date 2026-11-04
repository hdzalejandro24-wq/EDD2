/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_11_iterator;
import java.util.LinkedList;
/**
 *
 * @author carpi
 */
public class EVA2_11_ITERATOR {

    /**
     * @param args the command line arguments
     */
 

    public static void main(String[] args) {
        LinkedList<Integer> lista = new LinkedList<>();
        lista.add(100);    
        lista.add(200);
        lista.add(300);
        lista.add(400);
        lista.add(500);
        
        System.out.println(lista);
        
        Iterator <Integer> iterator = lista.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
    
}