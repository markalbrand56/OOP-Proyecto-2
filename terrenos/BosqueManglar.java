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
        this.tipo_de_terreno = "Bosque manglar";
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
                break;
            case 2:
                arbol = new MangleBlanco();
                break;
            case 3:
                arbol = new Botoncillo();
                break;
        }
        Double diametro = arbol.getDiametro();
          //CALCULOS 
          cantidad_de_semillas= (int)(Math.ceil(area_de_terreno/diametro));
  
          return cantidad_de_semillas;
     }

     @Override
     public String recomendaciones() {
         String s="\n"+"Consejo: El suelo requiere una cantidad adecuada de agua para funcionar correctamente. Muchas superficies de concreto, especialmente en áreas residenciales, hacen difícil que el agua llegue al suelo. Usando adoquines para los patios y jardines se trabaja para proteger el suelo. También son una herramienta para prevenir la erosión del suelo en áreas específicas."; 
          return s;
     }
      
}