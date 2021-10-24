/***************************************************
Archivos.java
Autor: Diego Morales, Jimena Hernandez, Mark Albrand, Javier Azurdia
Fecha: 19/09/2021

Responsable para la interacción va con archivos de texto
***************************************************/


import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;


public class Archivos {
    File archivo;

    /**
    * Constructor
    * @param nombreArchivo nombre del archivo
    */
    Archivos(String nombreArchivo) throws IOException{ // Modificada por A. Azurdia
        
        try {
            this.archivo = new File(nombreArchivo);
            archivo.createNewFile();
            vista.mensaje("Se ha creado el archivo con éxito");

        } catch (IOException e) {
            vista.mensaje("Ha ocurrido un error.");
        }
        
    }

    /**
    * Escribe a un archivo
    * @param linea linea a escribir
    */
    public void escribir(String string, String fileName)throws IOException{ // Método para escribir al final de un txt. 
        try {
            FileWriter fw = new FileWriter(fileName, true);
            BufferedWriter bw = new BufferedWriter(fw);
            bw.write("\n"+string);
            bw.close();
            vista.mensaje("Guardado exitoso.");
        } catch (Exception e) {
            vista.error();
        }
    }
    
    /**
    * Lee los datos del archivo
    * @return lineas del archivo
    */
    
    public void leer(){
        try {
            Scanner scan = new Scanner(file);
            while(scan.hasNextLine()){
                String data = scan.nextLine();
                vista.mensaje(data);
                
            }
            scan.close();
        } catch (Exception e) {
            vista.error();
        }
    }
    
}
