package arboles;

public class Arbol {
    protected double diametro;  // Cuánto espacio ocupa un solo árbol
    protected String especie;  // Nombre

    public Arbol(int diametro, String nombre){
        this.diametro = diametro;
        this.especie = nombre;
    }

    public double getDiametro(){
        return diametro;
    }

    public String getEspecie(){
        return especie;
    }
}
