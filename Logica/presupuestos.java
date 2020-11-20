package Logica;
import java.util.ArrayList;
public class presupuestos {

       ArrayList<Insumos> insumos = new ArrayList<>();
       int id;
       String cliente;
       double precio;

    public presupuestos(int id, double precio, String cliente) {
        this.id = id;
        this.precio = precio;
        this.cliente = cliente;
    }

    public ArrayList<Insumos> getInsumos() {
        return insumos;
    }

    public int getId() {
        return id;
    }

    public double getPrecio() {
        return precio;
    }

    public String getCliente() {
        return cliente;
    }

    public void setInsumos(ArrayList<Insumos> insumos) {
        this.insumos = insumos;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }
       
       
}
