package terrenos;

import arboles.*;

public class BosqueMixto extends Terreno {
    public BosqueMixto(int area, int trabajadores){
        super(area, trabajadores);
        arbolesDisponibles = new String[]{"Encino", "Fresno"};
    }
    
      public int calc_semilla(int opcion){
           Arbol arbolActual = null;
           switch(opcion){
               case 1:
                   arbolActual = new Encino();
               case 2:
                   arbolActual = new Fresno();
           }
           Double diametro = arbolActual.getDiametro();
            //CALCULOS 
           cantidad_de_semillas= (int)(Math.ceil(area_de_terreno/diametro));
    
           return cantidad_de_semillas;
           
      }
      
     
}
