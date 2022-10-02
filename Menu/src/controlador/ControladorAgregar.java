package controlador;

import java.io.IOException;

import Vista.ventanaAgregar;
import modelo.*;

public class ControladorAgregar {
	
	ventanaAgregar ventana ;
	
	public ControladorAgregar(ventanaAgregar v)
	{
		this.ventana = v;
		
		
	}
	
	public void botonAgregar() throws FallaingresoException, IOException {
		System.out.println("Se ejecuto el evento agregar");
		
		
		String nombre = ventana.getNomProducto().getText();
		String categoria = ventana.getTextCategoria().getText();
		String marca = ventana.getTextMarca().getText();
		String tamaño = ventana.getTextTamaño().getText();
		int precio = Integer.parseInt(ventana.getTextPrecio().getText());
		int stock = Integer.parseInt(ventana.getTextStock().getText());
		
		Producto po = new Producto();
		ManejoInventario db = new ManejoInventario();
		po.setNombre(nombre);
		po.setCategoria(categoria);
		po.setMarca(marca);
		po.setTamaño(tamaño);
		po.setPrecio(precio);
		po.setStock(stock);
		
		db.Agregar(po);
		
		System.out.println(nombre+ " " + categoria+ " "  + marca+ " "  + tamaño+ " "  + precio+ " "  + stock);
	}


}
