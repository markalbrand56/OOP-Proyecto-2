/**
 * @date: September 19, 2021
 * @author: Mark Albrand, Alejandro Azurdia, Diego Morales, Jimena Hernández.
 * @version: 0.1
 */

import java.io.IOException;
import terrenos.*;

public class Controlador{
    private static Vista vista = new Vista();
    private static Terreno terrenoActual;
    private static Archivos archivo;
    //private static GUI interfaz = new GUI();
    
    /**
     * Método main del programa
     * @param args Argumentos de la línea de comando
     */
    public static void main(String[] args) {
        
        try {
           archivo = new Archivos("Resultados.txt");
    
        } catch (Exception e) {
            vista.mensaje("No se pudo abrir el archivo");
        }
        
        int opcion = vista.menuOpciones();
        int [] staticsArray = archivo.getSeedsInTerrenos();
        while (opcion != 5) {
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
                    //staticsArray[tipoArbol -1] += cantidadSemillas;

                    staticsArray = archivo.actualizarArray(cantidadSemillas, terrenoActual.getTipoDeTerreno());
                    Double tiempo;

                    try {
                        tiempo=terrenoActual.calc_tiempo(trabajadores, cantidadSemillas);
                    } catch (ArithmeticException e) {
                        tiempo = 0.0;
                    }
                    vista.mensaje("\nSe necesitan " + cantidadSemillas + " semillas de " + terrenoActual.getArbol());

                    if (tiempo>0) {
                        vista.mensaje("\nSe necesitan " + tiempo + " horas para plantar todas las semillas aproximadamente");
                        vista.mensaje(terrenoActual.recomendaciones());
                    }else{
                        vista.mensaje("No se pudo determinar el tiempo necesario para plantar todas las semillas.\n");
                    }
                    break;
                
                case 2: // Ver los resultados registrados.

                    System.out.println(staticsArray.toString());
                
                    // Devolver las estadísticas a la graficadora de python. 
                    // Solamente se enviarán los datos guardados. 
                    String statics;
                    statics = staticsArray[0] + ", ";
                    statics += staticsArray[1] + ", ";
                    statics += staticsArray[2] + ", "; 
                    statics += staticsArray[3] + ", "; 
                    statics += staticsArray[4] + ", "; 
                    statics += staticsArray[5] + ", ";
                    statics += staticsArray[6] + ""; 

                    String namesOfStatics = "Coniferas, Fragmentado, Latifollado A, Latifollado BA, Manglar, Mixto, Monte espinoso";
                    ScriptPython graficas = new ScriptPython();
                    try {
                        graficas.runScript("graficas.py", namesOfStatics, statics);
                    } catch (Exception e) {
                        //TODO: handle exception
                        vista.mensaje("No se ha podido generar la gráfica correctamente");
                    }
                    break;

                case 3: // guardar los datos.
                    //boolean ans = false;
                    try {
                        archivo.escribir2(staticsArray, "Resultados.txt");
                        
                    } catch (IOException e) {
                        vista.error();
                    }
                    break;
                    
                case 4:  // Información
                    vista.informacion();
                    break;

                default:
                    break;
            }
            opcion = vista.menuOpciones();
        }
    }

}
