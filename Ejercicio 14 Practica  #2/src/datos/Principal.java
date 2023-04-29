
package datos;

import java.util.Scanner;


public class Principal {
    public static void main(String[] args) {
        
        int altura;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Escriba la altura de la escalera de numeros");
        altura = entrada.nextInt();

        for (int numero=1;numero<=altura;numero++){
            
            for(int i = 1; i <= numero; i++){
                System.out.print(i);
            }
            System.out.println("");
        }
    }
}
