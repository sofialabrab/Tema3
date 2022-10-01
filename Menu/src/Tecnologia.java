
public class Tecnologia extends Producto {

	private int generacion;
	private int  alto;
	private int ancho;
	
	public Tecnologia( int alto , int ancho, int generacion)
	{
		super("N/A", "N/A","N/A","N/A",0,0);
		this.alto = alto;
		this.ancho = ancho;
		this.generacion = generacion;
	}
	public int getGeneracion() {
		return generacion;
	}
	public void setGeneracion(int generacion) {
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
