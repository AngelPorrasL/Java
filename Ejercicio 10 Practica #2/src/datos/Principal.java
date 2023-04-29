
package datos;

import java.util.Scanner;


public class Principal {
    public static void main(String[] args) {
        
        int cantInvertir;
        double intAnual;
        int yearsInvertir;
        int capital;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite la cantidad que quiere invertir:");
        cantInvertir = entrada.nextInt();
        System.out.println("Digite el interes anual que desea:");
        intAnual = entrada.nextDouble();
        System.out.println("Digite la cantidad de años que desea invertir:");
        yearsInvertir = entrada.nextInt();
        
        capital = (int) (cantInvertir / intAnual * yearsInvertir);
        
        System.out.println("El capital de la inversion hecha por los años escritos es de: "+ capital);
    }
}
