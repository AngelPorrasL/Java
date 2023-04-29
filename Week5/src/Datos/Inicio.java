
package Datos;

import java.util.Scanner;


public class Inicio {
    
    public static void main(String[] args) {
        
        
        Cuenta juan = new Cuenta();
        
        
        //Instanciamos la clase osea creamos el objeto
        Scanner entrada = new Scanner(System.in);
        System.out.println("Por favor digite el saldo");
        double saldo = entrada.nextDouble();
        System.out.println("Por favor digite el nombre");
        String nombre = entrada.next();
        System.out.println("Por favor digite el contraseña");
        String contrasenna = entrada.next();
        System.out.println("Por favor digite el DNI");
        int DNI = entrada.nextInt();
       

        Cuenta ronald = new Cuenta(saldo, nombre, contrasenna, DNI);
        
        System.out.println(ronald.getNombre());
       
        Cuenta nayeli = new Cuenta(100);
      
       
       
    }
    
}
