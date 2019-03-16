import java.io.Serializable;

class Producto implements Serializable{

    private String nombre;
    private String color;
    private String tipo;
    private String peso;
    private String precio;
    public Producto() {
         peso = "";
         color = "";
         tipo = "";
         precio = "";
         nombre = "";
    }
    public Producto(String nombre, String color, String peso, String tipo, String precio) {
        this.color = color;
        this.peso = peso;
        this.tipo = tipo;
        this.nombre = nombre;
        this.precio = precio;
    }
    public void setPeso(String p) {
      peso = p;
    }
    public String getPeso() {
      return peso;
    }

    public void setPrecio(String pre) {
      precio = pre;
    }
    public String getPrecio() {
      return precio;
    }
    public void setTipo(String t) {
      tipo = t;
    }
    public void setNombre(String n) {
      nombre = n;
    }
    public String getTipo() {
      return tipo;
    }
    public void setColor(String c) {
      color = c;
    }
    public String getColor() {
      return color;
    }
    public String getNombre() {
      return nombre;
    }
}
