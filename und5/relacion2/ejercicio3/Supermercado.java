package und5.relacion2.ejercicio3;

import java.util.ArrayList;

public class Supermercado {

    ArrayList<Producto> articulos;

    public Supermercado(ArrayList<Producto> articulos) {
        this.articulos = articulos;
    }

    public void agregarArticulo(Producto producto) {
        articulos.add(producto);
    }

    public void venderArticulo(Producto producto, int cantidadComprar) {
        cantidadComprar=0;
        if (producto.getCantidadStock()>0) {
            producto.setCantidadStock(cantidadComprar-producto.getCantidadStock());
        }
    }

    @Override
    public String toString() {
        String inventario="";
        for (Producto articulo : articulos) {
            inventario="Supermercado --> articulos:" + articulo(i) + "]";
        }
        return "Supermercado --> articulos:" + articulos + "]";
    }

    
}
