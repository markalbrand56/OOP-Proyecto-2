/***************************************************
Arbol.java
Autor: Diego Morales, Jimena Hernandez, Mark Albrand, Javier Azurdia
Fecha: 01/10/2021

Modelo de Arbol para el uso del controlador
***************************************************/
package arboles;

public abstract class Arbol {
    protected Double diametro;  // Cuánto espacio ocupa un solo árbol
    protected String especie;  // Nombre

    //Constructor de clase
    public Arbol(Double diametro, String nombre){
        this.diametro = diametro;
        this.especie = nombre;
    }

    /*Metodo para devolver el valor de Diametro
     @return valor de Diametro
    */
    public Double getDiametro(){
        return diametro;
    }

     /*Metodo para devolver el valor de Especie
     @return valor de Especie
    */
    public String getEspecie(){
        return especie;
    }
}
