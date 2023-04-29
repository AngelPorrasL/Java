
package Datos;

import java.util.Scanner;


public class Principal {
    public static void main(String[] args) {
        
        int variable1;
        int variable2;
        int resultadoSuma;
        int resultadoResta;
        int resultadoMulti;
        int resultadoDiv;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite el valor de la primera variable");
        variable1 = entrada.nextInt();
        System.out.println("Digite el valor de la segunda variable");
        variable2 = entrada.nextInt();
        resultadoSuma = variable1 + variable2;
        resultadoResta = variable1 - variable2;
        resultadoMulti = variable1 * variable2;
        resultadoDiv = variable1 / variable2;
                
        System.out.println("El resultado de la suma es: " + resultadoSuma);
        System.out.println("EL resultado de la resta es: " + resultadoResta);
        System.out.println("EL resultado de la multiplicacion es: " + resultadoMulti);
        System.out.println("EL resultado de la division es: " + resultadoDiv);
        
    }
}
