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

                    int tipoTerreno = vista.tipoDeSuelo();
                    switch (tipoTerreno) {
                        case 1:
                            terrenoActual = new BosqueConiferas(area, trabajadores);
                            break;
                        case 2:
                            terrenoActual = new BosqueFragmentado(area, trabajadores);
                            break;
                        case 3:
                            terrenoActual = new BosqueLatifolladoA(area, trabajadores);
                            break;
                        case 4:
                            terrenoActual = new BosqueLatiofolladoBE(area, trabajadores);
                            break;
                        case 5:
                            terrenoActual = new BosqueManglar(area, trabajadores);
                            break;
                        case 6:
                            terrenoActual = new BosqueMixto(area, trabajadores);                            
                            break;
                        case 7:
                            terrenoActual = new MonteEspinoso(area, trabajadores);
                            break;
                    
                        default:
                            break;
                    }

                    int tipoArbol = vista.arbolesDisponibles(terrenoActual.getArbolesDispibles());
                    int cantidadSemillas = terrenoActual.calc_semilla(tipoArbol);

                    vista.mensaje("\nSe necesitan " + cantidadSemillas + " semillas de " + terrenoActual.getArbol());

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
            opcion = vista.menuOpciones();
        }
    }

}