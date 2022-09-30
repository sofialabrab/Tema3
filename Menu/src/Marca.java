 import java.io.*;
import java.util.ArrayList;

public class Marca {


  private String nombreMarca;
  private int cantProductos;
  public ArrayList<Producto> listaProductos;
  //public ArrayList<Producto> todosProductos = new ArrayList();

  public Marca()
  {
	  
  }
  public Marca(String nombreMarca) {
    this.nombreMarca = nombreMarca;
    this.cantProductos = 0;
    listaProductos = new ArrayList();
  }

  public Marca(String nombreMarca, int cantProductos) {
    this.nombreMarca = nombreMarca;
    this.cantProductos = cantProductos;
    listaProductos = new ArrayList();
  }

  public Marca(String nombreMarca, int cantProductos, ArrayList aa) {
    this.nombreMarca = nombreMarca;
    this.cantProductos = cantProductos;
    listaProductos = new ArrayList();
    listaProductos.addAll(aa);
  }

  public Marca(ArrayList<Producto> listaProductos) {
    listaProductos = new ArrayList();
  }

  public String getNombreMarca() {
    return nombreMarca;
  }

  public void setNombreMarca(String nombreMarca) {
    this.nombreMarca = nombreMarca;
  }

  public int getCantProductos() {
    return cantProductos;
  }

  public void setCantProductos(int cantProductos) {
    this.cantProductos = cantProductos;
  }

  public void agregarProducto(Producto producto) {

    this.listaProductos.add(producto);
    //this.todosProductos.add(producto);
    this.cantProductos += 1;

  }

  // Muestra todas las marcas y sus productos
  public void mostrarPor() {

    for (Producto m : listaProductos) {
      System.out.println("Nombre Producto: " + m.getNombre());
      System.out.println("Categoria: " + m.getCategoria());
      System.out.println("Tamaño: " + m.getTamaño());
      System.out.println("Stock:  " + m.getStock());
      System.out.println("Precio: " + m.getPrecio());
      System.out.println("------------------------------");
    }
  }

  // Muestra los productos de solo una marca
  public void mostrarPor(ArrayList lista)
  {
    for (Producto m : listaProductos) 
    {
      System.out.print("Nombre Producto: " + m.getNombre());
      System.out.println(", Categoría: " + m.getCategoria());
    }
  }
 /* public void modificarProducto()throws IOException
	{
		//ArrayList<Marca> listaProductos = new ArrayList<>();
		BufferedReader lector = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Ingrese la marca de el producto a modificar");
		ManejoInventario inv = new ManejoInventario();
		String mar;
		String pr;
		mar = lector.readLine();
		listaProductos = inv.buscarMarca(mar);
		if(listaProductos == null)
		{
			System.out.println("Esta marca no esta registrada");
			return;
			
		}
		System.out.println("Ingrese el nombre del producto");
		pr = lector.readLine();
		for(int i = 0; i < todosProductos.size(); i++)
		{
			Producto producto = (Producto)listaProductos.get(i);
			
			if(producto.getNombre().equals(pr))
			{
				System.out.println("¿Que desea modificar?");
				System.out.println("1.- Nombre");
				System.out.println("2.- Categoria");
				System.out.println("3.- Tamaño");
				System.out.println("4.- Precio");
				System.out.println("5.- Stock");

				
				int modificar; 
				modificar = Integer.parseInt(lector.readLine());
				switch(modificar)
				{
				case 1:
				{
					producto.setNombre(lector.readLine());
					return;
				
				}
				case 2:
				{
					producto.setCategoria(lector.readLine());
					return;
				
				}
				case 3:
				{
					producto.setTamaño(lector.readLine());
					return;
				}
				case 4:
				{
					producto.setPrecio(Integer.parseInt(lector.readLine()));
					return;
				
				}
				case 5:
				{
					producto.setStock(Integer.parseInt(lector.readLine()));
					return;
				}
					
				
			}
			
			System.out.println("Este producto no esta registrado");
			return;
		}
			
	}
	public void eliminarProducto()throws IOException
	{
		BufferedReader lector = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Ingrese la marca de el producto a eliminar");
		ManejoInventario inv = new ManejoInventario();
		String mar;
		String pr;
		mar = lector.readLine();
		//listaProductos = inv.buscarMarca(mar);
		//if(listaProductos == null)
		//{
			//System.out.println("Esta marca no esta registrada");
			//return;
			
	//	}
		System.out.println("Ingrese el nombre del producto");
		pr = lector.readLine();
		for(int i = 0; i < listaProductos.size(); i++)
		{
			Producto producto = (Producto)listaProductos.get(i);
			
			if(producto.getNombre().equals(pr))
			{
				 listaProductos.remove(i);
				 return;
			}
		}
		System.out.println("Este producto no esta registrado");
		return;
	}*/
	public Producto obtenerProducto(String nombre)
	{
		for(int i = 0; i < listaProductos.size(); i++)
		{
			Producto producto = (Producto)listaProductos.get(i);
			
			if(producto.getNombre().equals(nombre))
			{
				 return producto;
			}
		}
		return null;
	}
	
	public void eliminarProducto(Producto pp)
	{
		listaProductos.remove(pp);
		
	}
 

}