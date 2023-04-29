
package datos;

import java.util.Scanner;


public class Principal {
    public static void main(String[] args) {
        
        String nombre;
        String apellido;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Escriba su nombre");
        nombre = entrada.nextLine();
        System.out.println("Escriba su apellido");
        apellido = entrada.nextLine();
        System.out.println("Hola "+ nombre + apellido + " bienvenido al sistema!");
        
        
        
        
    }
}
