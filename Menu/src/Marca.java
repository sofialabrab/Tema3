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
      System.out.println(", Precio: " + m.getPrecio());
      
    }
  }
 
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
		//throw new NoregistroException();
		return null;
	}
	
	
	public void eliminarProducto(Producto pp)
	{
		
		listaProductos.remove(pp);
			
	}
 

}