package terrenos;

public class BosqueLatifolladoA extends Terreno {
    public BosqueLatifolladoA(int area, int trabajadores){
        super(area, trabajadores);
    }

    public int calc_semilla(int opcion){
        Arbol arbolActual;
        switch(opcion){
            case 1:
                arbolActual = new Encino();
            case 2:
                arbolActual = new Aguacatillo();
        }
        Double diametro = arbolActual.getDiametro();
          //CALCULOS JIME
         conversion = area_de_terreno/ 10000;
         espaciofinal= (int)(conversion/diametro);
  
         return espaciofinal;
     }
}