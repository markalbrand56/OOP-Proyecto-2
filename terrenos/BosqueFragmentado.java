/**
 * @date: September 19, 2021
 * @author: Mark Albrand, Alejandro Azurdia, Diego Morales, Jimena Hernández.
 * @version: 0.1 
 * BosqueFragmentado.java
 */

package terrenos;

import arboles.*;

//Constructor Bosqueconiferas 
public class BosqueFragmentado extends Terreno {
    public BosqueFragmentado(int area, int trabajadores){
        super(area, trabajadores);
    }

    /* Método calculo de semillas
    * @param: opcion
    * @return: cantidad_de-semillas
    */
    public int calc_semilla(int opcion){
        Arbol arbolActual = null;
        switch(opcion){
            case 1:
                arbolActual = new Conacaste();
            case 2:
                arbolActual = new PaloBlanco();
            case 3:
                arbolActual = new CaobaSur();
        }
        Double diametro = arbolActual.getDiametro();
          //CALCULOS 
          cantidad_de_semillas= (int)(Math.ceil(area_de_terreno/diametro));
  
         return cantidad_de_semillas;
        
   }
}