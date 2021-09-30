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


}
