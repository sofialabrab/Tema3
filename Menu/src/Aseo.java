
public class Aseo extends Producto {

	private String toxicidad;

	public Aseo(String toxicidad )
	{
		super("N/A", "N/A","N/A","N/A",0,0);
		this.toxicidad = toxicidad;
	}
	
	
	public String getToxicidad() {
		return toxicidad;
	}

	public void setToxicidad(String toxicidad) {
		this.toxicidad = toxicidad;
	}
	
}
