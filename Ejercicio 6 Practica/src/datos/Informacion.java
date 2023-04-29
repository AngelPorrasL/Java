
package datos;

public class Informacion {
    
    public String nombre;
    public String apellidos;
    public String identificacion;
    public String iban;
    public String nombrebanco;
    public String correo; 
    public String residencia;
    
   
    
   public void informacion(){
       System.out.println("Mi nombre es: "+ nombre);
   } 
   public void infoApellidos(){
        System.out.println("Mis apellidos son: " + apellidos);
   }
   public void infoID(){
       System.out.println("Mi identificacion es: " + identificacion);
   }
   public void infoIBAN(){
       System.out.println("Mi cuenta IBAN es: " + iban );
   }
   public void infoBanco(){
       System.out.println("Mi banco preferencial es: " + nombrebanco);
   }
   public void infoCorreo(){
       System.out.println("Mi correo es: " + correo);
   }
   public void infoRecidencia(){
       System.out.println("Mi lugar de residencia es: " + residencia);
   }
   
}

