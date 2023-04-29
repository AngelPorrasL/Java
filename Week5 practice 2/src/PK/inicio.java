
package PK;


public class inicio {
    
    
    public static void main(String[] args) {
        try {
            int resultado = 100/2;
            System.out.println(resultado);
            int[] numero = {1,2,3};
            
            
            int[] datos = new int[4];
            datos[0] = 100;
            datos[1] = 100;
            datos[2] = 100;
            datos[3] = 100;
            
            
            
            System.out.println(numero[100]);
            
        } catch (ArithmeticException e) {
            System.out.println("ocurrio un error favor verificar los datos");
        }catch(Exception e){
            System.out.println("Ocurrio un problema");
        }
        finally{
            System.out.println("gracias por utilizar los servicios de software");
        }
        
        
    }
    
    
    
}
