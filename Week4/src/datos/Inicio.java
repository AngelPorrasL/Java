
package datos;

import java.util.Scanner;


public class Inicio {
    
    public static void main(String[] args) {
        
        //Siempre que necesite usar una clase necesito un objeto
        //Scanner entrada = new Scanner(System.in);
        
        //Hay una diferencia como la variables es estatica no es necesario llamar al objeto
        ClaseStatic.numero1 = 100;
        
        ClaseStatic.numero1 = 101;
        
        ClaseSinStatic objetoparalaclase = new ClaseSinStatic();
        objetoparalaclase.llamar();
        
       
        
        
    }
    
}
