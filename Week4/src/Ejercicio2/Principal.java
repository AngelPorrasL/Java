
package Ejercicio2;

import java.util.Scanner;

public class Principal {
    
    
    //Le voy a crear un metodo main
    public static void main(String[] args) {
        
        System.out.print("hola \t");
        System.out.println("Hola");
        String nombre = "Ronald";
        int edad = 12;
        System.out.printf("Hola como esta tengo %d años y me llamo %s %n",edad,nombre);
        System.out.println("Hola como esta tengo "+edad+" y me llamo "+nombre);
        
        int numero1 = 1;
        int numero2 = 2;
        //Si queremos crear un objeto necesitamos isntanciarlo, osea crear el objeto
        Scanner datos = new Scanner(System.in);
        System.out.println("Digite el valor de numeor 1");
        //numero1 = datos.nextInt();
        System.out.println("Digite el valor de numero 2");
        //numero2 = datos.nextInt();
        
        if (numero1 == 1 || numero2 == 2){
            System.out.println("Numero 1 es mayor que numero 2");
            System.out.println("pertenece al if");
            System.out.println("pertenece al if");
            System.out.println("pertenece al if");
            System.out.println("pertenece al if");
            System.out.println("pertenece al if");
            System.out.println("pertenece al if"); 
        }else{
            System.out.println("Caso contrario");
        }
        
        if (true) {
            if (true) {
                if (true) {
                    if (true) {
                        
                    }
                }
            }
        }
            
        System.out.println("Digite el dia de la semana y yo se lo digo en palabras osea 1 y es lunes");
        
        String diasemana = "";
        //diasemana = datos.next();
        
        switch (diasemana) {
            case "lunes":
                System.out.println("Hoy es lunes");
                break;
            case "martes":
                System.out.println("Hoy es martes");
                break; 
            case "Miercoles":
                System.out.println("Hoy es Miercoles");
                break;
            case "Jueves":
                System.out.println("Hoy es jueves");
                break;
            default:
                System.out.println("te dije que era de 1 a 7");
        }
        
        System.out.println("Digite la califiacicion");
        
        System.out.println("Hola digite su nota de 1 a 10");
        int nota = datos.nextInt();
        
        switch (nota) {
            case 10,9:
                System.out.println("Tiene un A");
                break;
            case 8:
            case 7:
            case 6:
                System.out.println("Tiene una B");
              break;
            default:
                System.out.println("no tiene");
        }
       
        if (nota == 10 || nota == 9) {
            System.out.println("Tiene una A");
        }else if (nota == 8 || nota == 7|| nota == 6) {
            System.out.println("Tiene una b");
        }else{
            System.out.println("No tiene");
        }
        
        
        
        

        
    }
}
