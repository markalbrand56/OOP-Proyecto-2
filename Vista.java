/***************************************************
Vista.java
Autor: Diego Morales, Jimena Hernandez, Mark Albrand, Javier Azurdia
Fecha: 19/09/2021

Vista. Responsable de toda interaccion con el usuario.
***************************************************/
import java.util.Scanner;
import java.util.ArrayList;
import java.util.InputMismatchException;
public class Vista{
  private Scanner scan;
  public Vista(){
		scan = new Scanner(System.in);
	}
  /*Metodo para elegír una opción
  @return número de opción
  */
  public int menuOpciones(){
    int op=0;
        try{
      String s = "¿Que desea hacer?\n" +
          "1. Calcular datos de reforestación para un area\n" +
          "2. Ver áreas registradas\n" +
          "3. Guardar datos\n" +
          "4. Salir";

    System.out.println(s);
    op = scan.nextInt();
  }catch (Exception e){
        scan.next();
    }
    return op;
  }

 /*Metodo para ingresar ancho y largo de terreno
  @return array con ancho y largo del terreno
  */
  public int[] size(){
    int[] medidas=new int[2]; 
    try {
      System.out.println("Ingrese el ancho del terreno");
      int ancho=scan.nextInt(); 
      System.out.println("Ingrese el largo del terreno");
      int largo=scan.nextInt(); 
      medidas[0]=ancho; 
      medidas[1]=largo; 
    } catch (Exception e) {
      scan.next();
    }

    return medidas; 
  }

   /*Metodo para ingresar el tipo de terreno
  @return tipo de suelo
  */
  public String TipodeSuelo(){
    String Tipo_suelo="";
     try {
      System.out.println("Ingrese el tipo de terreno");
      Tipo_suelo=scan.nextLine(); 
     } catch (Exception e) {
      scan.next();
     }
    return Tipo_suelo; 
  }

     /*Metodo para ingresar el número de trabajadores disponibles
  @return trabajadores
  */
  public int trabajadores(){
    int trabajadores=0;
     try {
      System.out.println("Ingrese eel número de trabajadores disponibles");
      trabajadores=scan.nextInt(); 
     } catch (Exception e) {
      scan.next();
     }
    return trabajadores; 
  }

    /**
    * @param: String
    * imprime mensajes
    **/ 
    public void mensaje(String mensaje){
      System.out.println(mensaje);
  }

      /**
    * @param: Arraylist<String>
    * imprime mensajes en Arraylist de cadena
    **/ 
    public void mensaje(ArrayList<String> mensajearray){
      for (int i = 0; i<mensajearray.size(); i++){
          System.out.println(mensajearray.get(i));
      }
      
  }

  public void despedida(){
		System.out.println("Gracias por usar este programa, adios");
	}
	/*Metodo para mostrar mensaje de bienvenida al usuario
	*/
	public void bienvenida(){
		System.out.println("Bienvendi@!");
	}


}
