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
        if (producto.getCantidadStock()>0) {
            producto.setCantidadStock(producto.getCantidadStock()-cantidadComprar);
        }
    }

    @Override
    public String toString() {
        String inventario="";
        int contador =0;
        for (Producto articulo : articulos) {
            inventario+="Supermercado --> articulo " + contador++ +":" + articulo + "\n";
        }
        return inventario;
    }

    
}
