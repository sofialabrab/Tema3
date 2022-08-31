import java.io.*;
import java.util.ArrayList;

public class Inventario {

	public static void main(String[] args)throws IOException {
	
		ArrayList marca = new ArrayList();
    ArrayList productos = new ArrayList();
    int op, sig = 1;
    BufferedReader lector = new BufferedReader(new InputStreamReader(System.in)) ;
    System.out.println("---MENÚ---");
    System.out.println("1.- Agregar producto");
    System.out.println("2.- Buscar producto");
    System.out.println("3.- Importar producto");
    System.out.println("4.- Mostrar producto");
    System.out.println("5.- Buscar producto");
    System.out.println("Seleccione una opción");
    op = Integer.parseInt(lector.readLine());
    while(sig == 1 )
    {
      switch(op)
      {
        case 1:
        {
          
            Agregar(marca, productos);
            break;
          
            
        }
        case 2:
        {
         
            Buscar(marca);
            break;
            
        }
        
        case 3:
        {
         
            System.out.println("Paso a 3");
            break;
        }
  
        case 4:
      }
      System.out.println("¿Desea realizar otra operación");
      System.out.println("1.- SI | 2.- NO");
      sig = Integer.parseInt(lector.readLine());
      if(sig != 1)
      {
        System.out.println("Operación Finalizada");
      }
      else
      {
        System.out.println("Ingrese la operación");
        op = Integer.parseInt(lector.readLine());
      }
        
        
      
    }
	}
	
	public static void Agregar(ArrayList marca, ArrayList productos) throws IOException
  {
    BufferedReader lector = new BufferedReader(new InputStreamReader(System.in)) ;
    //verificar si esta la marca
    String esMarca;
    System.out.println("¿De que marca es su producto?");
    System.out.println("Por favor escribalo en minúscula");
    esMarca = lector.readLine();
    //esta = contains(esMarca);
    //marca.contains(esMarca);
    //Si la lista es null se agrega
    if(marca.contains(esMarca) == false)
    {
      marca.add(esMarca);//funciona
      //Agregar productos
    }
    else
    {
      //Agregar Productos
    }

	}

	public void Eliminar(){
		
		
	}
	public void Importar(){
		
		
	}
	public void Exportar(){
		
		
	}
	public static void Buscar(ArrayList marca) throws IOException
  {
    BufferedReader lector = new BufferedReader(new InputStreamReader(System.in)) ;
		String esMarca;
    String marcaBuscada;
    int index;

    System.out.println("¿Que marca desea buscar?");
    System.out.println("Por favor escribalo en minúscula");
    esMarca = lector.readLine();
    //Busca el index de la posicion de la marca
    index = marca.indexOf(esMarca) ;
    if(index == -1)
    {
      System.out.println("Esta marca no existe"); 
    }
    else
    {
      //Busca la marca asociada al index obtenido
      marcaBuscada = (String) marca.get(index);
      //Escribo la marca 
      System.out.println("Marca: "  + marcaBuscada);
    }
   

	}
	public void Mostrar(){
		
	}
}