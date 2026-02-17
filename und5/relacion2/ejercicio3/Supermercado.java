package und5.relacion2.ejercicio3;

import java.util.ArrayList;

public class Supermercado {

    ArrayList<Producto> articulos;

    public Supermercado(ArrayList<Producto> articulos) {
        this.articulos = articulos;
    }

    public Supermercado() {
        articulos = new ArrayList<>();
    }

    public void agregarArticulo(Producto producto) {
        articulos.add(producto);
    }

    public void venderArticulo(Producto producto, int cantidadComprar) {
        if (articulos.contains(producto)) {
            int cantidadRestante=producto.getCantidadStock()-cantidadComprar;
            if (cantidadRestante>=0) {
                producto.setCantidadStock(cantidadRestante);
            }
        }
    }

    @Override
    public String toString() {
        String inventario = "";
        for (int i = 1; i <= articulos.size(); i++) {
            inventario += "Supermercado --> Articulo " + i + ":" + articulos.get(i - 1) + "\n";
        }
        return inventario;
    }

}
