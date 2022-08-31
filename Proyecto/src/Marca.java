import java.io.*;
import java.util.ArrayList;

public class Marca {

  private String nombreMarca;
  private int cantProductos;
  private ArrayList <Producto> listaProductos;

  public Marca () {

    
  }

  public String getMarca () {
    return nombreMarca;
  }

  public void  setMarca (String nombreMarca)
  {
    this.nombreMarca = nombreMarca;
  }

  public int getCantProductos () {
    return cantProductos;
  }

  public void setCantProductos (int cantProductos) {
    this.cantProductos = cantProductos;
  }





  
}