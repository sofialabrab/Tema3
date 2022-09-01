import java.io.*;
import java.util.*;

public class Menu {

  public static void main(String[] args) throws IOException {

    // ArrayList <Marca> listaMarca = new ArrayList<>();
    ArrayList<Producto> productos = new ArrayList<>();

    HashMap<String, Marca> mapaMarcas = new HashMap<>();

    int opMostrar, op, sig = 1;
    BufferedReader lector = new BufferedReader(new InputStreamReader(System.in));
    System.out.println("---MENÚ---");
    System.out.println("1.- Agregar producto");
    System.out.println("2.- Mostrar productos");
    System.out.println("3.- Importar producto");
    System.out.println("4.- Buscar producto");
    System.out.println("Seleccione una opción");
    op = Integer.parseInt(lector.readLine());

    while (sig == 1) {
      switch (op) {
        case 1: {
          if (op == 1)
            Agregar(mapaMarcas, productos);
          break;

        }
        case 2: {
          // if(op == 2)
          System.out.println("Llego a mostrar");
          Mostrar(mapaMarcas, productos);
          break;
        }

      }

      System.out.println("¿Desea realizar otra operación");
      System.out.println("1.- SI | 2.- NO");
      sig = Integer.parseInt(lector.readLine());
      if (sig != 1) {
        System.out.println("Operación Finalizada");
      } else {
        System.out.println("Ingrese la operación");
        op = Integer.parseInt(lector.readLine());
      }
    }
  }