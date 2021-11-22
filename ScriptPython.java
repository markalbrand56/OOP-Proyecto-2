// https://www.edureka.co/community/358/how-to-execute-a-python-file-with-few-arguments-in-java
/**
Vista.java
Autor: Mark Albrand, Diego Morales, Jimena Hernandez, Javier Azurdia
Fecha: 20/11/2021

Responsable de ejecución del script de Python para graficar, usando argumentos de línea de comando.
 */


public class ScriptPython {
    /**
     * Ejecución del Script de Python. No espera ningun resultado que guardar.
     * @param archivo Nombre del archivo
     * @param arg1 Primer argumento
     * @param arg2 Segundo argumento
     * @throws Exception Fallo en la ejecución del script
     */
    public void runScript(String archivo, String arg1, String arg2) throws Exception{
        Runtime.getRuntime().exec(new String[]{"python",archivo,arg1,arg2});
    }
}

