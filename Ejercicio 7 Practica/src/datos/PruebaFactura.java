
package datos;

public class PruebaFactura {
    public static void main(String[] args) {
        
    Factura NumeroPieza = new Factura();
    Factura DescripcionPieza = new Factura();
    Factura CantidadArticulos = new Factura();
    Factura PrecioArticulos = new Factura();
    
    NumeroPieza.numPieza = "25418976";
    DescripcionPieza.descripPieza = "Shampoo";
    CantidadArticulos.cantidadArticulos = "2";
    PrecioArticulos.precioArticulos = "$14";
            
    DescripcionPieza.descripcionP();
    NumeroPieza.numeroP();
    CantidadArticulos.cantidadArt();
    PrecioArticulos.precioArt();
    }
    
}
