package terrenos;
import arboles.*;

public class BosqueConiferas extends Terreno {
    public BosqueConiferas(int area, int trabajadores){
        super(area, trabajadores);
        arbolesDisponibles = new String[]{"Pino"};
    }

    public int calc_semilla(int opcion){
        Arbol arbolActual = null;
        switch(opcion){
            case 1:
                arbolActual = new Pino();

        }
        Double diametro = arbolActual.getDiametro();
         //CALCULOS 
         conversion = area_de_terreno/ 10000;
         espaciofinal= (int)(conversion/diametro);
  
         return espaciofinal;    
   }
}