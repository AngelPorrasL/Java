
package datos;


public class Principal {
    public static void main(String[] args) {
        
        int i;
        int pago = 0;
        int total = 0;
        System.out.println("");
        
        for (i=1; i<=20; i++) {
            System.out.print("Lo que debe pagar en el mes " + i);
            if(i==1)
                pago=10;
            else
                pago = pago*2;
            total=total+pago;
            System.out.println(" es: $" + pago);
            System.out.println();
        }
        System.out.println("Total de lo que pago: $" + total);
        
    }
}
