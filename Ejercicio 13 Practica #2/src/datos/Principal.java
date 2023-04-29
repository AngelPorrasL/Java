
package datos;

import java.util.Scanner;


public class Principal {
    public static void main(String[] args) {
        
        int notas;
        int prom;
        int promFinal;
        String pregunta = "S";
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese su nota");
        notas = entrada.nextInt();
        
        
        
        
        prom = notas + notas;
        promFinal = prom / 3;
                
        System.out.println("EL promedio final de las notas ingresadas es de: "+ notas);
        
    }
}
