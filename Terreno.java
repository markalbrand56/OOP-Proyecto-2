public class Terreno {
    protected String tipo_de_terreno;
    protected int area_de_terreno;
    protected String tipo_de_semilla;
    protected int cantidad_de_semillas;
    protected int tiempo;
    protected int workers;

    public Terreno(int area_de_terreno, int tiempo, int workers){
        this.area_de_terreno = area_de_terreno;
        this.tiempo = tiempo;
        this.workers = workers;
    }

    //
    public int calc_semilla(){
        return 0;
    }
    //

    public int calc_tiempo(){
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

    public int getWorkers(){
        return workers;
    }
}
