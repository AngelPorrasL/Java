
package inicio;

import datos.Informacion;

public class Principal {
    
    public static void main(String[] args) {
        
      Informacion Angel = new Informacion();
      Informacion PorrasLoaiza = new Informacion();
      Informacion ID = new Informacion();
      Informacion IBAN = new Informacion();
      Informacion nombreB = new Informacion();
      Informacion correo = new Informacion();
      Informacion recidencia = new Informacion();
      
      Angel.nombre = "Angel";
      PorrasLoaiza.apellidos = "Porras Loaiza";
      ID.identificacion = "1-1901-0953";
      IBAN.iban = "356876743657";
      nombreB.nombrebanco = "El Banco Nacional";
      correo.correo  = "angelporras543@outlook.com";
      recidencia.residencia = "Junquillo Arriba";
         
      Angel.informacion();
      PorrasLoaiza.infoApellidos();
      ID.infoID();
      IBAN.infoIBAN();
      nombreB.infoBanco();
      correo.infoCorreo();
      recidencia.infoRecidencia();  
    }
      
}
