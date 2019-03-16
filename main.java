import java.util.List;
import java.util.ArrayList;
import java.io.*;
import java.util.*;
import java.util.Date;
import java.util.ArrayList;
import java.io.ObjectOutputStream;
import java.io.ObjectInputStream;
import java.io.FileOutputStream;
import java.io.FileInputStream;
import java.io.Serializable;

public class main implements Serializable {
   public static void main(String args[]) throws Exception{

    FileOutputStream outFile = new FileOutputStream("Factura.dat",true);
    ObjectOutputStream out = new ObjectOutputStream(outFile);

    Compra c = new Compra();
    Console sc = System.console();
    Scanner s = new Scanner(System.in);
    String nombre;
    int age; //int numero = Integer.parseInt (br.readLine());
    String gender;
    Boolean mantener = true;
    int opcion = 0;
    List<String> lista = new ArrayList<String>(); //Aqui se carga el array del producto
    List<Producto> pr = new ArrayList<Producto>(); //Aqui se carga el array del producto
    Person p = new Person();

   try {

//Aquí se obtendran los datos del comprador, nombre, edad, sexo.
    System.out.println("Bienvenido. Escriba su nombre: ");
    nombre = sc.readLine();
    c.setPer(nombre);
    System.out.println("Escriba su edad: ");
    age = Integer.parseInt (sc.readLine());
    c.setPer(age);
    System.out.println("Genero del comprador: ");
    gender = sc.readLine();
    c.setPer(gender);
    pr = traerproductos();
    lista = transformers(pr);
    int v = lista.size();

    while(mantener) {
        System.out.println("--------**-------**--------**----------**----------**-----------**---------**----------**-------**-------**-------**-------**");
        System.out.println("Este es el listado de productos. Elija cada producto por su numero, o si por el contrario quiere salir, introduzca el nº 100.");
        System.out.println("______________________________________________________________________________________________________________________________");
        for(int i = 0; i < v; i++){
            System.out.println(lista.get(i));
        }
        opcion = s.nextInt();
        if (opcion != 100){
            c.setPr(pr.get(opcion));
}
            else{
                mantener = false;
            }
        
    }
        List<Producto> m = new ArrayList<Producto>();
        m = c.getPr();
        v = m.size();
        Date fecha = new Date();
        int contador;
        Integer entero;


        System.out.println("Usted ha realizado la compra de los siguientes productos");
        System.out.println(" ");
        for(int i = 0; i < v; i++){
         System.out.println(m.get(i).getNombre());
         System.out.println("Precio €: " + m.get(i).getPrecio());
         System.out.println(" ");
         entero = Integer.valueOf(m.get(i).getPrecio());
         out.writeObject(c);       
        }

         System.out.println("Fecha en la que se ha efectuado la compra: " + fecha);
         ;
         

    }
    catch (IOException e) {
            System.out.println("Error de entrada y salida.");
   
        }



   }

public static ArrayList<Producto> traerproductos(){

        File archivo = null;
        FileReader fr = null;
        BufferedReader br = null;
        String producto;
        Producto pr = new Producto();
        String[] corte;
        ArrayList<Producto> pre = new ArrayList<Producto>();
        BufferedReader teclado = new BufferedReader(new InputStreamReader(System.in));
        

        try {
            
            archivo = new File("file.txt");

            fr = new FileReader(archivo);
            br = new BufferedReader(fr);
  
            while ((producto = br.readLine()) != null) {
                corte = producto.split(";");
                if(corte.length != 0){
                    pr = new Producto(corte[0],corte[1],corte[2],corte[3],corte[4]);
                    pre.add(pr);
            }

            }

        } catch (IOException e) {
            System.out.println("Error de entrada y salida.");
   
        }
        return pre;
    }

public static ArrayList<String> transformers(List<Producto> ab){
    int v = ab.size();
    ArrayList<String> listado = new ArrayList<String>();
    String uff;
    for(int i = 0; i < v; i++){
        uff = ab.get(i).getNombre();

        listado.add(uff);
    }
return listado;

}

}
