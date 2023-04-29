
package datos;


public class ClaseSinStatic {
    public int numero2;
    
    //Metodos
    public void llamar(){
        ClaseStatic.numero1 = 102;
        System.out.println(ClaseStatic.numero1);
    }
}
