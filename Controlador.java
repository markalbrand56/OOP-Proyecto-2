/**
 * @date: September 19, 2021
 * @author: Mark Albrand, Alejandro Azurdia, Diego Morales, Jimena Hernández.
 * @version: 0.1
 */

import java.io.IOException;

import javax.xml.namespace.QName;

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
            //TODO: handle exception
        }
        
        int opcion = vista.menuOpciones();
        int [] staticsArray = archivo.getSeedsInTerrenos();

        /**
         * 0. Bosque coniferas
         * 1. Bosque fragmentado
         * 2. Bosque latifollado
         * 3. Bosque latifollado BE?
         * 4. Bosque manglar
         * 5. Bosque mixto
         * 6. Bosque espinoso
         */

        while (opcion != 6) {
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

                    /**
                    switch (tipoTerreno) {
                        case 0:
                            staticsArray[0] += cantidadSemillas;
                            break;
                        case 2:
                            staticsArray[1] += cantidadSemillas;
                            break;
                        case 3:
                            staticsArray[2] += cantidadSemillas;
                            break;
                        case 4:
                            staticsArray[3] += cantidadSemillas;
                            break;
                        case 5:
                            staticsArray[4] += cantidadSemillas;
                            break;
                        case 6:
                            staticsArray[5] += cantidadSemillas;
                            break;
                        case 7:
                            staticsArray[6] += cantidadSemillas;
                            break;
                    }

                    */


                    
                    
                    
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
                    break;
                
                case 2: // Ver los resultados registrados.

                    System.out.println(staticsArray.toString());
                    System.out.println("DEBES BORRAR ESTO");
                
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

                    String namesOfStatics = "Bosque coniferas, Bosque fragmentado, Bosque latifollado de altura, Bosque latifollado de baja elevacion, Bosque manglar, Bosque mixto, Bosque monte espinoso";
                    ScriptPython graficas = new ScriptPython();
                    try {
                        graficas.runScript("graficas.py", namesOfStatics, statics);
                        System.out.println("Se ha enviado los archivos al programa de python. DEBES ELIMINAR ESTO.");
                    } catch (Exception e) {
                        //TODO: handle exception
                        System.out.println("Valio verga x2");
                    }

                    break;


                case 3: // guardar los datos.
                    //boolean ans = false;
                    try {
                        archivo.escribir2(staticsArray, "Resultados.txt");
                        
                    } catch (IOException e) {
                        // TODO Auto-generated catch block
                        e.printStackTrace();
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
