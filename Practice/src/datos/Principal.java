
package datos;

import java.util.Scanner;


public class Principal {
    public static void main(String[] args) {
        
        int x;
        int y;
        int z;
        int resultado;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Asigne un numero a x");
        x = entrada.nextInt();
        System.out.println("Asigne un numero a y");
        z = entrada.nextInt();
        System.out.println("Asigne un numero a z");
        y = entrada.nextInt();
        resultado = x * y * z;
        
        System.out.printf("Valor de x: %d %n", x);
        System.out.printf("Valor de y: %d %n", y);
        System.out.printf("Valor de z: %d %n", z);
        System.out.printf("El producto es: %s %n", resultado);
        
         
        
    }
}
