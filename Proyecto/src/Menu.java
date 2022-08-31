import java.io.*;
import java.util.*;


public class Menu {

	public static void main(String[] args)throws IOException{
	
		ArrayList <Marca> listaMarca = new ArrayList<>();
    ArrayList <Producto> productos = new ArrayList<>();
    
    HashMap <String, Marca>  mapaMarcas = new HashMap();
    
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
          if(op == 1)
            Agregar(mapaMarcas,productos);
          	break;
            
        }
        case 2:
        {
          //if(op == 2)
        	Mostrar(mapaMarcas, productos);
            break;
        }
        
        case 3:
        {
          if(op == 3)
            System.out.println("Paso a 3");
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
	
	public static void Agregar(HashMap <String,Marca> mapaMarca, ArrayList <Producto> listaProductos) throws IOException
  {
    BufferedReader lector = new BufferedReader(new InputStreamReader(System.in)) ;
    //verificar si esta la marca
    String esMarca;
    boolean flag = false;
    System.out.println("¿De que marca es su producto?");
    System.out.println("Por favor escribalo en minúscula");
    esMarca = lector.readLine();

   
    Marca m1 = new Marca(esMarca);
    

    //esta = contains(esMarca);
    //marca.contains(esMarca);
    //Si retorna false, es porque no está
    Marca mm = mapaMarca.get(esMarca);
    //Producto p = new Producto("jamon","carne","1kg","colun",10,1);
    Producto p = new Producto("", "", "","", 0, 0);

    if (mm != null)
    {
    	Agregar(mapaMarca, listaProductos,p);
    	mm.agregarProducto(p);
    }
    else
    {
    	Agregar(mapaMarca, listaProductos,p);
    	m1.agregarProducto(p);
    	mapaMarca.put(m1.getNombreMarca(), m1);
      
    }
    
    

   /* for(Marca m : mapaMarca.values())
    {
      System.out.println("Marca: " + m.getNombreMarca());
      m.datosProducto();
        
    }*/
  
}

	public static void Agregar(HashMap <String,Marca> mapaMarca, ArrayList <Producto> listaProductos, Producto p) throws IOException
	{
		BufferedReader lector = new BufferedReader(new InputStreamReader(System.in)) ;

		System.out.println("Ingrese el nombre del producto: ");
		p.setNombre(lector.readLine());
		System.out.println("Ingrese la categoría del producto: ");
		p.setCategoria(lector.readLine());
		System.out.println("Ingrese la marca del producto: ");
		p.setMarca(lector.readLine());
		System.out.println("Ingrese el tamaño del producto: ");
		p.setTamaño(lector.readLine());
		System.out.println("Ingrese el precio del producto: ");
		p.setPrecio(Integer.parseInt(lector.readLine()));
		System.out.println("Ingrese el stock de producto: ");
		p.setStock(Integer.parseInt(lector.readLine()));

		
	}

	public static void Mostrar(HashMap <String,Marca> mapaMarca, ArrayList <Producto> listaProductos) throws IOException
  {
		BufferedReader lector = new BufferedReader(new InputStreamReader(System.in)) ;
	    for(Marca m : mapaMarca.values())
	    {
	      System.out.println("Marca: " + m.getNombreMarca());
	      m.datosProducto();
	        
	    }
 

	}


	
}