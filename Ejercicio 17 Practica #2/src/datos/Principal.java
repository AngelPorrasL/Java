
package datos;

import java.util.Scanner;


public class Principal {
    public static void main(String[] args) {
        
        int antiguedad;
        double sueldo;
        int bonoAntiguedad = 0;
        int bonoSueldo = 0;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese su antiguedad en la empresa");
        antiguedad = entrada.nextInt();
        System.out.println("Ingrese su sueldo");
        sueldo = entrada.nextDouble();
        
        if (antiguedad > 2) {
            bonoAntiguedad = (int) (sueldo * 0.2);
        }
        else if (antiguedad >= 5) {
            bonoAntiguedad = (int) (sueldo * 0.3);
        }
        
        
        if (sueldo < 1000) {
            bonoSueldo = (int) (sueldo * 0.25);
        }
        else if (sueldo <= 3500) {
            bonoSueldo = (int) (sueldo * 0.15);
        }
        else if (sueldo > 3500) {
            bonoSueldo = (int) (sueldo * 0.10);       
        }
        
        
        if (bonoAntiguedad > bonoSueldo) {
            System.out.println("Su parte correspondiente del bono de antiguedad es de: $"+ bonoAntiguedad);
        }
        else if (bonoAntiguedad < bonoSueldo) {
            System.out.println("Su parte correspondiente del bono por sueldo es de: $"+ bonoSueldo);
        }
    }
}
