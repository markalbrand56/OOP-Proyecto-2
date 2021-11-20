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
        this.tipo_de_terreno = "Bosque fragmentado";
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
                break;
            case 2:
                arbol = new PaloBlanco();
                break;
            case 3:
                arbol = new CaobaSur();
                break;
        }
        Double diametro = arbol.getDiametro();
          //CALCULOS 
          cantidad_de_semillas= (int)(Math.ceil(area_de_terreno/diametro));
  
         return cantidad_de_semillas;
        
   }

   @Override
   public String recomendaciones() {
       String s="\n"+"Consejo: Para que el suelo esté sano debe estar bien aireado. Cuando el suelo está compactado se impide el paso del agua y el aire, por lo tanto las raíces no reciben oxígeno. Esto es muy importante a la hora de plantar un árbol o una planta."; 
        return s;
   }
    
}