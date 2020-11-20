package Logica;
public class Insumos {
    
    int id;
    Double precio;
    String tipo;
    String nombre;

    public Insumos(int id, Double precio, String tipo, String nombre) {
        this.id = id;
        this.precio = precio;
        this.tipo = tipo;
        this.nombre = nombre;
    }

    public int getId() {
        return id;
    }

    public Double getPrecio() {
        return precio;
    }

    public String getTipo() {
        return tipo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    
    
}
