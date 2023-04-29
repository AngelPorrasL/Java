
package datos;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        
        int nota1;
        int nota2;
        int nota3;
        int promedio; 
        int finalprom;
        
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite la primer nota");
        nota1 = entrada.nextInt();
        System.out.println("Digite la segunda nota");
        nota2 = entrada.nextInt();
        System.out.println("Digite la tercer nota");
        nota3 = entrada.nextInt();
        promedio = nota1 + nota2 + nota3;
        finalprom = promedio/3;
        System.out.println("El promedio de sus notas es de: " + finalprom);
        
    }
}
