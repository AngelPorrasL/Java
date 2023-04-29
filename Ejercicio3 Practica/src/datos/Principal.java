package datos;

import java.util.Scanner;


public class Principal {
    public static void main(String[] args) {
        
        int base;
        int altura;
        int resultado;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite la base del rectangulo");
        base = entrada.nextInt();
        System.out.println("Digite la altura del rectangulo");
        altura = entrada.nextInt();
        resultado = base * altura;
        System.out.println("El area del rectangulo es de: " + resultado);
        
    }
    
}
