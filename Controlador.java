/**
 * @date: September 19, 2021
 * @author: Mark Albrand, Alejandro Azurdia, Diego Morales, Jimena Hernández.
 * @version: 0.1
 */

import terrenos.*;

public class Controlador{
    private static Vista vista = new Vista();
    private static Terreno terrenoActual;
    private static GUI interfaz = new GUI();


    /**
     * Método main del programa
     * @param args Argumentos de la línea de comando
     */
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
                            terrenoActual = new BosqueLatiofolladoBE(area, trabajadores);
                            break;
                        case 2:
                            terrenoActual = new BosqueMixto(area, trabajadores);
                            break;
                        case 3:
                            terrenoActual = new BosqueLatifolladoA(area, trabajadores);
                            break;
                        case 4:
                            terrenoActual = new BosqueFragmentado(area, trabajadores);
                            break;
                        case 5:
                            terrenoActual = new BosqueManglar(area, trabajadores);
                            break;
                        case 6:
                            terrenoActual = new BosqueConiferas(area, trabajadores);
                            break;
                        case 7:
                            terrenoActual = new MonteEspinoso(area, trabajadores);
                            break;

                        default:
                            break;
                    }

                    int tipoArbol = vista.arbolesDisponibles(terrenoActual.getArbolesDispibles());
                    int cantidadSemillas = terrenoActual.calc_semilla(tipoArbol);
                    Double tiempo;

                    try {
                        tiempo=terrenoActual.calc_tiempo(trabajadores, cantidadSemillas);                         
                    } catch (ArithmeticException e) {
                        tiempo = 0.0;
                    }
                    vista.mensaje("\nSe necesitan " + cantidadSemillas + " semillas de " + terrenoActual.getArbol());
                    
                    if (tiempo>0) {
                        vista.mensaje("\nSe necesitan " + tiempo + " horas para plantar todas las semillas aproximadamente");                        
                    }else{
                        vista.mensaje("No se pudo determinar el tiempo necesario para plantar todas las semillas.\n");
                    }

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
