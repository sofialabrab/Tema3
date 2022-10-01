import java.io.*;
import java.util.*;

public class Menu {

  public static void main(String[] args) throws FallaingresoException, NoregistroException, IOException {

    // ArrayList <Marca> listaMarca = new ArrayList<>();
   // ArrayList<Producto> productos = new ArrayList<>();
   // HashMap<String, Marca> mapaMarcas = new HashMap<>();
    ManejoInventario inv = new ManejoInventario();
    ManejoDocumento doc = new ManejoDocumento();
    

    int opMostrar, sig = 1, ini = 0;
   // int op = 0;
    BufferedReader lector = new BufferedReader(new InputStreamReader(System.in));

    inv.leerArchivo(null);
    //Se agregan datos iniciales
    inv.Agregar(ini);
    //asignacion para que despues agregar sea manual 
    ini = 1;
    System.out.println("---MENÚ---");
    System.out.println("1.- Agregar producto");
    System.out.println("2.- Mostrar productos");
    System.out.println("3.- Modificar producto");
    System.out.println("4.- Eliminar producto");
    System.out.println("5.- Buscar producto");
    System.out.println("6.- Filtrar precio");
    System.out.println("7.- Cerrar");
    
    System.out.println("Seleccione una opción");
    /*try {
    	op = Integer.parseInt(lector.readLine());
    }
    catch(Exception e)
    {
    	System.out.println("Dato ingresado no valido");
    }*/

    String op = lector.readLine();
    boolean isNumeric = op.chars().allMatch( Character::isDigit );
    int newop;
    if(isNumeric == true)
    {
    	newop = Integer.parseInt(op);
    }
    else throw new  FallaingresoException();
   
    
    while (sig == 1) {
      switch (newop) {
        case 1: {
          
        	  inv.Agregar(ini);
          break;

        }
        case 2: {

        	inv.Mostrar();
          break;
        }
        case 3: {
        	try {
        		inv.modificarProducto();	
        	}
        	catch(NoregistroException e)
  		  	{
        		System.out.println("Error:" + e.getMessage());
        		
  		  	}
        	catch(FallaingresoException e2)
        	{
        		System.out.println("Error:" + e2.getMessage());
        		
        	}
        	break;
        }
        case 4:
        {
        	try {
        		inv.eliminarProducto();	
        	}
        	catch(NoregistroException e)
  		  	{
        		System.out.println("Error:" + e.getMessage());
  		  	}
        	break;
        	
        	
        }
        case 5:
        {
        	
        }
        case 6:
        {
        	try {
        		
        	inv.filtrar();
        	}catch(FallaingresoException e)
        	{
        		System.out.println("Error:" + e.getMessage());
        	}
        	break;
        	
        }  
        case 7:
        {
        	System.out.println("Programa finalizado" );
        	return;
        }
        

      }
      
      System.out.println("¿Desea realizar otra operación");
      System.out.println("1.- SI | 2.- NO");
      sig = Integer.parseInt(lector.readLine());
      if (sig != 1) {
        System.out.println("Operación Finalizada");
        inv.exportar();
      } else {
        System.out.println("Ingrese la operación");
        newop = Integer.parseInt(lector.readLine());
      }
    }
    
  }
  
  


}