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
        arbolesDisponibles = new String[]{"Conacaste", "Palo blanco", "Caoba sur"};
    }

    /* Método calculo de semillas
    * @param: opcion
    * @return: cantidad_de-semillas
    */
    public int calc_semilla(int opcion){
        arbol = null;
        switch(opcion){
            case 1:
                arbol = new Conacaste();
            case 2:
                arbol = new PaloBlanco();
            case 3:
                arbol = new CaobaSur();
        }
        Double diametro = arbol.getDiametro();
          //CALCULOS 
          cantidad_de_semillas= (int)(Math.ceil(area_de_terreno/diametro));
  
         return cantidad_de_semillas;
        
   }
}