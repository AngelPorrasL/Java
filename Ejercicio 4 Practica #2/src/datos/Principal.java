
package datos;

import java.util.Scanner;


public class Principal {
    
    public static void main(String[] args) {
      
        double numArt;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite la cantidad de articulos comprados:");
        numArt = entrada.nextDouble();
        
        if (numArt >= 1 && numArt <20){
            numArt = (numArt - numArt * 0.15);
        }
        else if (numArt >= 20){
            numArt = (numArt - numArt * 0.2);
        }
        System.out.println("El descuento obtenido es de: "+ numArt);
    }
}
