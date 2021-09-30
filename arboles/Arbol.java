package arboles;

public class Arbol {
    protected int diametro;  // Cuánto espacio ocupa un solo árbol
    protected String especie;  // Nombre

    public Arbol(int diametro, String nombre){
        this.diametro = diametro;
        this.especie = nombre;
    }

    public int getDiametro(){
        return diametro;
    }

    public String getEspecie(){
        return especie;
    }
}
