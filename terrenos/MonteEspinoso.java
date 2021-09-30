package terrenos;

import arboles.*;

public class MonteEspinoso extends Terreno {
    public MonteEspinoso(int area, int trabajadores){
        super(area, trabajadores);
        arbolesDisponibles = new String[]{"Jiote", "Aripin", "Cactus"};
    }

    public int calc_semilla(int opcion){
        Arbol arbolActual = null;
        switch(opcion){
            case 1:
                arbolActual = new Jiote();
            case 2:
                arbolActual = new Aripin();
            case 3:
                arbolActual = new Cactus();
        }
        Double diametro = arbolActual.getDiametro();
          //CALCULOS
          cantidad_de_semillas= (int)(Math.ceil(area_de_terreno/diametro));
  
         return cantidad_de_semillas;
        
   }
}