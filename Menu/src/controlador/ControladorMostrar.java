package controlador;

import java.io.IOException;

import Vista.ventanaMostrar;
import modelo.*;

public class ControladorMostrar {
	
	ventanaMostrar ventana ;
	
	public ControladorMostrar(ventanaMostrar v)
	{
		this.ventana = v;
		
	}
	
	public void botonMostrarTodo() throws NoregistroException, IOException, FallaingresoException {
		System.out.println("Se ejecuto el evento mostrar todo");
		
		ManejoInventario db = new ManejoInventario();
		
		db.Mostrar();
		
		
	}
	public void botonMostrarAlimento() throws NoregistroException, IOException, FallaingresoException {
		System.out.println("Se ejecuto el evento mostrar alimentos");
		
		ManejoInventario db = new ManejoInventario();
		
		db.mostrarAlimentos();
		
		
	}
}
