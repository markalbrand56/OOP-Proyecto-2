/**
 * @date: September 19, 2021
 * @author: Mark Albrand, Alejandro Azurdia, Diego Morales, Jimena Hernández.
 * @version: 0.1 
 * BosqueConiferas.java
 */


package terrenos;
import arboles.*; 

    //Constructor Bosqueconiferas 
public class BosqueConiferas extends Terreno {
    public BosqueConiferas(int area, int trabajadores){
        super(area, trabajadores);
        arbolesDisponibles = new String[]{"Pino"};
    }


    /* Método calculo de semillas
    * @param: opcion
    * @return: cantidad_de-semillas
    */
    public int calc_semilla(int opcion){
        Arbol arbolActual = null;
        switch(opcion){
            case 1:
                arbolActual = new Pino();

        }
        Double diametro = arbolActual.getDiametro();
         //CALCULOS 
         cantidad_de_semillas= (int)(Math.ceil(area_de_terreno/diametro));
  
         return cantidad_de_semillas;    
   }
}