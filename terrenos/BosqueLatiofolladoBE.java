package terrenos;
import arboles.*;

public class BosqueLatiofolladoBE extends Terreno {
    public BosqueLatiofolladoBE(int area, int trabajadores){
        super(area, trabajadores);
        arbolesDisponibles = new String[]{"Caoba", "Cedro", "Naranjo", "Ceiba"};
    }

    public int calc_semilla(int opcion){
        arbol = null;
        switch(opcion){
            case 1:
                arbol = new Caoba();
            case 2:
                arbol = new Cedro();
            case 3:
                arbol = new Naranjo();
            case 4:
                arbol = new Ceiba();
        }
        Double diametro = arbol.getDiametro();
          //CALCULOS JIME
          cantidad_de_semillas= (int)(Math.ceil(area_de_terreno/diametro));
  
          return cantidad_de_semillas;
     }
}