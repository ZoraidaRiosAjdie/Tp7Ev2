 import java.io.DataInputStream;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.ObjectInputStream;
import java.io.FileOutputStream;
import java.io.FileInputStream;

public class Deserialize2 {
	public static void main(String[] args) {
     Person p = null;
     //Compra c = null;
     Producto pr = null;
     try {
      FileInputStream inFile = new FileInputStream("Factura.dat");
      ObjectInputStream in = new ObjectInputStream(inFile);
      p = (Person)in.readObject();
      pr = (Producto)in.readObject();
      in.close();
      inFile.close();

     }
     catch(IOException e)
     {
      System.err.println("ERROR");
     }
     catch(ClassNotFoundException e)
     {
      System.err.println("ERROR");
     }
     System.out.println(p.toString());
     System.out.println(pr.getNombre() + " -- " + pr.getTipo() + " -- " + pr.getPrecio());
  }
}
