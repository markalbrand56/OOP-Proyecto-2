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
import java.util.Scanner;


public class Archivos {
    File archivo;
    int [] seedsInTerrenos = new int []{0, 0, 0, 0, 0, 0, 0};
    /**
         * 0. Bosque coniferas
         * 1. Bosque fragmentado
         * 2. Bosque latifollado
         * 3. Bosque latifollado BE?
         * 4. Bosque manglar
         * 5. Bosque mixto
         * 6. Bosque espinoso
         */

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
     * @param alString Array definido. Es lo que se guardará en el txt.  
     * @param fileName nombre del archivo. 
     * @return regresa un boolean para confirmar o denegar haber hecho la acción. 
     */
    public boolean escribir2(int [] alString, String fileName)throws IOException{ // Método para escribir al final de un txt. 
        boolean exito; 
        try {
            FileWriter fw = new FileWriter(fileName, false);
            BufferedWriter bw = new BufferedWriter(fw);
            
            for(int i = 0; i<alString.length; i++){
                bw.write("\n" + alString[i]); 
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
    
    public int[] leer(String fileName){
        //ArrayList <String> data = new ArrayList<String>();
        File file = new File(fileName);
        try {
            Scanner scan = new Scanner(file);
            int i = 0;
            while(scan.hasNextLine()){
                seedsInTerrenos[i] = Integer.parseInt(scan.nextLine());
                i += 1;
            }
            //while(scan.hasNextLine()){
            //    data.add(scan.nextLine());
            //}
            scan.close();
        } catch (Exception e) {
            // ideas equivalentes a vista.error() ??? La verdad no se que mas hacer jaja. 
            System.out.println("valio putas"); 
        }
        return seedsInTerrenos;
    }

    /**
     * 
     * @param num las adiciones de semillas. 
     * @param tipo 
     * @return
     */
    public int[] actualizarArray(int num, String tipo){
        switch (tipo) {
            case "Bosque coníferas":
                seedsInTerrenos[0] = seedsInTerrenos[0] + num;
                break;
        
            case "Bosque fragmentado":
                seedsInTerrenos[1] = seedsInTerrenos[1] + num;
                break;
            case "Bosque latifollado de altura":
                seedsInTerrenos[2] = seedsInTerrenos[2] + num;
                break;
            case "Bosque latifollado de baja elevación":
                seedsInTerrenos[3] = seedsInTerrenos[3] + num;
                break;
            case "Bosque manglar":
                seedsInTerrenos[4] = seedsInTerrenos[4] + num;
                break;
            case "Bosque mixto":
                seedsInTerrenos[5] = seedsInTerrenos[5] + num;
                break;
            case "Bosque monte espinoso":
                seedsInTerrenos[6] = seedsInTerrenos[6] + num;
                break;
            default:
                break;
        }
        return seedsInTerrenos;
    }

    
}
