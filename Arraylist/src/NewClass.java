
import java.util.ArrayList;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author steven
 */
public class NewClass {
    public static void main(String[] args) {
        ArrayList<String> lista = new ArrayList<String>();
        
        lista.add("Ronald");
        lista.add("Stiven");
        
        for (int i = 0; i < lista.size(); i++) {
            System.out.println(lista.get(i));
        }
        
        
    }
}
