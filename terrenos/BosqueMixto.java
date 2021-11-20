/**
 * @date: September 19, 2021
 * @author: Mark Albrand, Alejandro Azurdia, Diego Morales, Jimena Hernández.
 * @version: 0.1 
 * BosqueMixto.java
 */
package terrenos;

import arboles.*;

//Constructor BosqueMixto
public class BosqueMixto extends Terreno {
    public BosqueMixto(int area, int trabajadores){
        super(area, trabajadores);
        arbolesDisponibles = new String[]{"Encino", "Fresno"};
        this.tipo_de_terreno = "Bosque mixto";
    }
    
    /* Método calculo de semillas
    * @param: opcion
    * @return: cantidad_de_semillas
    */
      public int calc_semilla(int opcion){
           arbol = null;
           switch(opcion){
               case 1:
                    arbol = new Encino();
                    break;
               case 2:
                    arbol = new Fresno();
                    break;
           }
           Double diametro = arbol.getDiametro();
            //CALCULOS 
           cantidad_de_semillas= (int)(Math.ceil(area_de_terreno/diametro));
    
           return cantidad_de_semillas;
           
      }

      @Override
      public String recomendaciones() {
          String s="\n"+"Consejo: Los niveles de pH en el suelo pueden verse afectados por una serie de factores. Los contaminantes y el ácido son sólo dos ejemplos en esta categoría. Comprar un analizador de suelo es una buena manera de monitorear los niveles de su suelo. Esto también le permite aprender lo que hay que añadir para asegurar un suelo sano y la conservación."; 
           return s;
      }
      
     
}
