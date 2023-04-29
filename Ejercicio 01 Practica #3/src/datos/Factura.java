
package datos;


public class Factura {
    
    private String numPieza;
    private String descPieza;
    private int cantArt;
    private double precioArt;
    
    public Factura(String numPieza, String descPieza, int cantArt, double precioArt, String numPieza1, String descPieza1) {
        this.numPieza = numPieza;
        this.descPieza = descPieza;
        this.cantArt = cantArt;
        this.precioArt = precioArt;
        
        int CantArti = 0;
        if(CantArti > 0)
        {
            cantArt = CantArti;
        }
        double PrecioArti = 0;
        if(PrecioArti > 0.0)
        {
            precioArt = PrecioArti;
        }
    }
    
    public void setNumPieza(String numPieza1) {
        this.numPieza = numPieza1;
    }
    public String getNumPieza() {
        return numPieza;
    }
    public void setDescPieza(String descPieza1) {
        this.descPieza = descPieza1;
    } 
    public String getDescPieza() {
        return descPieza;
    }
    public void setCantArt(int CantArti) {
        this.cantArt = CantArti;
    }
    public int getCantArt() {
        return cantArt;
    }
    public void setPrecioArt( double PrecioArti) {
        this.precioArt = PrecioArti;
    }
    public double getPrecioArt() {
        return precioArt;
    }
    
    
    public void obtenerMontoFactura() {
        if(getCantArt() < 0 ) {
            cantArt = 0;
        }   
        if( getPrecioArt() < 0.0 ) {
            precioArt = 0.0;
        }
        
        System.out.printf("Numero de pieza: %s %n", getNumPieza());
        System.out.printf("Descripcion de la pieza: %s %n", getDescPieza());
        System.out.printf("Cantidad de articulos: %d %n", getCantArt());
        System.out.printf("Precio del articulo: %f %n", getPrecioArt());
        System.out.printf("El total a pagar es: %f %n", (getCantArt() * getPrecioArt()));
    }
}