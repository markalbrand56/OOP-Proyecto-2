package terrenos;

import arboles.*;

public class BosqueMixto extends Terreno {
    public BosqueMixto(int area, int trabajadores){
        super(area, trabajadores);
        arbolesDisponibles = new String[]{"Encino", "Fresno"};
    }
    
      public int calc_semilla(int opcion){
           arbol = null;
           switch(opcion){
               case 1:
                    arbol = new Encino();
               case 2:
                    arbol = new Fresno();
           }
           Double diametro = arbol.getDiametro();
            //CALCULOS 
           cantidad_de_semillas= (int)(Math.ceil(area_de_terreno/diametro));
    
           return cantidad_de_semillas;
           
      }
      
     
}
