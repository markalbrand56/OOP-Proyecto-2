package terrenos;

import arboles.Arbol;

public class Terreno {
    
    
    protected String tipo_de_terreno;
    protected int area_de_terreno;
    protected String tipo_de_semilla;
    protected int cantidad_de_semillas;
    protected int tiempo;
    protected int trabajadores;
    protected String[] arbolesDisponibles;
    protected Arbol arbol;

    
    protected int conversion, espaciofinal;
    
    /**
     * 
     * @param area_de_terreno area en metros cuadrados
     * @param trabajadores cantidad de trabajadores disponibles. 
     */
    public Terreno(int area_de_terreno, int trabajadores){
        this.area_de_terreno = area_de_terreno;
        this.trabajadores = trabajadores;
    }

    /**
     * 
     * @param espacio_entresemillas distanciamiento de sembrado. 
     * @return nada, por el momento. 
     */
    
    //
    public int calc_semilla(int espacio_entresemillas){
        return 0;
    }
    //

    /**
     * 
     * @return nada, por el momento. 
     */
    public int calc_tiempo(int trabajadores, int semillas){//Revisar
        int tiempoxsemilla=5; 
        int tiempo_total=semillas*tiempoxsemilla; 
        int tiempo_estimado=tiempo_total/trabajadores; 
        return tiempo_estimado;
    }


    /**
     * 
     * @return nombre del tipo de terreno. 
     */
    public String getTipoDeTerreno(){
        return tipo_de_terreno;
    }

    /**
     * 
     * @return area de terreno en metros cuadrados. 
     */
    public int getAreaDeTerreno(){
        return area_de_terreno;
    }

    /**
     * 
     * @return regresa el nombre del tipo de semilla. 
     */
    public String getTipoDeSemilla(){
        return tipo_de_semilla;
    }

    /**
     * 
     * @return regresa la cantidad total de semillas. 
     */
    public int cantidadDeSemilla(){
        return cantidad_de_semillas;
    }

    /**
     * 
     * @return regresa el tiempo estimado de trabajo. 
     */
    public int getTiempo(){
        return tiempo;
    }

    /**
     * 
     * @return regresa la cantidad total de trabajadores disponibles 
     */
    public int getTrabajadores(){
        return trabajadores;
    }

    /**
     * 
     * @return regresa la cantidad de árboles que crecerán. 
     */
    public String[] getArbolesDispibles(){
        return arbolesDisponibles;
    }

    /**
     * 
     * @return regresa el nombre de la especie de las instancias de la clase arbol, en un ArrayList. 
     */
    public String getArbol(){
        return arbol.getEspecie();
    }
}
