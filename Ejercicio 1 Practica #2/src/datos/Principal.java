
package datos;

import java.util.Scanner;


public class Principal {
    
    public static void main(String[] args) {
        
        double compra;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite el monto de la compra");
        compra = entrada.nextDouble();
        
        if (compra >= 10000 && compra < 20000){
            compra = (compra - compra * 0.1);
        }
        else if (compra > 20001 && compra <= 50000){
            compra = (compra - compra * 0.3);
        }    
        else if (compra > 50000){
            compra = (compra - compra * 0.5);
        }
        System.out.printf("El monto total despues de aplicar el descuento es de: %f %n", compra);
    }
    
}
