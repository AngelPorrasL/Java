
package datos;


public class Principal {
    public static void main(String[] args) {
        
        Encargado encargado1 = new Encargado();
        
        encargado1.setNombre("Angel");
        encargado1.setApellidoP("Porras");
        encargado1.setSalarioM(2000);
        
        System.out.println("El salario anual de "+ encargado1.getNombre()+" "+ encargado1.getApellidoP()+ " es de: "+ encargado1.getSalarioM(2000)* 12);
        System.out.println("El salario anual de "+ encargado1.getNombre()+" sumandole un 10% es de: "+ encargado1.getSalarioM(2000)* 12 * 1.1);
        
        Encargado encargado2 = new Encargado();
        
        encargado2.setNombre("Pedro");
        encargado2.setApellidoP("Torres");
        encargado2.setSalarioM(2500);
        
        System.out.println("El salario anual de "+ encargado2.getNombre()+" "+ encargado2.getApellidoP()+ " es de: "+ encargado2.getSalarioM(2500)* 12);
        System.out.println("El salario anual de "+ encargado2.getNombre()+" sumandole un 10% es de: "+ encargado2.getSalarioM(2500)* 12 * 1.1);
    }
}
