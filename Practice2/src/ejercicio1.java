

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.ArrayList;


public class ejercicio1 {
   
    public static void main(String[] args) throws IOException {
        //Que tenemos que hacer? 
        //Crear el objeto
        File archivo = new File("ejemplo.txt");
        
        if (archivo.exists()) {
             System.out.println("El archivo ya existe");
        }else{
            archivo.createNewFile();
            System.out.println("Archivo creado"); 
        }
        
        //Escribir
        BufferedWriter escritura = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(archivo,true),"utf-8"));
        escritura.write("Hola mundo");
        escritura.newLine();
        escritura.write("Hola mi nombre es ronald");
        escritura.newLine();
        escritura.close();
        
        
        //Leer
        //FileReader f = new FileReader(archivo);
        BufferedReader lectura = new BufferedReader(new FileReader(archivo));
        
//        System.out.println(lectura.readLine());
            String linea = null;
            while ((linea = lectura.readLine()) != null) {            
                System.out.println(linea);
        }
        
        
        
        
        
        
        
        
        
    }
    
}
