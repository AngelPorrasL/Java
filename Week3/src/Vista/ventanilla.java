
package Vista;

import Controlador.Cuenta;
import java.util.Scanner;


public class ventanilla {
    public static void main(String[] args){
        
       /* 
        Cuenta jason = new Cuenta();
        jason.nombre = "Jason Darian";
        jason.Identificacion = "1111111111";
        jason.correo = "j@kdhbfkjda";
        jason.saldo = 1000;
        jason.pin = 1234;
        
        Cuenta stive = new Cuenta();
        stive.nombre = "Stiven";
        
         */
       Scanner entrada = new Scanner(System.in);
        
       Cuenta rashid = new Cuenta();
       rashid.nombre = entrada.nextLine();
       System.out.println(rashid.nombre);
        
        
    }
    
}
