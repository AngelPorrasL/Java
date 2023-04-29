
package datos;

import java.util.Scanner;


public class Principal {
    public static void main(String[] args) {
        
        int alumnos;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Escriba la cantidad de alumnos que van a ir al viaje");
        alumnos = entrada.nextInt();
        
        if (alumnos < 30) {
            System.out.println("El costo de la renta del autobus es de $4000 en general");
        }
        else if (alumnos <= 49) {
            System.out.println("El costo de viaje por cada alumnos es de $95");
        }
        else if (alumnos <= 99) {
            System.out.println("El costo de viaje por cada alumnos es de $70");
        }
        else if (alumnos >= 100) {
            System.out.println("El costo de viaje por cada alumnos es de $65");
        }
    }
}
