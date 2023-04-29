
package datos;

import java.util.Scanner;


public class Principal {
    public static void main(String Args[]){
       
        int N;
        int fin = 0;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese un numero al que desee realizarle una suma de los numeros naturales anteriores:");
        N = entrada.nextInt();
      
        if(N > 0){
            for(int i = 1; i <= N; i++){
                fin = fin + i;
        }
            System.out.println("El valor total de la suma es de: " + fin);
        }
   }
}