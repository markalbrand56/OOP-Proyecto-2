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
       String s="Hay una variedad de cosas que viven en el suelo que nos rodea. Usted puede agregar lombrices de tierra a su suelo para asegurar su salud. Se trata de un método de conservación que favorece la descomposición de la materia orgánica. Esto es lo que las lombrices de tierra hacen regularmente. Aumentan la capacidad del suelo para absorber nutrientes."; 
        return s;
   }
}