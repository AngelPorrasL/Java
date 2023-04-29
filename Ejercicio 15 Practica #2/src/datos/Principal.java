
package datos;

import java.util.Scanner;


public class Principal {
    public static void main(String[] args) {
        
        int altura;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite la altura de la piramide de asteriscos");
        altura = entrada.nextInt();
 
        for (int numEspacios = altura, numAsteriscos = 1; numAsteriscos <= (altura*2)-1; numEspacios --, numAsteriscos += 2){
            
            for (int i = 0; i < numEspacios; i++){
                System.out.print(" ");
            }
            for (int x = numAsteriscos; x !=0; x--){
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
