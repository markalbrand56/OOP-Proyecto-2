/**
* Esta es para manipular archivos
* @version: 5-sept
*/

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
    Archivos(String nombreArchivo) throws IOException{
        archivo = new File(nombreArchivo);
        archivo.createNewFile();
    }

    /**
    * Escribe a un archivo
    * @param linea linea a escribir
    */
    public boolean escribir(String linea) throws IOException {
        // 1 línea por parqueo
        boolean resultado = false;

        FileWriter escritor = new FileWriter(archivo);
        escritor.write(linea);
        escritor.close();

        return resultado;
    }
    
      /**
    * Lee los datos del archivo
    * @return lineas del archivo
    */
    public ArrayList<String> leer() throws IOException{
        ArrayList<String> data = new ArrayList<String>();
        Scanner myReader = new Scanner(archivo);
        while (myReader.hasNextLine()) {
            String localData = myReader.nextLine();
            data.add(localData);
        }
        myReader.close();
        return data;
    }
}
