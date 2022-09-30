import java.util.*;
import java.io.*;
public class Compra {
	
	ArrayList<Producto> Carrito = new ArrayList<>();
	
	public Compra() {
		
	}
	
	public void venta()throws IOException
	{
		BufferedReader lector = new BufferedReader(new InputStreamReader(System.in));
		ManejoInventario inv = new ManejoInventario();
		Marca mar = new Marca();
		System.out.println("Ingrese la marca en la que se encuentra interesado");
		String mm;
		mm = lector.readLine();
		mar.listaProductos = inv.buscarMarca(mm);
	}
}
