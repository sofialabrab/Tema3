
public class Alimentos extends Producto {
	
	private String fechaElaboracion;
	private String fechaVencimiento;
	
	
	public Alimentos()
	{
		super("N/A", "N/A","N/A","N/A",0,0);
		fechaElaboracion = "";
		fechaElaboracion = "";
	}
	public String getFechaElaboracion() 
	{
		return fechaElaboracion;
		
	}
	public void setFechaElaboracion(String fechaElaboracion) 
	{
		this.fechaElaboracion = fechaElaboracion;
		
	}	

	public String getFechaVencimiento() 
	{
		return fechaVencimiento;
		
	}
	public void setFechaVencimiento(String fechaVencimiento) 
	{
		this.fechaVencimiento = fechaVencimiento;
		
	}	

}
