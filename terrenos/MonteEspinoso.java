/**
 * @date: September 19, 2021
 * @author: Mark Albrand, Alejandro Azurdia, Diego Morales, Jimena Hernández.
 * @version: 0.1 
 * MonteEspinoso.java
 */
package terrenos;

import arboles.*;


//Constructor Monteespinoso
public class MonteEspinoso extends Terreno {
    public MonteEspinoso(int area, int trabajadores){
        super(area, trabajadores);
        arbolesDisponibles = new String[]{"Jiote", "Aripin", "Cactus"};
    }


    /* Método calculo de semillas
    * @param: opcion
    * @return: cantidad_de_semillas
    */
    public int calc_semilla(int opcion){
        arbol = null;
        switch(opcion){
            case 1:
                arbol = new Jiote();
            case 2:
                arbol = new Aripin();
            case 3:
                arbol = new Cactus();
        }
        Double diametro = arbol.getDiametro();
          //CALCULOS
          cantidad_de_semillas= (int)(Math.ceil(area_de_terreno/diametro));
  
         return cantidad_de_semillas;
        
   }
}