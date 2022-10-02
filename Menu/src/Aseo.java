
public class Aseo extends Producto {

	private String toxicidad;

	public Aseo(String nombre, String categoria, String tamaño,String marca,int stock,int precio,String toxi)
	{
		super(nombre, categoria,tamaño,marca,stock,precio);
		this.toxicidad = toxi;
	}
	
	
	public String getToxicidad() {
		return toxicidad;
	}

	public void setToxicidad(String toxicidad) {
		this.toxicidad = toxicidad;
	}
	
}
