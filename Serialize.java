import java.io.*;
public class Serialize {
  public static void main(String argv[]) {
    Person p = new Person();
    Producto pr = new Producto();
    try {
      FileOutputStream outFile = new FileOutputStream("Factura.dat");
      ObjectOutputStream out = new ObjectOutputStream(outFile);
      out.writeObject(p);
      out.writeObject(pr);
      out.close();
    }
    catch(IOException e)
    {
      System.err.println("ERROR");
      System.err.println("An IOException was caught :"+e.getMessage());
    }
  }
}