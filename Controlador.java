/**
 * @date: September 19, 2021
 * @author: Mark Albrand, Alejandro Azurdia, Diego Morales, Jimena Hernández.
 * @version: 0.1 
 */

import terrenos.*;

public class Controlador{
    private static Vista vista = new Vista();
    private static Terreno terrenoActual;  

    //Terreno terreno; //La clase todavía no se ha creado. 

    public static void main(String[] args) {
        int opcion = vista.menuOpciones();

        while (opcion != 4) {
            switch (opcion) {
                case 1:
                    // Datos de reforestación
                    int[] dimensiones = vista.size();
                    int area = (dimensiones[0]) * (dimensiones[1]);
                    int trabajadores = vista.trabajadores();                   

                    // EJEMPLO

                    terrenoActual = new BosqueMixto(area, trabajadores);
                    int tipoArbol = vista.arbolesDisponibles(terrenoActual.getArbolesDispibles());
                    int cantidadSemillas = terrenoActual.calc_semilla(tipoArbol);

                    vista.mensaje("Semillas necesarias " + cantidadSemillas);

                    // 

                    break;
                case 2:
                    // Ver áreas registradas
                    break;
                case 3:
                    // Guardar datos
                    break;
            
                default:
                    break;
            }
        }
    }

}