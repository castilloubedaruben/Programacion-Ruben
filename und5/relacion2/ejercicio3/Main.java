package und5.relacion2.ejercicio3;

public class Main {
    public static void main(String[] args) {
        Producto producto1 = new Producto("A1", "SSD", "almacenar memoria", 25.60, 5);
        Producto producto2 = new Producto("A2", "Tarjeta Grafica", "para jugar", 150.99, 10);
        Supermercado Coviran = new Supermercado();
        Supermercado Mercadona = new Supermercado();

        System.out.println(producto1.getCantidadStock());
        System.out.println(producto2.getDescripcion());
        System.out.println(producto1.setPrecio(20));
        System.out.println(producto1.getPrecio());

        Coviran.agregarArticulo(producto1);
        Coviran.agregarArticulo(producto2);
        Mercadona.agregarArticulo(producto2);
        Coviran.venderArticulo(producto2, 1);
        Coviran.venderArticulo(producto2, 1);
        System.out.println(Coviran);
        System.out.println(Coviran);
    }
}
