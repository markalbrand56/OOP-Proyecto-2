/***************************************************
Archivos.java
Autor: Diego Morales, Jimena Hernandez, Mark Albrand, Javier Azurdia
Fecha: 19/09/2021

Responsable para la interacción va con archivos de texto
***************************************************/


import java.io.BufferedWriter;
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

        } catch (IOException e) {
        }
        
    }

    /**
     * Constructor 2
     */
    Archivos(){
        // no hace nada. 
    }

    /**
    * Escribe a un archivo
    * @param string linea a escribir. 
    * @param fileName nombre del archivo. 
    */
    public boolean escribir(String string, String fileName)throws IOException{ // Método para escribir al final de un txt. 
        boolean exito;
        try {
            FileWriter fw = new FileWriter(fileName, true);
            BufferedWriter bw = new BufferedWriter(fw);
            bw.write("\n"+string);
            bw.close();
            exito = true;

        } catch (Exception e) {
            exito = false;

        }
        return exito;

    }

    /**
     * 
     * @param alString ArrayList con las cadenas de texto de los resultados a agregar. 
     * @param fileName nombre del archivo. 
     * @return regresa un boolean para confirmar o denegar haber hecho la acción. 
     */
    public boolean escribir(ArrayList<String> alString, String fileName)throws IOException{ // Método para escribir al final de un txt. 
        boolean exito;
        
        try {
            FileWriter fw = new FileWriter(fileName, true);
            BufferedWriter bw = new BufferedWriter(fw);
            
            for(int i = 0; i<alString.size(); i++){
                bw.write("\n" + alString.get(i)); 
            }
            bw.close();
            exito = true;
        } catch (Exception e) {
            exito = false;
        }
        return exito;
    }
    
    /**
     * 
     * @param fileName nombre del archivo a leer. 
     * @return regresa ArrayList con cadenas de texto. 
     */
    
    public ArrayList<String> leer(String fileName){
        ArrayList <String> data = new ArrayList<String>();
        File file = new File(fileName);
        try {
            Scanner scan = new Scanner(file);
            while(scan.hasNextLine()){
                data.add(scan.nextLine());
            }
            scan.close();
        } catch (Exception e) {
            // ideas equivalentes a vista.error() ??? La verdad no se que mas hacer jaja. 
        }
        return data;
    }


    
}
