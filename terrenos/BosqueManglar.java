/**
 * @date: September 19, 2021
 * @author: Mark Albrand, Alejandro Azurdia, Diego Morales, Jimena Hernández.
 * @version: 0.1 
 * BosqueManglar.java
 */
package terrenos;
import arboles.*;

//Constructor BosqueManglar
public class BosqueManglar extends Terreno {
    public BosqueManglar(int area, int trabajadores){
        super(area, trabajadores);
        arbolesDisponibles = new String[]{"Mangle Negro", "Mangle Blanco", "Botoncillo"};
    }

    /* Método calculo de semillas
    * @param: opcion
    * @return: cantidad_de_semillas
    */
    public int calc_semilla(int opcion){
        arbol = null;
        switch(opcion){
            case 1:
                arbol = new MangleNegro();
            case 2:
                arbol = new MangleBlanco();
            case 3:
                arbol = new Botoncillo();
        }
        Double diametro = arbol.getDiametro();
          //CALCULOS 
          cantidad_de_semillas= (int)(Math.ceil(area_de_terreno/diametro));
  
          return cantidad_de_semillas;
     }
}