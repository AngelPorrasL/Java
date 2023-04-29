
package datos;

import java.util.Scanner;


public class PruebaFecha {
    public static void main(String[] args) {
        
        Fecha fecha = new Fecha(0, 0, 0);
        
        int dia;
        int mes;
        int year;
        
        Scanner entrada = new Scanner(System.in);
        System.out.println("Escriba el dia:");
        dia = entrada.nextInt();
        fecha.setDia(dia);
                
        System.out.println("Escriba el mes:");
        mes = entrada.nextInt();
        fecha.setMes(mes);
        
        System.out.println("Escriba el año");
        year = entrada.nextInt();
        fecha.setYear(year);
        
        fecha.mostrarFecha();
    }
}
