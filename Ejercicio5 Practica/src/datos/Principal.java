
package datos;

import java.util.Scanner;


public class Principal {
    public static void main(String[] args) {
        
        int salarioDiario;
        int diasTrabajados;
        float salarioNormal;
        float salarioNeto;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite su salario diario");
        salarioDiario = entrada.nextInt();
        System.out.println("Digite la cantidad de dias trabajados");
        diasTrabajados = entrada.nextInt();
        salarioNormal = salarioDiario * diasTrabajados;
        salarioNeto = (float) (salarioNormal / 0.25);
        System.out.println("Su salario neto es de: " + salarioNeto);
        
    }
}
