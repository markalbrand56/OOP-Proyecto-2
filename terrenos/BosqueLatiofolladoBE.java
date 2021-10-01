/**
 * @date: September 19, 2021
 * @author: Mark Albrand, Alejandro Azurdia, Diego Morales, Jimena Hernández.
 * @version: 0.1 
 * BosqueLatifolladoB.java
 */
package terrenos;
import arboles.*;

//Constructor BosquelatifolladoB
public class BosqueLatiofolladoBE extends Terreno {
    public BosqueLatiofolladoBE(int area, int trabajadores){
        super(area, trabajadores);
        arbolesDisponibles = new String[]{"Caoba", "Cedro", "Naranjo", "Ceiba"};
    }


    /* Método calculo de semillas
    * @param: opcion
    * @return: cantidad_de_semillas
    */
    public int calc_semilla(int opcion){
        Arbol arbolActual = null;
        switch(opcion){
            case 1:
                arbolActual = new Caoba();
            case 2:
                arbolActual = new Cedro();
            case 3:
                arbolActual = new Naranjo();
            case 4:
                arbolActual = new Ceiba();
        }
        Double diametro = arbolActual.getDiametro();
          //CALCULOS JIME
          cantidad_de_semillas= (int)(Math.ceil(area_de_terreno/diametro));
  
          return cantidad_de_semillas;
     }
}