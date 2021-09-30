package terrenos;

import arboles.*;

public class BosqueFragmentado extends Terreno {
    public BosqueFragmentado(int area, int trabajadores){
        super(area, trabajadores);
    }

    public int calc_semilla(int opcion){
        Arbol arbolActual = null;
        switch(opcion){
            case 1:
                arbolActual = new Conacaste();
            case 2:
                arbolActual = new PaloBlanco();
            case 3:
                arbolActual = new CaobaSur();
        }
        Double diametro = arbolActual.getDiametro();
          //CALCULOS 
         conversion = area_de_terreno/ 10000;
         espaciofinal= (int)(conversion/diametro);
  
         return espaciofinal;
        
   }
}