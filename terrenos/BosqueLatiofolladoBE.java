package terrenos;
import arboles.*;

public class BosqueLatiofolladoBE extends Terreno {
    public BosqueLatiofolladoBE(int area, int trabajadores){
        super(area, trabajadores);
    }

    public int calc_semilla(int opcion){
        Arbol arbolActual = null;
        switch(opcion){
            case 1:
                arbolActual = new Caoba();
            case 2:
                arbolActual = new Cedro();
            case 3:
                arbolActual = new Naranjo();
            case 4:
                arbolActual = new Ceiba();
        }
        Double diametro = arbolActual.getDiametro();
          //CALCULOS JIME
         conversion = area_de_terreno/ 10000;
         espaciofinal= (int)(conversion/diametro);
  
         return espaciofinal;
     }
}