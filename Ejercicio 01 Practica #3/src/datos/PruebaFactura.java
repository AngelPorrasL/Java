
package datos;

import java.util.Scanner;


public class PruebaFactura {
    public static void main(String[] args) {
        
        Factura factura = new Factura(" ", " ", 0, 0.0, " ", " ");
        
        String NumeroPieza;
        String DescripPieza;
        int Cantidad;
        double Precio;

        Scanner entrada = new Scanner( System.in );
        System.out.println("Escriba el numero de pieza:");
        NumeroPieza = entrada.nextLine();
        factura.setNumPieza(NumeroPieza);
       
        System.out.println("Escriba la descripcion de la pieza:");
        DescripPieza = entrada.nextLine();
        factura.setDescPieza(DescripPieza);
       
        System.out.println("Escriba la cantidad del articulo:");
        Cantidad = entrada.nextInt();
        factura.setCantArt(Cantidad);
       
        System.out.println("Escriba el precio del articulo:");
        Precio = entrada.nextDouble();
        factura.setPrecioArt(Precio);
       
        factura.obtenerMontoFactura();
    }
}
