
package datos;


public class Fecha {
    
    private int dia;
    private int mes;
    private int year;

    public Fecha(int Dia1, int Mes1, int Year1) {
        
        if(Dia1 > 0) {
        }
        if(Dia1 <= 31) {
            dia = Dia1;
        }
        
        if(Mes1 > 0) {
        }
        if(Mes1 <= 12) {
            mes = Mes1;
        } 
        
        if(Year1 > 2000) {
        }
        if(Year1 < 2030) {
            year = Year1;
        }
              
    }
    
    public void setDia(int Dia1) {
        if(Dia1 > 0) {
        }
        if(Dia1 <= 31) {
            dia = Dia1;
        }
    }
    public int getDia() {
        return dia;
    }
    public void setMes(int Mes1) {
        if(Mes1 > 0) {
        }
        if(Mes1 <= 12) {
            mes = Mes1;
        }
    }
    public int getMes() {
        return mes;
    }
    public void setYear(int Year1){
        if(Year1 > 2000) {
        }
        if(Year1 < 2030) {
            year = Year1;
        }    
    }
    public int getYear() {
        return year;
    }
    
    
    public void mostrarFecha() {
        System.out.printf("Fecha: %d / %d / %d %n", getDia(), getMes(), getYear());
    }
    
    
}
