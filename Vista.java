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
  private int largoMinimo = 5;
  private int anchoMinimo = 5;

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
        String s = "\n\n¿Que desea hacer?\n" +
          "1. Calcular datos de reforestación para un area\n" +
          "2. Estadísticas\n" + 
          "3. Guardar datos\n" +
          "4. Información de terrenos\n" + 
          "5. Salir";

      System.out.println(s);
      op = scan.nextInt();

      if(op<1 | op>6){
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
  
        if(ancho<=0 | largo<=0 | largo < largoMinimo | ancho < anchoMinimo){
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
  public int tipoDeSuelo(){
    int tipoSuelo=0;
    boolean ingresoCorrecto = false;

    while (ingresoCorrecto != true) {
      try {
        System.out.println("\nElija un tipo de terreno");
        String s = "1. Bosque latifoliado de baja elevación\n" +
        "2. Bosque mixto\n" +
        "3. Bosque latifoliado de altura\n" +
        "4. Bosque fragmentado\n"+
        "5. Bosque manglar\n" +
        "6. Bosque coníferas\n" +
        "7. Monte espinoso\n"; 
        System.out.println(s);
        tipoSuelo=scan.nextInt(); 

        if(tipoSuelo<1 | tipoSuelo > 7){
          throw new InputMismatchException("Ingrese una opción");
        }else{
          ingresoCorrecto = true;
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

  public int arbolesDisponibles(String[] arboles){
    int opcion = 0;
    boolean ingresoCorrecto = false;

    while (ingresoCorrecto != true) {
      try {
        System.out.println("Elija una de las siguientes especies de arboles compatibles con su terreno:");
        for (int i = 0; i < arboles.length; i++) {
          String mensaje = (i+1) + ". " + arboles[i];
          System.out.println(mensaje);
        }
        opcion = scan.nextInt();

        if(opcion<1 | opcion>(arboles.length)){
          throw new InputMismatchException("Elija una opción válida");
        }else{
          ingresoCorrecto = true;
        }
      } catch (InputMismatchException e) {
        scan = new Scanner(System.in);
        System.out.println(e.getMessage());
      }
    }
    return opcion;
  }


  public void informacion(){
    mensaje("Información sobre los tipos de bosques:");
    mensaje("\n 1. Bosque Coniferas: ");
    mensaje("Es un bioma terrestre correspondiente a bosques de coníferas de latitudes medias de clima templado o subalpino, vegetación perennifolia, con veranos cálidos, inviernos fríos y pluviosidad suficiente en donde predominan los árboles gimnospermos o coníferas.");
    mensaje("Las especies de coníferas son las más habituales en este tipo de bosques como su nombre sugiere. Estos árboles suelen tener hojas de superficie dura pero de reducido tamaño. Estos árboles resultan excelentes para reforestar porque son de rápido crecimiento.");
    
    mensaje("\n 2. Bosque fragmentado:");
    mensaje("Transformación de un bosque continuo en muchas unidades más pequeñas y aisladas entre sí, cuya extensión real resultante es mucho menor que la del bosque original");
    mensaje("Los árboles de estos bosques se caractrizan por su gran calidad de madera, y su gran tamaño. Son árboles muy vistosos para los paisajes y de fácil cuidado especialmente cuando conviven con la fauna del lugar.");
    
    mensaje("\n 3. Bosque Latifollado de altura:");
    mensaje("Este tipo de bosque suele estar ubicado a más de 2000 metros de elevación usualmente al norte del país.");
    mensaje("Cuentan con maderas preciosas a nivel nacional e internacional, como el roble o el encino. Estas árboles están en peligro, por lo que reforestarlos ayuda a la conservación de este tipo de bosques tan importantes del país.");
    
    mensaje("\n 4. Bosque latifollado de baja elevación:");
    mensaje("A diferencia de los bosques de baja elevación, estos se encuentran ubicados a más de 2,000 metros de altura sobre el nivel del mar.");
    mensaje("Estos bosques suelen contener especies que se encuentran actualmente en peligro de extinción. El reforestar este tipo de bosques ayuda de gran manera a la conservación de las especies nativas del país.");
    
    mensaje("\n 5. Bosque Mangalar: ");
    mensaje("Formado por árboles muy tolerantes a las sales existentes en la zona intermareal cercana a la desembocadura de cursos de agua dulce en latitudes tropicales y subtropicales.");
    mensaje("Estos árboles son esenciales en sus ecosistemas, trabajando como barreras en contra de mareas para proteger a la vida salvaje del ecosistema.");

    mensaje("\n 6. Bosque Mixto: ");
    mensaje("Son aquellos bosques que combinan equilibradamente árboles de angiospermas con gimnospermas.");
    mensaje("Sus árboles como se puede esperar son muy variados. Esta variedad da lugar a muchas opciones para la reforestación, donde se pueden usar árboles conocidos como el roble y el encino para una fácil reforestación.");

    mensaje("\n 7. Monte Espinoso: ");
    mensaje("La elevación varía desde el nivel del mar hasta los 300 m de altura. La vegetación natural está constituida mayormente por arbustos y plantas espinosas.");
    mensaje("Sus árboles suelen ser bastante capaces de resistir climas medianamente áridos, por lo que los cuidados de dichos árboles suelen ser más fáciles haciendo así más eficiente el proceso de reforestación de estos bosques.");
  }
}
