package terrenos;
import arboles.*;

public class BosqueManglar extends Terreno {
    public BosqueManglar(int area, int trabajadores){
        super(area, trabajadores);
    }

    public int calc_semilla(int opcion){
        Arbol arbolActual = null;
        switch(opcion){
            case 1:
                arbolActual = new MangleNegro();
            case 2:
                arbolActual = new MangleBlanco();
            case 3:
                arbolActual = new Botoncillo();
        }
        Double diametro = arbolActual.getDiametro();
          //CALCULOS JIME
         conversion = area_de_terreno/ 10000;
         espaciofinal= (int)(conversion/diametro);
  
         return espaciofinal;
     }
}