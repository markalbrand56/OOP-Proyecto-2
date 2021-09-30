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
  private Scanner scan = new Scanner(System.in);

  public Vista(){
		System.out.println("\n\nBienvenido\n\n");;
	}
  /*Metodo para elegír una opción
  @return número de opción
  */
  public int menuOpciones(){
    int op=0;
    boolean ingresoCorrecto = false;

    while (ingresoCorrecto != true) {
      try{
        String s = "¿Que desea hacer?\n" +
          "1. Calcular datos de reforestación para un area\n" +
          "2. Ver áreas registradas\n" +
          "3. Guardar datos\n" +
          "4. Salir";

      System.out.println(s);
      op = scan.nextInt();

      if(op<1 | op>4){
        throw new InputMismatchException("Elija una opción válida.");
      }else{
        ingresoCorrecto = true;
      }

      }catch (InputMismatchException e){
        scan = new Scanner(System.in);
      } 
    }
    return op;
  }

 /*Metodo para ingresar ancho y largo de terreno
  @return array con ancho y largo del terreno
  */
  public int[] size(){
    int[] medidas=new int[2];
    boolean ingresoCorrecto = false;
    
    while (ingresoCorrecto != true) {
      try {
        System.out.println("Ingrese el ancho del terreno");
        int ancho=scan.nextInt(); 
        System.out.println("Ingrese el largo del terreno");
        int largo=scan.nextInt();

        medidas[0]=ancho; 
        medidas[1]=largo; 
  
        if(ancho<=0 | largo<=0){
          throw new InputMismatchException("Ingrese medidas válidas");
        }else{
          ingresoCorrecto = true;
        }
  
      } catch (Exception e) {
        scan = new Scanner(System.in);
      }
    }


    return medidas; 
  }

   /*Metodo para ingresar el tipo de terreno
  @return tipo de suelo
  */
  public int TipodeSuelo(){
    int tipoSuelo=0;
    boolean ingresoCorrecto = false;

    while (ingresoCorrecto != true) {
      int eleccion = 0;
      try {
        System.out.println("\nElija un tipo de terreno");
        /**
         * Despliegue de opciones
         */
        eleccion=scan.nextInt(); 

        switch (eleccion) {
          case 1:
            tipoSuelo = "Suelo ejemplo";
            ingresoCorrecto = true; 
            break;
        
          default:
            tipoSuelo = "Tipo de terreno";
            break;
        }

      } catch (Exception e) {
        scan = new Scanner(System.in);
      }      
    }
    return tipoSuelo; 
  }

     /*Metodo para ingresar el número de trabajadores disponibles
  @return trabajadores
  */
  public int trabajadores(){
    int trabajadores=0;
    boolean ingresoCorrecto = false;

    while (ingresoCorrecto != true) {
      try {
       System.out.println("Ingrese el número de trabajadores disponibles");
       trabajadores=scan.nextInt(); 

       if(trabajadores <= 0){
         throw new InputMismatchException("Elija una cantidad válida de trabajadores");
       }else{
         ingresoCorrecto = true;
       }

      } catch (InputMismatchException e) {
        scan = new Scanner(System.in);
      }
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
