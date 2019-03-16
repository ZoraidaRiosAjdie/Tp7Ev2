import java.util.List;
import java.util.ArrayList;
import java.io.Serializable;

public class Compra implements Serializable {
  private Person per;
  private List<Producto> pr;
  private int cant;
  public Compra() {
    // constructor por defecto
    per = new Person();
    pr = new ArrayList<Producto>();
    cant = 0;

  }
  public void setPer(String name) {
    per.setName(name);

  }
  public void setPer(int age){
    per.setAge(age);
  }
  
  public void setPr(Producto pr1) {
    //var pr1 = new Producto();
    //pr1.setColor(color);
    //pr1.setTipo(tipo);
    //pr1.setPeso(peso);
    //pr1.setNombre(nombre);
    pr.add(pr1);
  }

  
  public void setCant(int cant) {
    this.cant = cant;
  }
  public Person getPer() {
    return per;
  }

  public List<Producto> getPr() {
    return pr;
  }
  
  public int getCant() {
    return cant;
  }
  public void vaciar_carrito(){
    pr = new ArrayList<Producto>();

  }
}


