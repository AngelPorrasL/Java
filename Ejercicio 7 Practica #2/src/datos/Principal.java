
package datos;

import java.util.Scanner;


public class Principal {
    public static void main(String[] args) {
        
        int num;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese el numero que desee: ");
        num = entrada.nextInt();
        
        while (num != 0) {
            
            if (num > 0) {
                System.out.println("El numero ingresado es positivo");
                break;
            }
            else {
                System.out.println("El numero ingresado es negativo");
                break;
            }
        }
    }
}
