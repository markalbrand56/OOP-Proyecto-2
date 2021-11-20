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
        this.tipo_de_terreno = "Bosque coníferas";
    }


    /* Método calculo de semillas
    * @param: opcion
    * @return: cantidad_de-semillas
    */
    public int calc_semilla(int opcion){
        arbol = null;
        switch(opcion){
            case 1:
                arbol = new Pino();
                break;

        }
        Double diametro = arbol.getDiametro();
         //CALCULOS 
         cantidad_de_semillas= (int)(Math.ceil(area_de_terreno/diametro));
  
         return cantidad_de_semillas;    
   }

   @Override
   public String recomendaciones() {
       String s=""; 
        return s;
   }
    
}