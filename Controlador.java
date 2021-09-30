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
                    int trabajadores = vista.trabajadores();

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