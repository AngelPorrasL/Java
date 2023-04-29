package Principal;

public class Inicio {

    //Metodo main
    public static void main(String[] args) {
        //Instanciar una clase para crear los objetos
        personas Raul = new personas(); 
        personas Juan = new personas(); 
        personas Maria = new personas(); 
        personas Nayeli = new personas(); 
        personas Yirgrin = new personas(); 
        personas Sebastian = new personas(); 
        personas Luis = new personas(); 
        
        Raul.nombre = "Raul";
        Juan.nombre = "Juan Rafael";
        Maria.nombre = "Maria José";
        Luis.nombre = "Luis";
        Maria.saludar();
        Raul.saludar();
        Luis.saludar();
        
        
    }
    
}
