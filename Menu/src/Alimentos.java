public class Alimentos extends Producto {
	
	private String fechaElaboracion;
	private String fechaVencimiento;
	
	
	public Alimentos(String nombre, String categoria, String tamaño,String marca,int stock,int precio,String fechaElaboracion, String fechaVencimiento)
	{
		super(nombre, categoria,tamaño,marca,stock,precio);
		this.fechaElaboracion = fechaElaboracion;
		this.fechaVencimiento = fechaVencimiento;
		//fechaElaboracion = "";
		//fechaVencimiento = "";
	}
	public Alimentos()
	{
		super();
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