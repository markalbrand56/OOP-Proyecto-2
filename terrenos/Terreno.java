package terrenos;

public class Terreno {
    protected String tipo_de_terreno;
    protected int area_de_terreno;
    protected String tipo_de_semilla;
    protected int cantidad_de_semillas;
    protected int tiempo;
    protected int trabajadores;
    protected int conversion, espaciofinal;
    protected String[] arbolesDisponibles;
    

    public Terreno(int area_de_terreno, int trabajadores){
        this.area_de_terreno = area_de_terreno;
        this.trabajadores = trabajadores;
    }

    //
    public int calc_semilla(int espacio_entresemillas){
        return 0;
    }
    //

    public int calc_tiempo(){//Revisar
        return 0;
    }

    public String getTipoDeTerreno(){
        return tipo_de_terreno;
    }

    public int getAreaDeTerreno(){
        return area_de_terreno;
    }

    public String getTipoDeSemilla(){
        return tipo_de_semilla;
    }

    public int cantidadDeSemilla(){
        return cantidad_de_semillas;
    }

    public int getTiempo(){
        return tiempo;
    }

    public int getTrabajadores(){
        return trabajadores;
    }
    public String[] getArbolesDispibles(){
        return arbolesDisponibles;
    }
}
