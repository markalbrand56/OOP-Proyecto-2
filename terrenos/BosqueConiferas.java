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
       String s="\n"+"Consejo: Busca zonas donde la tierra esté dura y descubierta. La mayoría de las veces, este es un síntoma de suelo compactado. Siembra hierba en dichas zonas y asegúrate de regar y airear el suelo con frecuencia. Si no se corrige, el suelo que está por debajo puede volverse aún más denso mientras la capa superior erosiona, lo que hace que las condiciones de crecimiento sean inhóspitas o menos hospitalarias."; 
        return s;
   }
    
}