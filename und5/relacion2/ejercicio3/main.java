package und5.relacion2.ejercicio3;

public class main {
    public static void main(String[] args) {
        Producto producto1 = new Producto("A1", "SSD", "almacenar memoria", 25.60, 5);
        Producto producto2 = new Producto("A2", "Tarjeta Grafica", "para jugar", 150.99, 2);
        Supermercado Coviran = new Supermercado();

        System.out.println(producto1.getCantidadStock());
        System.out.println(producto2.getDescripcion());
        System.out.println(producto1.setPrecio(20));
        
        // if (!producto1.setPrecio(20)) {
        //     System.out.println("Error al cambiar el precio");
        // } else {
        //     producto1.setPrecio(20);
        // }

        System.out.println(producto1.getPrecio());

        Coviran.agregarArticulo(producto2);
        Coviran.agregarArticulo(producto1);
        System.out.println(Coviran);
        Coviran.venderArticulo(producto2, 1);
        System.out.println(Coviran);
    }
}
