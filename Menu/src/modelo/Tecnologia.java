package modelo;
public class Tecnologia extends Producto {

	private String generacion;
	private int  alto;
	private int ancho;
	
	public Tecnologia(String nombre, String categoria, String tamaño,String marca,int stock,int precio,int alto , int ancho, String gen)
	{
		super(nombre, categoria,tamaño,marca,stock,precio);
		this.alto = alto;
		this.ancho = ancho;
		this.generacion = gen;
	}
	public String getGeneracion() {
		return generacion;
	}
	public void setGeneracion(String generacion) {
		this.generacion = generacion;
	}
	public int getAlto() {
		return alto;
	}
	public void setAlto(int alto) {
		this.alto = alto;
	}
	public int getAncho() {
		return ancho;
	}
	public void setAncho(int ancho) {
		this.ancho = ancho;
	}
	
}
