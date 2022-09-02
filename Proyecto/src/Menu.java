import java.io.*;
import java.util.*;

public class Menu {

  public static void main(String[] args) throws IOException {

    // ArrayList <Marca> listaMarca = new ArrayList<>();
    ArrayList<Producto> productos = new ArrayList<>();
    HashMap<String, Marca> mapaMarcas = new HashMap<>();

    int opMostrar, sig = 1, ini = 0;
    int op = 0;
    BufferedReader lector = new BufferedReader(new InputStreamReader(System.in));
    
    //Se agregan datos iniciales
    Agregar(mapaMarcas, productos, ini);
    //asignacion para que despues agregar sea manual 
    ini = 1;
    System.out.println("---MENÚ---");
    System.out.println("1.- Agregar producto");
    System.out.println("2.- Mostrar productos");
    System.out.println("3.- Importar producto");
    System.out.println("4.- Buscar producto");
    System.out.println("Seleccione una opción");
    op = Integer.parseInt(lector.readLine());
    

    while (sig == 1) {
      switch (op) {
        case 1: {
          if (op == 1)
            Agregar(mapaMarcas, productos, ini);
          break;

        }
        case 2: {
         
          Mostrar(mapaMarcas, productos);
          break;
        }

      }

      System.out.println("¿Desea realizar otra operación");
      System.out.println("1.- SI | 2.- NO");
      sig = Integer.parseInt(lector.readLine());
      if (sig != 1) {
        System.out.println("Operación Finalizada");
      } else {
        System.out.println("Ingrese la operación");
        op = Integer.parseInt(lector.readLine());
      }
    }
  }

  public static void Agregar(HashMap<String, Marca> mapaMarca, ArrayList<Producto> listaProductos, int ini) throws IOException {
    BufferedReader lector = new BufferedReader(new InputStreamReader(System.in));
    
    String esMarca;
    boolean flag = false;

    if(ini == 0)
    {
    	//Se añaden datos iniciales
    	Producto p1 = new Producto("leche chocolate", "lacteo", "200 ml", "colun", 6, 390);
    	Marca varMarca = new Marca("colun");
    	varMarca.agregarProducto(p1);
    	mapaMarca.put(varMarca.getNombreMarca(), varMarca);
    	
    	Producto p2 = new Producto("jabon liquido", "aseo personal", "200 ml", "nivea", 3, 1200);
    	varMarca = new Marca("nivea");
    	varMarca.agregarProducto(p2);
    	mapaMarca.put(varMarca.getNombreMarca(), varMarca);
    }
    else
    {
    	//Se añaden productos manuales
    	 	System.out.println("¿De que marca es su producto?");
    	    System.out.println("Por favor escribalo en minúscula");
    	    esMarca = lector.readLine();
    	    Marca varMarca = new Marca(esMarca);


    	    // Buscamos si la marca esta en el mapa
    	    Marca marcBusc = mapaMarca.get(esMarca);
    	    
    	    // Inicializar variables productos
    	    Producto p = new Producto("", "", "", "", 0, 0);
    	    
    	    if (marcBusc != null) {
    	      // agregar productos
    	      Agregar(mapaMarca, listaProductos, p);
    	      marcBusc.agregarProducto(p);
    	    }
    	    // Si la marca leida no se encontraba dentro del mapa, se agrega p a la varib
    	    else {
    	      // agregar productos
    	      Agregar(mapaMarca, listaProductos, p);
    	      varMarca.agregarProducto(p);
    	      mapaMarca.put(varMarca.getNombreMarca(), varMarca);

    	    }
    }

   
  }

  public static void Agregar(HashMap<String, Marca> mapaMarca, ArrayList<Producto> listaProductos, Producto p)
      throws IOException {
    BufferedReader lector = new BufferedReader(new InputStreamReader(System.in));

    // Guarda los atributos del producto
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

  // Mostrar por marca los productos
  public static void Mostrar(HashMap<String, Marca> mapaMarca, ArrayList<Producto> listaProductos) throws IOException {
	  
    boolean existe = false;
    BufferedReader lector = new BufferedReader(new InputStreamReader(System.in));
    System.out.println("Opción 1. Mostrar productos de una Marca");
    System.out.println("Opción 2. Mostrar todos los productos");
    System.out.println("Ingrese número de su opción (1 o 2)");
    int opMostrar = Integer.parseInt(lector.readLine());

    if (opMostrar == 1) 
    {
      System.out.println("Ingrese la marca de los productos que desea mostrar: ");
      String marcaElegida = lector.readLine();
      ArrayList<Producto> listaMarcaElegida = new ArrayList<>() ;
      Marca m = new Marca(marcaElegida);
      
      if (mapaMarca.containsKey(marcaElegida) == true) 
      {   
        m = mapaMarca.get(marcaElegida);
        listaMarcaElegida = m.getStringList();
        m.mostrarPor(listaMarcaElegida);
      } 
      else {

        System.out.println("Esta marca no está registrada");
        return;
      }

    } 
    else 
    {
      for (Marca m : mapaMarca.values()) {
       
        System.out.println("Marca: " + m.getNombreMarca());
        m.mostrarPor();
      }
    }
  }
}