package und5.relacion2.ejercicio3;

public class Producto {
    private String id;
    private String nombre;
    private String descripcion;
    private double precio;
    private int cantidadStock;

    public Producto(String id, String nombre, String descripcion, double precio, int cantidadStock) {
        this.id = id;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.precio = precio;
        this.cantidadStock = cantidadStock;
    }

    public Producto() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public double getPrecio() {
        return precio;
    }

    public boolean setPrecio(double precio) {
        boolean precioCorrecto=true;
        if (precio<0) {
            precioCorrecto=false;
        }
        return precioCorrecto;
    }

    public int getCantidadStock() {
        return cantidadStock;
    }

    public void setCantidadStock(int cantidadStock) {
        this.cantidadStock = cantidadStock;
    }

    @Override
    public String toString() {
        return "Producto id:" + id + ", " + nombre + ", descripcion:" + descripcion + ", precio:" + precio
                + "€, cantidadStock:" + cantidadStock + "UNDS. \n";
    }
}
