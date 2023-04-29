
package datos;

public class Factura {
    
    public String numPieza;
    public String descripPieza;
    public String cantidadArticulos;
    public String precioArticulos;
    
    
    public void numeroP (){
        System.out.println("Numero de pieza: " + numPieza);
    }
    public void descripcionP (){
        System.out.println("Descripcion: " + descripPieza);
    }
    public void cantidadArt(){
        System.out.println("Cantidad del producto: " + cantidadArticulos);
    }
    public void precioArt(){
        System.out.println("Precio: " + precioArticulos);
    }   
}
