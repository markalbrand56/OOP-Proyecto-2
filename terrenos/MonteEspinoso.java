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
        this.tipo_de_terreno = "Bosque monte espinoso";
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
                break;
            case 2:
                arbol = new Aripin();
                break;
            case 3:
                arbol = new Cactus();
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