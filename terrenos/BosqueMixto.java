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
          // TODO Auto-generated method stub
          return null;
     }
      
     
}
