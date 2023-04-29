
package datos;


public class Encargado {
    
    private String nombre;
    private String apellidoP;
    private double salarioM;
    
    public Encargado() {
    }
    public Encargado(String nombre, String apellidoP, double salarioM) {
        this.nombre = nombre;
        this.apellidoP = apellidoP;
        this.salarioM = salarioM;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getNombre() {
        return nombre;
    }
    public void setApellidoP(String apellidoP) {
        this.apellidoP = apellidoP;
    }
    public String getApellidoP() {
        return apellidoP;
    }
    public void setSalarioM(double salarioM) {
        this.salarioM = salarioM;
    }
    public double getSalarioM(double salarioM) {
        return salarioM;
    }
}
