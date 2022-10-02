package modelo;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.io.*;
public class Producto {
	
	private String nombre;
	private String categoria;
	private String tamaño;
	private String marca;
	private int stock;
	private int precio;
	//private ArrayList<Marca> productos = new ArrayList<>();
	
	public Producto(String nombre,String categoria,String tamaño,String marca, int stock, int precio)
	{
		this.nombre = nombre;
		this.categoria= categoria;
		this.tamaño = tamaño;
		this.marca = marca;
		this.stock = stock;
		this.precio = precio;	
	}
	public Producto(){
	    
	}
	
	
	public String getNombre() 
	{
		return nombre;
		
	}
	public void setNombre(String nombre) 
	{
		this.nombre = nombre;
		
	}	
	
	public void intento()
	{
		
	}
	
	
	public String getCategoria() 
	{
		return categoria;
		
	}
	public void setCategoria(String categoria) 
	{
		this.categoria = categoria;
		
	}
	
	public int getStock() 
	{
		return stock;
		
	}
	public void setStock(int stock) 
	{
		this.stock = stock;
		
	}
	
	public String getTamaño() 
	{
		return tamaño;
		
	}
	public void setTamaño(String tamaño) 
	{
		this.tamaño = tamaño;
		
	}
	
	
	public String getMarca() 
	{
		return marca;
		
	}
	public void setMarca(String marca) 
	{
		this.marca = marca;
		
	}
	public int getPrecio() 
	{
		return precio;
		
	}
	public void setPrecio(int precio) 
	{
		this.precio = precio;
		
	}	
	

}