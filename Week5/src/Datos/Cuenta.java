
package Datos;




public class Cuenta {
    
    //Atributos
    private double saldoCliente;
     private String nombre;
     private String contrasenna;
     private int DNI;
    
     //Constructor
     public Cuenta(double saldoCliente, String nombre, String contrasenna, int DNI){
         if (saldoCliente < 0) {
             this.saldoCliente = 0;
         }else{
         this.saldoCliente = saldoCliente;
         }
         this.nombre = nombre;
         this.contrasenna = contrasenna;
         this.DNI = DNI;
     }
     
     public Cuenta(double SaldoCliente){
         this.saldoCliente = saldoCliente;
     }
     
     public Cuenta(){
         saludar();
     }
    
    //Getter Setter
    //Obtener Establecer
    //Estructura de un metodo 
    //Encapsulamiento / Tipo de metodo / nombre /Parametros
   /*
    public void setsaldoCliente(double saldoCliente){
        if (saldoCliente > 0) {
           this.saldoCliente = saldoCliente; 
            System.out.println("Saldo ingresado");
        }else{
            System.out.println("No se puede ingresar numeros negativos");
        }
    }//Fin del metodo setsaldoCliente
    
    public double getsaldoCliente(){
        return saldoCliente;
    }
*/

    public double getSaldoCliente() {
        return saldoCliente;
    }

    public void setSaldoCliente(double saldoCliente) {
        if (saldoCliente > 0) {
            this.saldoCliente = saldoCliente;
            System.out.println("SAlgo ingresado");
        }else{
            System.out.println("No se puede ingresar negativos");
        }
        
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getContrasenna() {
        return contrasenna;
    }

    public void setContrasenna(String contrasenna) {
        this.contrasenna = contrasenna;
    }

    public int getDNI() {
        return DNI;
    }

    public void setDNI(int DNI) {
        this.DNI = DNI;
    }
    
    public void retirar(double saldoretirar){
        if (saldoretirar > saldoCliente) {
            System.out.println("Fondos insuficientes");
        }else{
            saldoCliente = saldoCliente - saldoretirar;
            System.out.println("su saldo actual es de " + saldoCliente);
        }
    }
    
    public void saludar(){
        System.out.println("Hola");
    }

    
    
    
    
    
    
}//Fin de la clase
