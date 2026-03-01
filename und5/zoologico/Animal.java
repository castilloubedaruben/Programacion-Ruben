package und5.zoologico;

public class Animal {
    private String nombre;
    private String codigo;
    private int cantidad;
    private double precio;

    private static int codigoNumerico = 1;

    private void generadorCodigoAnimales() {
        String prefijoCodigo = "A-";
        codigo = prefijoCodigo + codigoNumerico;
        codigoNumerico++;
    }

    public Animal(String nombre, int cantidad, double precio) {
        this.nombre = nombre;
        generadorCodigoAnimales();
        setCantidad(cantidad);
        setPrecio(precio);
    }

    public String getNombre() {
        return nombre;
    }

public void setNombre(String nombre) {
    if (nombre != null && !nombre.trim().isEmpty()) {
        this.nombre = nombre.trim(); 
    } else {
        this.nombre = "VACIO"; 
    }
}

    public String getCodigo() {
        return codigo;
    }

    private void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        if (cantidad >= 0) {
            this.cantidad = cantidad;
        }
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        if (precio > 0) {
            this.precio = precio;
        }
    }

    @Override
    public String toString() {
        return "\nCódigo: " + codigo + " | Nombre: " + nombre + " | Cantidad: " + cantidad + " | Precio:" + precio
                + "€. \n";
    }

}
