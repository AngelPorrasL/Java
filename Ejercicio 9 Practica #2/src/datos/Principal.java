
package datos;

import java.util.Scanner;


public class Principal {
    public static void main(String[] args) {
        
        int first;
        int second;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese el primer año");
        first = entrada.nextInt();
        System.out.println("Ingrese el segundo año");
        second = entrada.nextInt();
        
       for (int i = first; i < second; i++) {
           
            while (first != second) {
                
                if (first > second) {
                    System.out.println("El primer año no puede ser mayor al segundo");
                    break;
                }
                else {
                    System.out.println(i);
                    break;
                }
            }
       }
    }
}
