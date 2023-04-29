
package datos;

import java.util.Scanner;


public class Principal {
    public static void main(String[] args) {
        
        int edad;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite su edad");
        edad = entrada.nextInt();
        
        if (edad < 4) {
            System.out.println("Su entrada al establecimiento es gratis");
        }
        else if (edad <= 9) {
            System.out.println("El precio de su entrada es de $5");
        }
        else if (edad <= 15) {
            System.out.println("EL precio de su entrada es de $7");
        }
        else if (edad <= 18) {
            System.out.println("El precio de su entrada es de $10");
        }
    }
}
