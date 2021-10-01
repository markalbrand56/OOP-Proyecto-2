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
        Arbol arbolActual = null;
        switch(opcion){
            case 1:
                arbolActual = new MangleNegro();
            case 2:
                arbolActual = new MangleBlanco();
            case 3:
                arbolActual = new Botoncillo();
        }
        Double diametro = arbolActual.getDiametro();
          //CALCULOS 
          cantidad_de_semillas= (int)(Math.ceil(area_de_terreno/diametro));
  
          return cantidad_de_semillas;
     }
}