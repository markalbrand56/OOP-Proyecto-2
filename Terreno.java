import terrenos.Terreno;

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
}
