/**
 * @date: September 19, 2021
 * @author: Mark Albrand, Alejandro Azurdia, Diego Morales, Jimena Hernández.
 * @version: 0.1 
 */

public class Controlador{
    private static Vista vista = new Vista();
    private static int menu;
    private static int area;
    private static int workers;
    private static int tipos_de_suelo;
    private static int cantidad_de_semilla;
    private static int costo;



    //Terreno terreno; //La clase todavía no se ha creado. 


    public static void main(String[] args) {
        int opcion = vista.menuOpciones();

        while (opcion != 4) {
            switch (opcion) {
                case 1:
                    // Datos de reforestación
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