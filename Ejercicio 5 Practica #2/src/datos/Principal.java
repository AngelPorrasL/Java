
package datos;

import java.util.Scanner;


public class Principal {
    public static void main(String[] args) {
        
        String tipoM;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Escriba su tipo de membresia: A, B o C ");
        tipoM = entrada.nextLine();
        
        if ("A".equals(tipoM)){
            System.out.println("Su descuento es de: 10%");
        }
        else if ("B".equals(tipoM)){
            System.out.println("Su descuento es de: 20%");
        }
        else if ("C".equals(tipoM)){
            System.out.println("Su descuento es de: 40%");
        }       
    }
}
